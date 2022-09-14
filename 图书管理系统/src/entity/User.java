package entity;

public class User {
	private String id;
	private String user;
	private String password;
	public String job1="管理员";
	public String job2="读者";
	private String job;
	public String getId() {
		return id;
	}
	public void setIf(String id) {
		this.id=id;
	}
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public String getJob() {
		return this.job;
	}
	   public User(String id, String user,String password,String job) {
	        this.id = id;
	        this.user=user;
	        this.password = password;
	        this.job=job;
	    }
	    public User(){}

	    public User(String id, String user,String password) {
	        this.id = id;
	        this.user=user;
	        this.password = password;
	    }
}
