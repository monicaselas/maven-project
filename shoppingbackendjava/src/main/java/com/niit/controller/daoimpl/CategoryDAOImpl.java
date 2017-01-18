package com.niit.controller.daoimpl;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.niit.controller.dao.CategoryDAO;
import com.niit.entitymodel.Category;





public class CategoryDAOImpl implements CategoryDAO {

	public boolean addCategory(Category category) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.saveOrUpdate(category);

		session.getTransaction().commit();
		session.close();

		return true;
	}

	public boolean deleteCategory(String categoryId, String categoryName) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Category category = new Category();
		category.setCategoryId(categoryId);
		category.setCategoryName(categoryName);

		session.delete(category);
		session.getTransaction().commit();
		session.close();

		return true;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Category> getCategoryList() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		List<Category> list = (List<Category>) session.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;

	}

	


}

