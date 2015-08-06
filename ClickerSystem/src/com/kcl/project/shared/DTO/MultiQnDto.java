package com.kcl.project.shared.DTO;

import java.io.Serializable;

public class MultiQnDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String question;
	private String optA;
	private String optB;
	private String optC;
	private String optD;
	private String answer;
	
	public MultiQnDto(){}
	public MultiQnDto(String question, String optA, String optB, String optC,
			String optD) {
		super();
		this.question = question;
		this.optA = optA;
		this.optB = optB;
		this.optC = optC;
		this.optD = optD;
	}
	public String getQuestion() {
		return question;
	}
	public String getOptA() {
		return optA;
	}
	public String getOptB() {
		return optB;
	}
	public String getOptC() {
		return optC;
	}
	public String getOptD() {
		return optD;
	}
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer){
		this.answer = answer;
	}
}
