package entity;

public class Lendbook {
	private String bianhao;
	private String bname;
	private String wname;
	private String username;
	private String startdate;
	private String enddate;
	
	public void setBianhao(String bianhao) {
		this.bianhao=bianhao;
	}
	public void setBname(String bname) {
		this.bname=bname;
	}
	public void setWname(String wname) {
		this.wname=wname;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public void setStartdate(String startdate) {
		this.startdate=startdate;
	}
	public void setEnddate(String enddate) {
		this.enddate=enddate;
	}
	
	public String getBianhao() {
		return this.bianhao;
	}
	public String getBname() {
		return this.bname;
	}
	public String getWname() {
		return this.wname;
	}
	public String getUsername() {
		return this.username;
	}
	public String getStartdate() {
		return this.startdate;
	}
	public String getEnddate() {
		return this.enddate;
	}
	public Lendbook() {}
	public Lendbook(String bianhao,String bname,String wname,String username,String startdate,String enddate) {
		this.bianhao=bianhao;
		this.bname=bname;
		this.wname=wname;
		this.username=username;
		this.startdate=startdate;
		this.enddate=enddate;
	}
	
}
