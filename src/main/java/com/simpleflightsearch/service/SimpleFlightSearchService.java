package com.simpleflightsearch.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.simpleflightsearch.model.SimpleFlightSearch;
import com.simpleflightsearch.dao.SimpleFlightSearchDaoImpl;
import com.simpleflightsearch.request.SimpleFlightSearchRequest;
@Service
public class SimpleFlightSearchService {


public List<SimpleFlightSearch> getFlightInfoAllCriteria(SimpleFlightSearchRequest criteria) throws JsonParseException, JsonMappingException, IOException {
	SimpleFlightSearchDaoImpl flightSearch = new SimpleFlightSearchDaoImpl();
	List<SimpleFlightSearch> list  = flightSearch.getFlightInfo(criteria);
	List<SimpleFlightSearch> searchResult = new ArrayList<SimpleFlightSearch >();
	
	for(SimpleFlightSearch s:list) {
		if(s.getFlightNumber().equals(criteria.getFlightNumber())&&
				s.getOrigin().equals(criteria.getOrigin())&&
				s.getDestination().equals(criteria.getDestination())) {
			searchResult.add(s);
		}
	}

	return searchResult;
}
public List<SimpleFlightSearch> getFlighInfoByOrginDestAndDate(SimpleFlightSearchRequest criteria) throws JsonParseException, JsonMappingException, IOException {
	SimpleFlightSearchDaoImpl flightSearch = new SimpleFlightSearchDaoImpl();
	List<SimpleFlightSearch> list  = flightSearch.getFlightInfo(criteria);
	List<SimpleFlightSearch> searchResult = new ArrayList<SimpleFlightSearch >();
	
	for(SimpleFlightSearch s:list) {
		if(s.getOrigin().equals(criteria.getOrigin())&&
				s.getDestination().equals(criteria.getDestination())) {
			searchResult.add(s);
		}
	}

	return searchResult;
}

}
