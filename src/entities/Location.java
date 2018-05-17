package entities;

public class Location {
	private int id;
	private int districtId;
	private String locationName;
	private String picture;
	private String description;
	private String map;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public Location(int id, int districtId, String locationName, String picture, String description, String map) {
		super();
		this.id = id;
		this.districtId = districtId;
		this.locationName = locationName;
		this.picture = picture;
		this.description = description;
		this.map = map;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
