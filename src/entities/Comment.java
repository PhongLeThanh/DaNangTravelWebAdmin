package entities;

public class Comment {
	private int id;
	private int placeId;
	private int userId;
	private String content;
	private int evaluate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPlaceId() {
		return placeId;
	}
	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(int evaluate) {
		this.evaluate = evaluate;
	}
	public Comment(int id, int placeId, int userId, String content, int evaluate) {
		super();
		this.id = id;
		this.placeId = placeId;
		this.userId = userId;
		this.content = content;
		this.evaluate = evaluate;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
