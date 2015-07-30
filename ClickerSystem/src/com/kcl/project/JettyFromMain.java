package com.kcl.project;


import java.awt.EventQueue;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;

import com.kcl.project.jetty.server.JettyServer;
import com.kcl.project.jetty.ui.ServerRunner;



public class JettyFromMain {

	public static void main(String[] args) {

		ContextHandlerCollection contexts = new ContextHandlerCollection();

		contexts.setHandlers(new Handler[] 
				{ new AppContextBuilder().buildWebAppContext()});

		final JettyServer jettyServer = new JettyServer();
		jettyServer.setHandler(contexts);
		Runnable runner = new Runnable() {
			@Override
			public void run() {
				new ServerRunner(jettyServer);
			}
		};
		EventQueue.invokeLater(runner);

	}

}
