package com.niit.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.entityModel.UserModel;

@Transactional
@EnableTransactionManagement
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

    Logger log = LoggerFactory.getLogger(UserDAOImpl.class);

    @Autowired(required = true)
	private SessionFactory sessionFactory;


	@SuppressWarnings("deprecation")
	public UserModel validationLogin(String username, String password) {
		log.debug("inside validationLogin method");
	String hql = "from User where username ='" + username + "'  and password='" + password + "'";

	Query query = sessionFactory.getCurrentSession().createQuery(hql);
		log.debug("query executed");
	return (UserModel) query.uniqueResult();

	}

	public boolean validationRegistration(UserModel userModelObj) {
		log.debug("inside validation registration method");
	Session session = sessionFactory.openSession();
	Transaction trans = session.beginTransaction();

		session.save(userModelObj);
	trans.commit();
		session.close();

		return true;
	}

	public boolean userDelete(String username, String password) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		UserModel UserModel = new UserModel();
		UserModel.setUsername(username);
		UserModel.setPassword(password);

		session.delete(UserModel);
		session.getTransaction().commit();
		session.close();

		return true;
	}

    public UserModel getbyId(String userName) {

	Session session = sessionFactory.openSession();
	session.beginTransaction();

	return (UserModel) session.get(UserModel.class, userName);
    }
}



