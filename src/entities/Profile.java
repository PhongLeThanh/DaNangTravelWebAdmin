package entities;

public class Profile {
	private int id;
	private String fullname;
	private int age;
	private String address;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public Profile(int id, String fullname, int age, String address, String phone) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
}
