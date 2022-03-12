package com.example.demo;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout{
    
    public MainView() {
        TextField textField = new TextField();
        textField.setLabel("Name");
        textField.setPlaceholder("Enter your name");
        textField.setHelperText("Your name is required");
        textField.getElement().setAttribute("title","Example: junxian428");

        textField.setAutofocus(true);
        textField.setClearButtonVisible(true);
        textField.setRequired(true);
        textField.setMinLength(2);
        textField.setMaxLength(10);
        textField.setPattern("[a-zA-Z]+");
        textField.setErrorMessage("Your name is required and must be between 2 and 10 characters");

        textField.addValueChangeListener(event -> {
            if(textField.isInvalid()){
                Notification.show("Invalid Name");
            } else{
                Notification.show("Valid Name");
            }
        });
        add(textField);
    }
}
