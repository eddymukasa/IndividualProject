package com.kcl.project;

import org.eclipse.jetty.webapp.WebAppContext;

public class AppContextBuilder {
	
private WebAppContext webAppContext;
	
	public WebAppContext buildWebAppContext(){
		webAppContext = new WebAppContext();
		//webAppContext.setDescriptor(webAppContext +"/WEB-INF/web.xml");
		//webAppContext.setResourceBase(".");
		//webAppContext.setContextPath("/runJetty");
		
		
		webAppContext.setResourceBase("./apps/GwtApplication");
		webAppContext.setDescriptor("./apps/GwtApplication/WEB-INF/web.xml");
		webAppContext.setContextPath("/");
		webAppContext.setParentLoaderPriority(true);
		
		return webAppContext;

}
}