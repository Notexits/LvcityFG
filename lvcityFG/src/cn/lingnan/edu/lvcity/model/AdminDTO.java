package cn.lingnan.edu.lvcity.model;

public class AdminDTO {
	private int adminid;
	private String adminname;
	private String password;
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminDTO [adminid=" + adminid + ", adminname=" + adminname + ", password=" + password + "]";
	}
	public AdminDTO(int adminid, String adminname, String password) {
		super();
		this.adminid = adminid;
		this.adminname = adminname;
		this.password = password;
	}
	public AdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
