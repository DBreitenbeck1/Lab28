package co.grandcircus.Lab28.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Time {
	@JsonProperty("startPeriodName")
	private List<String> name;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Time [name=" + name + "]";
	}

	
	
	
}
