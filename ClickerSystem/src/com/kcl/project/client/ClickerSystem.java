package com.kcl.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.Window.ClosingEvent;
import com.google.gwt.user.client.Window.ClosingHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.kcl.project.client.widgets.MultipleQuestion;

public class ClickerSystem implements EntryPoint, ValueChangeHandler<String>{

	private Button createQuestion;
	private Button viewResults;
	private VerticalPanel vl;
	private VerticalPanel vl2;
	private HorizontalPanel hl;
	private HorizontalPanel hl2;
	private HorizontalPanel hl3;
	private HorizontalPanel hl4;
	private HorizontalPanel hl5;
	private HorizontalPanel hl6;
	private HorizontalPanel hl7;
	private Label qnType;
	private Label lb2;
	private Label optA;
	private Label optB;
	private Label optC;
	private Label optD;
	private TextArea a;
	private TextArea b;
	private TextArea c;
	private TextArea d;
	private RadioButton rb1;
	private RadioButton rb2;
	private RadioButton rb3;
	
	private VerticalPanel dp;
	private TextArea qn;
	
	
	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		
		setUpGui();
		setUpHistoryManagement();
		setUpEventHandling();

	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		// TODO Auto-generated method stub
		
	}

	public void setUpHistoryManagement(){
		
		History.addValueChangeHandler(this);
		
		History.fireCurrentHistoryState();
		
		Window.addWindowClosingHandler(new ClosingHandler(){
			public void onWindowClosing(ClosingEvent event) {
				event.setMessage("Ran out of history.  Now leaving application, is that OK?");
			}
		});
	}
	
	private void setUpGui(){
		
		createQuestion = new Button("Create Question");
		
		viewResults = new Button("View Results");
		
		vl = new VerticalPanel();
		hl = new HorizontalPanel();
	
		hl.add(createQuestion);
		hl.add(viewResults);
		
		qnType = new Label("Select Question Type:");
		
		rb1 = new RadioButton("type", "Multiple-choice");
		rb2 = new RadioButton("type", "One word answer");
		rb3 = new RadioButton("type", "Free form");
		lb2 = new Label("Enter Question:");
		qn = new TextArea();
		
		hl6 = new HorizontalPanel();
		hl6.add(qnType);
		hl6.add(rb1);
		hl6.add(rb2);
		hl6.add(rb3);
		
		hl7 = new HorizontalPanel();
		hl7.add(lb2);
		hl7.add(qn);
		
		dp = new VerticalPanel();
		
		dp.add(hl6);
		dp.add(hl7);
		optA = new Label("A)");
		optB = new Label("B)");
		optC = new Label("C)");
		optD = new Label("D)");
		
		a = new TextArea();
		a.setWidth("720");
		b = new TextArea();
		b.setWidth("720");
		c = new TextArea();
		c.setWidth("720");
		d = new TextArea();
		d.setWidth("720");
		
		hl2 = new HorizontalPanel();
		hl2.add(optA);
		hl2.add(a);
		
		hl3 = new HorizontalPanel();
		hl3.add(optB);
		hl3.add(b);
		
		hl4 = new HorizontalPanel();
		hl4.add(optC);
		hl4.add(c);
		
		hl5 = new HorizontalPanel();
		hl5.add(optD);
		hl5.add(d);
		
		vl.add(hl);
		vl.add(dp);
		MultipleQuestion mq = new MultipleQuestion("Who are you?", "Ëddy", "Mukasa", "Junior", "Jr");
		vl.add(mq);
		RootPanel.get().add(vl);
	}
	
	private void setUpEventHandling(){
		
		rb1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				if(rb1.getValue() == true){
				vl2 = new VerticalPanel();
				vl2.add(hl2);
				vl2.add(hl3);
				vl2.add(hl4);
				vl2.add(hl5);
				vl.add(vl2);
				}
				else{
					vl.remove(vl2);
				}
			}
		});
		
		
	}

}
