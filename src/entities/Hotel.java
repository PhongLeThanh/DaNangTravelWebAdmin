package entities;

public class Hotel extends Place{
	private float cost;
	private String website;
	private String moreInformation;
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getMoreInformation() {
		return moreInformation;
	}
	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}
	public Hotel(int id, int locationId, int categoryId, String placeName, String description, String detail,
			String address, String phone, String latitude, String longitude, int rating, String numcomment, float cost,
			String website, String moreInformation) {
		super(id, locationId, categoryId, placeName, description, detail, address, phone, latitude, longitude, rating,
				numcomment);
		this.cost = cost;
		this.website = website;
		this.moreInformation = moreInformation;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(int id, int locationId, int categoryId, String placeName, String description, String detail,
			String address, String phone, String latitude, String longitude, int rating, String numcomment) {
		super(id, locationId, categoryId, placeName, description, detail, address, phone, latitude, longitude, rating,
				numcomment);
		// TODO Auto-generated constructor stub
	}

}
