package br.com.northon.restspringbootandjavastudy.controller.request;

public class ClimateConditionRequest {
	
	private double temperature;
	
	private String weatherCondition;
	
	public double getTemperature() {
		return temperature;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public String getWeatherCondition() {
		return weatherCondition;
	}
	
	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}
	
	public ClimateConditionRequest(double temperature, String weatherCondition) {
		super();
		this.temperature = temperature;
		this.weatherCondition = weatherCondition;
	}

}
