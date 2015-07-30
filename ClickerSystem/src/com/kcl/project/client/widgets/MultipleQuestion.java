package com.kcl.project.client.widgets;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MultipleQuestion extends Composite implements HasText{
	
	private final String btnHeight = "50px";
	private final String btnWidth = "500px";
	private VerticalPanel vl;
	private Label question;
	private Button optA;
	private Button optB;
	private Button optC;
	private Button optD;
	private String selectedResponse = "No choice";
	
	public MultipleQuestion(String questionText, String optAText, String optBText, String optCText, String optDText){
		
		 vl = new VerticalPanel();
		 question = new Label(questionText);
		 optA = new Button(optAText);
		 optA.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				selectedResponse = optA.getText();
				
			}
		});
		 optA.setSize(btnWidth, btnHeight);
		 optB = new Button(optBText);
		 optB.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					selectedResponse = optB.getText();
					
				}
			});
		 optB.setSize(btnWidth, btnHeight);
		 optC = new Button(optCText);
		 optC.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					selectedResponse = optC.getText();
					
				}
			});
		 optC.setSize(btnWidth, btnHeight);
		 optD = new Button(optDText);
		 optD.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					selectedResponse = optD.getText();
					
				}
			});
		 optD.setSize(btnWidth, btnHeight);
		 
		 buildWidget();
		 
		 initWidget(vl);
		
		
	}

	private void buildWidget(){
		vl.add(question);
		vl.add(optA);
		vl.add(optB);
		vl.add(optC);
		vl.add(optD);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return selectedResponse;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		
	}

	
}
