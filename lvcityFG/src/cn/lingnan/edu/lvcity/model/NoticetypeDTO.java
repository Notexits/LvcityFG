package cn.lingnan.edu.lvcity.model;

public class NoticetypeDTO {
	private int ntid;
	private String nt;
	public int getNtid() {
		return ntid;
	}
	public void setNtid(int ntid) {
		this.ntid = ntid;
	}
	public String getNt() {
		return nt;
	}
	public void setNt(String nt) {
		this.nt = nt;
	}
	@Override
	public String toString() {
		return "NoticetypeDTO [ntid=" + ntid + ", nt=" + nt + "]";
	}
	public NoticetypeDTO(int ntid, String nt) {
		super();
		this.ntid = ntid;
		this.nt = nt;
	}
	public NoticetypeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
