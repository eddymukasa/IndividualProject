package com.kcl.project.server.DAO.Impl;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Repository;

import com.kcl.project.server.DAO.LecturerDao;
import com.kcl.project.server.util.HibernateUtil;

@Repository("lecturerDao")
public class LecturerDaoImpl implements LecturerDao{

	private static SessionFactory factory;
	
	
	@Override
	public Boolean isLecturer(String username, String course, String password) {
		boolean isLecturer = false;
		try{
			 factory = HibernateUtil.getSessionFactory();
			
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
		
		Session session = factory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         String hql = "From Lecturer L where L.username = : username and L.course = :course and L.password = :password";
	         Query query = session.createQuery(hql);
	         query.setParameter("username", username);
	         query.setParameter("course", course);
	         query.setParameter("password", password);
	         if(query.list().isEmpty()){
	        	 isLecturer = false;
	         }else{
	        	 isLecturer = true;
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
		
		
		return isLecturer;
	}

}
