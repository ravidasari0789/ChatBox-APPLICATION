package com.chatbox.biding;

public class LoginForm {
               private Integer uid;
               private String username;
               private String pwd;
               
               public LoginForm() {
            	   
               }

			public LoginForm(Integer uid, String username, String pwd) {
				super();
				this.uid = uid;
				this.username = username;
				this.pwd = pwd;
			}

			public Integer getUid() {
				return uid;
			}

			public void setUid(Integer uid) {
				this.uid = uid;
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
				return "LoginForm [uid=" + uid + ", username=" + username + ", pwd=" + pwd + "]";
			}
               
}
