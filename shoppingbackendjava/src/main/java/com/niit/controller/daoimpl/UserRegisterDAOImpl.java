package com.niit.controller.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.niit.controller.dao.UserRegisterDAO;
import com.niit.entitymodel.UserModel;


public class UserRegisterDAOImpl implements UserRegisterDAO
{
	public boolean validation(UserModel userModelObj) {

		userModelObj.setUsername(userModelObj.getUsername());
		userModelObj.setpassword(userModelObj.getpassword());
		userModelObj.setconfirmPassword(userModelObj.getconfirmpassword());
		userModelObj.setemailid(userModelObj.getemailid());
		userModelObj.setMobile(userModelObj.getMobile());
		userModelObj.setaddress(userModelObj.getaddress());
		

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(userModelObj);
		UserModel user = (UserModel) session.get(UserModel.class, userModelObj.getUsername());

		

		session.getTransaction().commit();
		session.close();
	
		return true;
	}
	
	
}


