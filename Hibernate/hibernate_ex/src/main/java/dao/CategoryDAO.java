package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Category;

public class CategoryDAO {
	// Tao ra session factory
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	public void insert(Category category) {
		// create new session
		Session session = sessionFactory.openSession();
		try {
			// start transaction
			session.beginTransaction();
			// save session to db
			session.save(category);
			// commit transaction
			session.getTransaction().commit();
		} catch(Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
	}
	public List<Category> getAllData() {
		List<Category> result = new ArrayList<Category>();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		result = session.createQuery(" from Category").list(); // Select * from Category
		
		session.flush();
		session.close();
		return result;
	}
	public Category findById(int id) {
		Session session = sessionFactory.openSession();
		
		Category category = session.get(Category.class, id);
		session.evict(category);
		return category;
	}
	public void update(Category category) {
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(category);
			session.getTransaction().commit();
		} catch(Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.flush();
			session.close();
		}
	}
}
