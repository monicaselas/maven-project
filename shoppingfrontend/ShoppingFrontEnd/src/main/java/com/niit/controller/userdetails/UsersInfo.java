package com.niit.controller.userdetails;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UsersInfo {

	@Pattern(regexp = "[^0-9]*", message = "name should not contain any numbers")
	private String username;
	private String id;
	@Size(min = 4, max = 15, message = "please enter yout password atleast 4-15 characters ")
	private String password;
	private long mobile;
	@Past
	private Date dob;
	private Address addressobj;

	public Address getAddressobj() {
		return addressobj;
	}

	public void setAddressobj(Address addressobj) {
		this.addressobj = addressobj;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
