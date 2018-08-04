package cn.lingnan.edu.lvcity.model;

public class TeamDTO {
	private int teamid;
	private String content;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "TeamDTO [teamid=" + teamid + ", content=" + content + "]";
	}
	public TeamDTO(int teamid, String content) {
		super();
		this.teamid = teamid;
		this.content = content;
	}
	public TeamDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
