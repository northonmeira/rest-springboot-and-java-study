package br.com.northon.restspringbootandjavastudy.repository.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "meteorology")
public class MeteorologyEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8062864347993587769L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private double temperature;
	
	@Column(name = "weather_condition", nullable = false)
	private String weatherCondition;
	
	@Column(nullable = false)
	private Date date;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false)
	private String state;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public MeteorologyEntity(double temperature, String weatherCondition, Date date, String city, String state) {
		super();
		this.temperature = temperature;
		this.weatherCondition = weatherCondition;
		this.date = date;
		this.city = city;
		this.state = state;
	}

	public MeteorologyEntity() {
		super();
	}

	

}
