package com.kcl.project.client.views.Impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.kcl.project.client.presenters.LoginPresenter;
import com.kcl.project.client.views.LoginView;

public class LoginViewImpl extends Composite implements LoginView {

	private LoginPresenter presenter;
	private Button loginBtn;
	private Button cancel;
	private Label userType;
	private Label username;
	private Label password;
	private Label course;
	private TextBox courseTxt;
	private TextBox usernameTxt;
	private RadioButton student;
	private RadioButton lecturer;
	private PasswordTextBox passwordTxt;
	
	public LoginViewImpl(){
		VerticalPanel vl = new VerticalPanel();
		HorizontalPanel hl1 = new HorizontalPanel();
		Label login = new Label(GWT.getModuleBaseURL()+ "service");
		hl1.add(login);
		HorizontalPanel hl2 = new HorizontalPanel();
		userType = new Label("User Type");
		student = new RadioButton("usertype","Student");
		
		lecturer = new RadioButton("usertype","Lecturer");
		hl2.add(userType);
		hl2.add(student);
		hl2.add(lecturer);
		HorizontalPanel hl3 = new HorizontalPanel();
		username = new Label("Username");
		usernameTxt = new TextBox();
		hl3.add(username);
		hl3.add(usernameTxt);
		HorizontalPanel hl4 = new HorizontalPanel();
		password = new Label("Password");
		passwordTxt = new PasswordTextBox();
		hl4.add(password);
		hl4.add(passwordTxt);
		HorizontalPanel hl5 = new HorizontalPanel();
		course = new Label("Course");
		courseTxt = new TextBox();
		hl5.add(course);
		hl5.add(courseTxt);
		HorizontalPanel hl6 = new HorizontalPanel();
		loginBtn = new Button("Login");
		cancel = new Button("Cancel");
		hl6.add(loginBtn);
		hl6.add(cancel);
		vl.add(hl1);
		vl.add(hl2);
		vl.add(hl3);
		vl.add(hl4);
		vl.add(hl5);
		vl.add(hl6);
		initWidget(vl);
		vl.setBorderWidth(2);
		
		bind();
	}
	@Override
	public Widget asWidget() {
		return this;
	}

	public void bind(){
		loginBtn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				if (presenter != null){
					presenter.onLoginCheck();
				}
				
			}
		});
	}
	@Override
	public HasText getLogin() {
		// TODO Auto-generated method stub
		return usernameTxt;
	}

	@Override
	public HasText getPassword() {
		// TODO Auto-generated method stub
		return passwordTxt;
	}

	@Override
	public HasText getCourse() {
		// TODO Auto-generated method stub
		return courseTxt;
	}

	@Override
	public HasText getUserType() {
		if(student.getValue() == true){
			return student;
		}else if(lecturer.getValue() == true){
			return lecturer;
		}else{
			Window.alert("Please select user type");
		}
		return null;
	}

	@Override
	public void setPresenter(LoginPresenter presenter) {
		this.presenter = presenter;	
		
	}

}
