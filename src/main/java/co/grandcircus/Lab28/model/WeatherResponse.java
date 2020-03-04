package co.grandcircus.Lab28.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {
	
	private Location location;
	private Time time;
	private Data data;
	
	
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "WeatherResponse [location=" + location + ", time=" + time + ", data=" + data + "]";
	}
	
	

}
