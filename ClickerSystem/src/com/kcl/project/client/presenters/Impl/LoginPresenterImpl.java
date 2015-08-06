package com.kcl.project.client.presenters.Impl;

import com.google.gwt.core.shared.GWT;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.kcl.project.client.ClientFactory;
import com.kcl.project.client.presenters.LoginPresenter;
import com.kcl.project.client.views.LoginView;
import com.kcl.project.shared.ClickerSystemServiceAsync;
;


public class LoginPresenterImpl implements LoginPresenter{

	private ClientFactory clientFactory = GWT.create(ClientFactory.class);
	private final ClickerSystemServiceAsync rpcService;
	private final EventBus eventBus;
	private final LoginView loginView;
	
	public LoginPresenterImpl(final LoginView view){
		
		this.rpcService = clientFactory.getRpcServices();
		this.eventBus = clientFactory.getEventBus();
		this.loginView = view;
		bind();
	}
	
	
	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(loginView.asWidget());
	}

	@Override
	public void bind() {
		loginView.setPresenter(this);
		
	}

	@Override
	public void onLoginCheck() {
		
		rpcService.checkStudentLogin(loginView.getLogin().getText(), loginView.getUserType().getText(), loginView.getPassword().getText(), loginView.getCourse().getText(), new AsyncCallback<Boolean>() {
			
			@Override
			public void onSuccess(Boolean result) {
				// TODO Auto-generated method stub
				if((result == true)&&(loginView.getUserType().getText().equalsIgnoreCase("Student"))){
					History.newItem(com.kcl.project.client.Tokens.students);
				}else if((result == true)&&(loginView.getUserType().getText().equalsIgnoreCase("Lecturer"))){
					History.newItem(com.kcl.project.client.Tokens.lecturers);
					
				}else{
					Window.alert("The information you have entered is incorrect");
				}
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert("Error:"+ caught);
			}
		});
		
	}

}
