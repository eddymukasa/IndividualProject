package com.kcl.project.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;
import com.kcl.project.client.presenters.Impl.LecturersPresenterImpl;
import com.kcl.project.client.presenters.Impl.LoginPresenterImpl;
import com.kcl.project.client.presenters.Impl.StudentsPresenterImpl;
import com.kcl.project.shared.ClickerSystemServiceAsync;


public class AppController implements ValueChangeHandler<String>{

	EventBus eventbus;
	ClickerSystemServiceAsync rpc;
	HasWidgets container;
	ClientFactory clientFactory = GWT.create(ClientFactory.class);
	
	AppController(EventBus eventbus, ClickerSystemServiceAsync rpc){
		eventbus = eventbus;
		rpc = rpc;
		bind();
	}
	
	public void doLoginDisplay(){
		new LoginPresenterImpl(clientFactory.getLoginView()).go(container);
	}
	
	public void doStudentsDisplay(){
		new StudentsPresenterImpl(clientFactory.getStudentsView()).go(container);
	}
	
	public void doLecturersDisplay(){
		new LecturersPresenterImpl(clientFactory.getLecturersView()).go(container);
	}
	@Override
	public void onValueChange(ValueChangeEvent<String> event) {

		String token = event.getValue();
		
		if((token != null) && (!token.equals(Tokens.login))){
			if(token.startsWith(Tokens.students)){
				doStudentsDisplay();
			}else if(token.startsWith(Tokens.lecturers)){
				doStudentsDisplay();
			}else{
				doLoginDisplay();
			}
		}
		
	}

	public void bind(){
		
		History.addValueChangeHandler(this);
		
		
	}
	
	
	
	public void go(HasWidgets container) {
		this.container = container;
	}
}
