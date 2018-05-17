package entities;

public class TouristAttraction extends Place {
	private float ticket;
	private String moreInformation;
	public float getTicket() {
		return ticket;
	}
	public void setTicket(float ticket) {
		this.ticket = ticket;
	}
	public String getMoreInformation() {
		return moreInformation;
	}
	public void setMoreInformation(String moreInformation) {
		this.moreInformation = moreInformation;
	}
	public TouristAttraction(int id, int locationId, int categoryId, String placeName, String description,
			String detail, String address, String phone, String latitude, String longitude, int rating,
			String numcomment, float ticket, String moreInformation) {
		super(id, locationId, categoryId, placeName, description, detail, address, phone, latitude, longitude, rating,
				numcomment);
		this.ticket = ticket;
		this.moreInformation = moreInformation;
	}
	public TouristAttraction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TouristAttraction(int id, int locationId, int categoryId, String placeName, String description,
			String detail, String address, String phone, String latitude, String longitude, int rating,
			String numcomment) {
		super(id, locationId, categoryId, placeName, description, detail, address, phone, latitude, longitude, rating,
				numcomment);
		// TODO Auto-generated constructor stub
	}
	
	
}
