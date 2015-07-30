package com.kcl.project.client;

import com.google.web.bindery.event.shared.EventBus;
import com.kcl.project.client.views.LecturersView;
import com.kcl.project.client.views.LoginView;
import com.kcl.project.client.views.StudentsView;
import com.kcl.project.shared.ClickerSystemService;
import com.kcl.project.shared.ClickerSystemServiceAsync;

public interface ClientFactory {

	EventBus getEventBus();
	ClickerSystemServiceAsync getRpcServices();
	LoginView getLoginView();
	StudentsView getStudentsView();
	LecturersView getLecturersView();
}
