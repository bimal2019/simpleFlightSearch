package com.simpleflightsearch.dao;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.simpleflightsearch.SimpleFlightSearchMain;
import com.simpleflightsearch.request.SimpleFlightSearchRequest;

public interface SimpleFlightSearchDao {
List<SimpleFlightSearchMain> getFlightInfo(SimpleFlightSearchRequest search) throws JsonParseException, JsonMappingException, IOException;

}
