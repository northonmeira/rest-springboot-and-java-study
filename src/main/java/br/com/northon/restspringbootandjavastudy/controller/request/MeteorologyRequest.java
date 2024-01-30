package br.com.northon.restspringbootandjavastudy.controller.request;

import java.util.Date;

public class MeteorologyRequest {
	
	private ClimateConditionRequest climateCondition;
	
	private Date date;
	
	private String city;
	
	private String state;

	public ClimateConditionRequest getClimateCondition() {
		return climateCondition;
	}

	public void setClimateCondition(ClimateConditionRequest climateCondition) {
		this.climateCondition = climateCondition;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public MeteorologyRequest(ClimateConditionRequest climateCondition, Date date, String city, String state) {
		super();
		this.climateCondition = climateCondition;
		this.date = date;
		this.city = city;
		this.state = state;
	}
	

}
