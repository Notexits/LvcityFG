package cn.lingnan.edu.lvcity.model;

public class NoticeDTO {
	private int nid;
	private int ntid;
	private String nname;
	private int aid;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public int getNtid() {
		return ntid;
	}
	public void setNtid(int ntid) {
		this.ntid = ntid;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "Notice [nid=" + nid + ", ntid=" + ntid + ", nname=" + nname + ", aid=" + aid + "]";
	}
	public NoticeDTO(int nid, int ntid, String nname, int aid) {
		super();
		this.nid = nid;
		this.ntid = ntid;
		this.nname = nname;
		this.aid = aid;
	}
	public NoticeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
