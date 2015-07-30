package com.kcl.project.client.views;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.IsWidget;
import com.kcl.project.client.presenters.LoginPresenter;


public interface LoginView extends IsWidget {

	  HasText getLogin();
	  HasText getPassword();
	  HasText getCourse();
	  HasText getUserType();
	  
	  void setPresenter(LoginPresenter presenter);
}
