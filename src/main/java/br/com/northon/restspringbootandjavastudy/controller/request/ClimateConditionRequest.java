package br.com.northon.restspringbootandjavastudy.controller.request;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ClimateConditionRequest implements Serializable {
	
	private static final long serialVersionUID = -3856535295523257488L;

	@NotNull(message = "Temperature field is required")
	private double temperature;
	
	@NotNull(message = "Weather condition field is required")
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
