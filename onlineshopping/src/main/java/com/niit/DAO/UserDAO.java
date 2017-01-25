package com.niit.DAO;


import com.niit.entityModel.UserModel;


public interface UserDAO {
	public boolean validationRegistration(UserModel usermodel);

	public UserModel validationLogin(String userName, String password);

	public boolean userDelete(String userName, String password);

	public UserModel getbyId(String userName);


}

