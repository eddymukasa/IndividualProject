package com.kcl.project.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.kcl.project.shared.DTO.MultiQnDto;
import com.kcl.project.shared.DTO.OneWordDto;
import com.kcl.project.shared.DTO.OpenQnDto;

public interface ClickerSystemServiceAsync {

	void checkStudentLogin(String login, String type, String password,
			String course, AsyncCallback<Boolean> callback);

	void getMultipleChoiceQuestions(AsyncCallback<MultiQnDto> callback);

	void getOneWordQuestions(AsyncCallback<OneWordDto> callback);

	void getOpenCanvasQuestions(AsyncCallback<OpenQnDto> callback);

	void setResponse(OpenQnDto response, AsyncCallback<Void> callback);

	void setResponseMultipleChoice(MultiQnDto response,
			AsyncCallback<Void> callback);

	void setResponseOneWord(OneWordDto response,
			AsyncCallback<Void> callback);

}
