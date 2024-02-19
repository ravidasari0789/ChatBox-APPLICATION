package com.chatbox.biding;

public class RegisterForm {


	private Integer userid;

	private String fname;

	private String lname;

	private String username;

	private String pwd;

	public RegisterForm() {

	}

	public RegisterForm(Integer userid, String fname, String lname, String username, String pwd) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.pwd = pwd;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [uid=" + userid + ", fname=" + fname + ", lname=" + lname + ", username=" + username + ", pwd=" + pwd
				+ "]";
	}
}
