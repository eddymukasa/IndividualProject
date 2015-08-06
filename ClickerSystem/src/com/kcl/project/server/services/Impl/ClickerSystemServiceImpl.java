package com.kcl.project.server.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.kcl.project.server.DAO.LecturerDao;
import com.kcl.project.server.DAO.StudentsDao;
import com.kcl.project.shared.ClickerSystemService;
import com.kcl.project.shared.DTO.MultiQnDto;
import com.kcl.project.shared.DTO.OneWordDto;
import com.kcl.project.shared.DTO.OpenQnDto;

public class ClickerSystemServiceImpl extends RemoteServiceServlet implements ClickerSystemService{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8636343940866782749L;
	
	@Autowired
	private StudentsDao studentDao;
	
	
	private LecturerDao lecturerDao;
	
	@Override
	public boolean checkStudentLogin(String login, String type,	String password, String course) {

		ApplicationContext ctx =  new ClassPathXmlApplicationContext("Beans.xml");
		 studentDao = (StudentsDao) ctx.getBean("studentsDao");
		 lecturerDao = (LecturerDao) ctx.getBean("lecturerDao");
		if(type.equalsIgnoreCase("Lecturer")){
			return lecturerDao.isLecturer(login, course, password);
		}else{
			return studentDao.isStudent(login, course, password);
		}
		
	}

	@Override
	public void setResponseMultipleChoice(MultiQnDto response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResponseOneWord(OneWordDto response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResponse(OpenQnDto response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MultiQnDto getMultipleChoiceQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OneWordDto getOneWordQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OpenQnDto getOpenCanvasQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

}
