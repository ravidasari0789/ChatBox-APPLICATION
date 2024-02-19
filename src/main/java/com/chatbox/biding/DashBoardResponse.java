package com.chatbox.biding;

public class DashBoardResponse {

	            private Integer uid;
	            private String username;
	            
	            public DashBoardResponse() {
	            	
	            }

				public DashBoardResponse(Integer uid, String username) {
					super();
					this.uid = uid;
					this.username = username;
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

				@Override
				public String toString() {
					return "DashBoardResponse [uid=" + uid + ", username=" + username + "]";
				}
}
