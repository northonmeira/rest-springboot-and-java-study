package br.com.northon.restspringbootandjavastudy.controller.request;

import java.io.Serializable;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

public class MeteorologyRequest implements Serializable {

	private static final long serialVersionUID = 8660085718059244901L;

	@Valid
	@NotNull(message = "Climate condition field is required")
	private ClimateConditionRequest climateCondition;
	
	@NotNull(message = "Date field is required")
	@Past(message = "The date of climate condition must be in the past.")
	private Date date;
	
	@NotBlank(message = "City field is required")
	private String city;
	
	@NotBlank(message = "State field is required")
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
