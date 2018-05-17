package entities;

public class Place {
	private int id;
	private int locationId;
	private int categoryId;
	private String placeName;
	private String description;
	private String detail;
	private String address;
	private String phone;
	private String latitude;
	private String longitude;
	private int rating;
	private String numcomment;
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Place(int id, int locationId, int categoryId, String placeName, String description, String detail,
			String address, String phone, String latitude, String longitude, int rating, String numcomment) {
		super();
		this.id = id;
		this.locationId = locationId;
		this.categoryId = categoryId;
		this.placeName = placeName;
		this.description = description;
		this.detail = detail;
		this.address = address;
		this.phone = phone;
		this.latitude = latitude;
		this.longitude = longitude;
		this.rating = rating;
		this.numcomment = numcomment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getNumcomment() {
		return numcomment;
	}
	public void setNumcomment(String numcomment) {
		this.numcomment = numcomment;
	}
	
	
	
	
}