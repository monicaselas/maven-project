package com.niit.controller.daoimpl;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.niit.controller.dao.SupplierDAO;
import com.niit.entitymodel.Supplier;


public class SupplierDAOImpl implements SupplierDAO {

	public boolean addsupplier(Supplier supplier) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(supplier);

		session.getTransaction().commit();
		session.close();

		return true;

	}

	public boolean deletesupplier(String supplierId, String supplierName) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Supplier supplierModel = new Supplier();
		supplierModel.setSupplierId(supplierId);
		supplierModel.setSupplierName(supplierName);

		session.delete(supplierModel);
		session.getTransaction().commit();
		session.close();

		return true;

	}

	public Supplier getbyId(String supplierId) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		String hql = "from supplierModel where id =" + "'" + supplierId + "'";
		Query query = session.createQuery(hql);

		List<Supplier> list = (List<Supplier>) query.list();
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Supplier> getSupplierList() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		List<Supplier> list = (List<Supplier>) session.createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;

	}

}


