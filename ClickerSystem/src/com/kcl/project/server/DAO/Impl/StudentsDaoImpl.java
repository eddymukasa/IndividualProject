package com.kcl.project.server.DAO.Impl;

import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Repository;

import com.kcl.project.model.Course;
import com.kcl.project.model.Student;
import com.kcl.project.server.DAO.StudentsDao;
import com.kcl.project.server.util.HibernateUtil;

@Repository("studentsDao")
public class StudentsDaoImpl implements StudentsDao{

	private static SessionFactory factory;
	private int id;
	
	@Override
	public Boolean isStudent(String username, String course, String password) {
		boolean isStudent = false;
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
	         String hql = "From Student S where S.username = :username  and S.password = :password ";
	         Query query = session.createQuery(hql);
	         query.setParameter("username", username);
	         query.setParameter("password", password);
	         List<Student> student = query.list();
	        
	         
	         if(query.list().isEmpty()){
	        	 
	        	 isStudent = false;
	         }else{
	        	 Set<Course> courses = student.get(0).getCourses();
	        	if(!courses.isEmpty()){
	        	 for(Course c: courses){
	        		 if(c.getName().equalsIgnoreCase(course)){
	        			 isStudent = true; 
	        		 }
	        	 }
	        	 
	        	}
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
		
		
		return isStudent;
	}

}
