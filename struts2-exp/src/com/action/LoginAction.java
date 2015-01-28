package com.action;

public class LoginAction {
	 private String userName;

     public String execute() {
             if (userName.isEmpty()) {
                     return "error";
             } else {
                     return "success";
             }
     }

     public String getUserName() {
             return userName;
     }

     public void setUserName(String userName) {
             this.userName = userName;
     }
}
