package com.kcl.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gwt.core.client.GWT;
import com.kcl.project.server.DAO.StudentsDao;

public class App {

	@Autowired
	private static StudentsDao dao;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ApplicationContext ctx =  new ClassPathXmlApplicationContext("Beans.xml");
		StudentsDao dao = (StudentsDao) ctx.getBean("studentsDao");*/
		
		//System.out.println("IsStudent:" + dao.isStudent("emukasa", "2softwareTesting", "password"));
		System.out.println(GWT.getModuleBaseURL()+ "service");
		/*ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

	      obj.getMessage();*/
	}

}
