package com.simpleflightsearch.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleFlightSearch {

	@JsonProperty("flightNumber")
	 private String flightNumber;
	
	@JsonProperty("carrier")
	 private String carrier;
	
	@JsonProperty("origin")
	 private String origin;
	
	@JsonProperty("departure")
	 private String departure;
	
	@JsonProperty("destination")
	 private String destination;
	
	@JsonProperty("arrival")
	 private String arrival;
	
	@JsonProperty("aircraft")
	 private String aircaraft;
	
	@JsonProperty("distance")
	 private long distance;
	
	@JsonProperty("travelTime")
	 private String travelTime;
	
	
	
	@JsonProperty("status")
	private String status;
	
	 public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String depature) {
		this.departure = depature;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getAircaraft() {
		return aircaraft;
	}
	public void setAircaraft(String aircaraft) {
		this.aircaraft = aircaraft;
	}
	public long getDistance() {
		return distance;
	}
	public void setDistance(long distance) {
		this.distance = distance;
	}
	public String getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}
	
}
