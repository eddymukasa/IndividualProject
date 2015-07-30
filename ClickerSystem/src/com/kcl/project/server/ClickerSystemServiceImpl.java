package com.kcl.project.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.kcl.project.shared.ClickerSystemService;
import com.kcl.project.shared.DTO.MultiQnDto;
import com.kcl.project.shared.DTO.OneWordDto;
import com.kcl.project.shared.DTO.OpenQnDto;

public class ClickerSystemServiceImpl extends RemoteServiceServlet implements ClickerSystemService{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8636343940866782749L;

	@Override
	public boolean checkStudentLogin(String login, String type,
			String password, String course) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setResponseMultipleChoice(List<MultiQnDto> response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResponseOneWord(List<OneWordDto> response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResponse(OpenQnDto response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MultiQnDto> getMultipleChoiceQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OneWordDto> getOneWordQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OpenQnDto getOpenCanvasQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

}
