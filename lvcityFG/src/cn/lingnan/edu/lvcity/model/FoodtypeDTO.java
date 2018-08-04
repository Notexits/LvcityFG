package cn.lingnan.edu.lvcity.model;

public class FoodtypeDTO {
	private int ftid;
	private String ft;
	public int getFtid() {
		return ftid;
	}
	public void setFtid(int ftid) {
		this.ftid = ftid;
	}
	public String getFt() {
		return ft;
	}
	public void setFt(String ft) {
		this.ft = ft;
	}
	@Override
	public String toString() {
		return "FoodtypeDTO [ftid=" + ftid + ", ft=" + ft + "]";
	}
	public FoodtypeDTO(int ftid, String ft) {
		super();
		this.ftid = ftid;
		this.ft = ft;
	}
	public FoodtypeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
