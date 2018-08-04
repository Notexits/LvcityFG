package cn.lingnan.edu.lvcity.model;

public class ScenicDTO {
	private int sid;
	private int stid;
	private String sname;
	private String image;
	private int aid;
	private String lx;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
	public String getLx() {
		return lx;
	}
	public void setLx(String lx) {
		this.lx = lx;
	}
	@Override
	public String toString() {
		return "ScenicDTO [sid=" + sid + ", stid=" + stid + ", sname=" + sname + ", image=" + image + ", aid=" + aid
				+ ", lx=" + lx + "]";
	}
	public ScenicDTO(int sid, int stid, String sname, String image, int aid, String lx) {
		super();
		this.sid = sid;
		this.stid = stid;
		this.sname = sname;
		this.image = image;
		this.aid = aid;
		this.lx = lx;
	}
	public ScenicDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
