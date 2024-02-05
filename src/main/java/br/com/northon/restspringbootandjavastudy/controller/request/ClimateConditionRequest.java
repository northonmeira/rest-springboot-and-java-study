package br.com.northon.restspringbootandjavastudy.controller.request;

import java.io.Serializable;

public class ClimateConditionRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3856535295523257488L;

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
