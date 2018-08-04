package cn.lingnan.edu.lvcity.model;

public class FoodDTO {
	private int fid;
	private int ftid;
	private String fname;
	private String image;
	private int aid;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getFtid() {
		return ftid;
	}
	public void setFtid(int ftid) {
		this.ftid = ftid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "FoodDTO [fid=" + fid + ", ftid=" + ftid + ", fname=" + fname + ", image=" + image + ", aid=" + aid
				+ "]";
	}
	public FoodDTO(int fid, int ftid, String fname, String image, int aid) {
		super();
		this.fid = fid;
		this.ftid = ftid;
		this.fname = fname;
		this.image = image;
		this.aid = aid;
	}
	public FoodDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
