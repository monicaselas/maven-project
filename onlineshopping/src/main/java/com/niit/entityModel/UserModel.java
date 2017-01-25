package com.niit.entityModel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "USER")
@Component
public class UserModel implements Serializable {

	@Id
	@Column(name = "username")
	private String username;

	@NotEmpty
	@Column(name = "emailid")
	private String emailid;
	@NotEmpty
	@Column(name = "password")
	private String password;
	@Column(name = "confirmpassword")
	private String confirmpassword;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "address")
	private String address;
	
    @Column(name = "role")
    private String role = "ROLE_USER";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getconfirmpassword() {
		return confirmpassword;
	}
	public void setconfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getemailid() {
		return emailid;
	}

	public void setemailid(String emailid) {
		this.emailid = emailid;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	

    public String getRole() {
	return role;
	}

    public void setRole(String role) {
	this.role = role;
	}
}

