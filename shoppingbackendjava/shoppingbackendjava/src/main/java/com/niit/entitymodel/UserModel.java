package com.niit.entitymodel;


	import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name = "user")
	public class UserModel implements Serializable {

		@Id
		private String username;
		private String password;
		private String confirmpassword;
		private String emailid;
		private String mobile;
		private String address;
		

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getpassword() {
			return password;
		}

		public void setpassword(String password) {
			this.password = password;
		}
		public String getconfirmpassword() {
			return confirmpassword;
		}
		public void setconfirmPassword(String confirmpassword) {
			this.confirmpassword = confirmpassword;
		}

		public String getemailid() {
			return emailid;
		}

		public void setemailid(String emailid) {
			this.emailid = emailid;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getaddress() {
			return address;
		}

		public void setaddress(String address) {
			this.address = address;
		

	
		}

		
	}


