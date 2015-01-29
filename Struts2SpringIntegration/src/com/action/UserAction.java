package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.societe.bean.UserBean;


@Component(value="user")
public class UserAction extends ActionSupport implements ModelDriven<UserBean> {

	private static final long serialVersionUID = 1L;

	@Autowired
	private UserBean userBean;

	public String execute() {
		return "success";
	}

	public String addUser() {
		return "success";
	}

	@Override
	public UserBean getModel() {
		return userBean;
	}
}
