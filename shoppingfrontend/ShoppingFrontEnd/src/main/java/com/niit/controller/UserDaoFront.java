package com.niit.controller;

public class UserDaoFront {
	public boolean validation(String id, String pwd) {
		if (id.equals("rajesh") && pwd.equals("rajesh123")) {
			return true;
		} else {
			return false;
		}
	}
}
