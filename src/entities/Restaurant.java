package entities;

public class Restaurant extends Place{
	private String website;
	private String time;
	private String moreInformation;
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMoreInformation() {
		return moreInformation;
	}
	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}
	public Restaurant(int id, int locationId, int categoryId, String placeName, String description, String detail,
			String address, String phone, String latitude, String longitude, int rating, String numcomment,
			String website, String time, String moreInformation) {
		super(id, locationId, categoryId, placeName, description, detail, address, phone, latitude, longitude, rating,
				numcomment);
		this.website = website;
		this.time = time;
		this.moreInformation = moreInformation;
	}
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(int id, int locationId, int categoryId, String placeName, String description, String detail,
			String address, String phone, String latitude, String longitude, int rating, String numcomment) {
		super(id, locationId, categoryId, placeName, description, detail, address, phone, latitude, longitude, rating,
				numcomment);
		// TODO Auto-generated constructor stub
	}
	
}
