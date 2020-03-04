package co.grandcircus.Lab28.model;

public class Location {

	private Double latitude;
	private	Double longitude;
	private String areaDescription;
	
	
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public String getAreaDescription() {
		return areaDescription;
	}
	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}
	@Override
	public String toString() {
		return "Location [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	
	
	
}
