package com.simpleflightsearch.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.simpleflightsearch.model.SimpleFlightSearch;
import com.simpleflightsearch.request.SimpleFlightSearchRequest;
import com.simpleflightsearch.service.SimpleFlightSearchService;

@RestController
public class SimpleflightController {
	@Autowired
	private SimpleFlightSearchService simpleFlightSearchService;
	
@GetMapping("/simpleflightsearch/{origin}/{destination}/{date}")
public ResponseEntity searchByOriginDestinationDate(@PathVariable String origin,@PathVariable String destination,@PathVariable String date) throws JsonParseException, JsonMappingException, IOException {
	boolean validate = true;
	SimpleFlightSearchRequest request = new SimpleFlightSearchRequest();

	if(origin.length()==0 && destination.length()==0&&date.length()==0) {
		validate =false;
	}
	if(!validate) {
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	else {
		
		request.setOrigin(origin);
		request.setDestination(destination);
		request.setDate(date);
		
		List<SimpleFlightSearch> result = simpleFlightSearchService.getFlighInfoByOrginDestAndDate(request);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
}

@GetMapping("/simpleflightsearch/{flightnumber}/{origin}/{destination}/{date}")
public ResponseEntity searchByAllCriteria(@PathVariable String flightnumber,@PathVariable String origin,@PathVariable String destination,@PathVariable String date) throws JsonParseException, JsonMappingException, IOException {
	boolean validate = true;
	SimpleFlightSearchRequest request = new SimpleFlightSearchRequest();
	
	if(flightnumber.length()==0&&origin.length()==0&&destination.length()==0&&date.length()==0) {
		validate =false;
	}
	if(!validate) {
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}else {
		request.setFlightNumber(flightnumber);
		request.setOrigin(origin);
		request.setDestination(destination);
		request.setDate(date);
		List<SimpleFlightSearch> result = simpleFlightSearchService.getFlightInfoAllCriteria(request);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
}
}


