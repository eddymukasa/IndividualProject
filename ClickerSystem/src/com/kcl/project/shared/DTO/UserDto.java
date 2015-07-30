package com.kcl.project.shared.DTO;

import java.io.Serializable;

public class UserDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String password;
	private String course;
	private UserType type;
	
	public UserDto(String login, String password, String course, UserType type) {
		super();
		this.login = login;
		this.password = password;
		this.course = course;
		this.type = type;
	}

	

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getCourse() {
		return course;
	}

	public UserType getType() {
		return type;
	}
	
	

}
