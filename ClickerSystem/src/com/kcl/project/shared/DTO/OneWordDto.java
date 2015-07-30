package com.kcl.project.shared.DTO;

import java.io.Serializable;

public class OneWordDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String question;
	private String answer;
	public OneWordDto(String question) {
		super();
		this.question = question;
		
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
