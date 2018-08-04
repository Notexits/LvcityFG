package cn.lingnan.edu.lvcity.model;

public class BanarDTO {
	private int banarid;
	private String image;
	private int state;
	public int getBanarid() {
		return banarid;
	}
	public void setBanarid(int banarid) {
		this.banarid = banarid;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "BanarDTO [banarid=" + banarid + ", image=" + image + ", state=" + state + "]";
	}
	public BanarDTO(int banarid, String image, int state) {
		super();
		this.banarid = banarid;
		this.image = image;
		this.state = state;
	}
	public BanarDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
