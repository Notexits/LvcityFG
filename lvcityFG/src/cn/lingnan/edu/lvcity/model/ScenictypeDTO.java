package cn.lingnan.edu.lvcity.model;

public class ScenictypeDTO {
	private int stid;
	private String st;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	@Override
	public String toString() {
		return "ScenictypeDTO [stid=" + stid + ", st=" + st + "]";
	}
	public ScenictypeDTO(int stid, String st) {
		super();
		this.stid = stid;
		this.st = st;
	}
	public ScenictypeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
