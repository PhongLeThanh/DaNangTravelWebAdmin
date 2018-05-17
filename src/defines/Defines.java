package defines;

public class Defines {
	private String adminUrl;
	public final static int row_count = 10;
	public final static String url = "http://localhost:6969/api";
	

	public Defines() {
		super();
	}


	public Defines(String adminUrl) {
		super();
		this.adminUrl = adminUrl;
	}


	public String getAdminUrl() {
		return adminUrl;
	}


	public void setAdminUrl(String adminUrl) {
		this.adminUrl = adminUrl;
	}


	public static int getRowCount() {
		return row_count;
	}

}
