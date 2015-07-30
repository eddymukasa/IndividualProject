package com.kcl.project.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.kcl.project.shared.DTO.MultiQnDto;
import com.kcl.project.shared.DTO.OneWordDto;
import com.kcl.project.shared.DTO.OpenQnDto;

@RemoteServiceRelativePath("service")
public interface ClickerSystemService extends RemoteService{

	boolean checkStudentLogin(String login, String type, String password, String course);
	void setResponseMultipleChoice(List<MultiQnDto> response);
	void setResponseOneWord(List<OneWordDto> response);
	void setResponse(OpenQnDto response);
	List <MultiQnDto> getMultipleChoiceQuestions() ;
	List <OneWordDto> getOneWordQuestions();
	OpenQnDto getOpenCanvasQuestions();
	
}
