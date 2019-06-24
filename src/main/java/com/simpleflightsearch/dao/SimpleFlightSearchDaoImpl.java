package com.simpleflightsearch.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.simpleflightsearch.model.SimpleFlightSearch;
import com.simpleflightsearch.request.SimpleFlightSearchRequest;

public class SimpleFlightSearchDaoImpl implements SimpleFlightSearchDao {
private static final String SAMPLE_DATA ="flight-docs//flight-sample.json";
	@Override
	public List getFlightInfo(SimpleFlightSearchRequest search)
			throws JsonParseException, JsonMappingException, IOException {
		File currentDir = new File(SAMPLE_DATA);
		TypeReference<List<SimpleFlightSearch>> typeRef = new TypeReference<List<SimpleFlightSearch>>() {
		};
		ObjectMapper mapper = new ObjectMapper();

		List<SimpleFlightSearch> list = mapper.readValue(currentDir, typeRef);
		
       
  		
		
		return list;
	}

	
}
