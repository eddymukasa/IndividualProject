package com.kcl.project.shared;



import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.kcl.project.shared.DTO.MultiQnDto;
import com.kcl.project.shared.DTO.OneWordDto;
import com.kcl.project.shared.DTO.OpenQnDto;

@RemoteServiceRelativePath("service")
public interface ClickerSystemService extends RemoteService{

	boolean checkStudentLogin(String login, String type, String password, String course);
	void setResponseMultipleChoice(MultiQnDto response);
	void setResponseOneWord(OneWordDto response);
	void setResponse(OpenQnDto response);
	MultiQnDto getMultipleChoiceQuestions() ;
	OneWordDto getOneWordQuestions();
	OpenQnDto getOpenCanvasQuestions();
	
}
