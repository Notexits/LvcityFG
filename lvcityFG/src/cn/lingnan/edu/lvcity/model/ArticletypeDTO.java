package cn.lingnan.edu.lvcity.model;

public class ArticletypeDTO {
	private int atid;
	private String atype;
	public int getAtid() {
		return atid;
	}
	public void setAtid(int atid) {
		this.atid = atid;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	@Override
	public String toString() {
		return "Articletype [atid=" + atid + ", atype=" + atype + "]";
	}
	public ArticletypeDTO(int atid, String atype) {
		super();
		this.atid = atid;
		this.atype = atype;
	}
	public ArticletypeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
