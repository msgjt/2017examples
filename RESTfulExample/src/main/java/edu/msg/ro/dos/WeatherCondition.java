package edu.msg.ro.dos;

import java.io.Serializable;

public class WeatherCondition implements Serializable {

	private static final long serialVersionUID = -5363892805973904244L;
	
	String condition;
	Integer temperature;

	public WeatherCondition() {
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Current WeatherCondition [condition=" + condition + ", temperature=" + temperature + "]";
	}
	
	
}
