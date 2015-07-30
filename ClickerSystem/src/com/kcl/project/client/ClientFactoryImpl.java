package com.kcl.project.client;

import com.google.gwt.core.client.GWT;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.kcl.project.client.views.LecturersView;
import com.kcl.project.client.views.LoginView;
import com.kcl.project.client.views.StudentsView;
import com.kcl.project.client.views.Impl.LecturersViewImpl;
import com.kcl.project.client.views.Impl.LoginViewImpl;
import com.kcl.project.client.views.Impl.StudentsViewImpl;
import com.kcl.project.shared.ClickerSystemService;
import com.kcl.project.shared.ClickerSystemServiceAsync;



public class ClientFactoryImpl implements ClientFactory{

	private static EventBus eventbus;
	private static ClickerSystemServiceAsync rpc;
	private static LoginView loginView;
	private static StudentsView studentsView;
	private static LecturersView lecturersView;
	
	@Override
	public EventBus getEventBus() {
		
		if (eventbus == null) eventbus = new SimpleEventBus();
		return eventbus;
	}

	@Override
	public LoginView getLoginView() {
		if (loginView == null) loginView = new LoginViewImpl();
		return loginView;
	}

	@Override
	public StudentsView getStudentsView() {
		if (studentsView == null) studentsView = new StudentsViewImpl();
		return studentsView;
	}

	@Override
	public LecturersView getLecturersView() {
		if (lecturersView == null) lecturersView = new LecturersViewImpl();
		return lecturersView;
	}

	@Override
	public ClickerSystemServiceAsync getRpcServices() {
		
		if(rpc == null) rpc =  GWT.create(ClickerSystemService.class);
		return rpc;
	}

}
