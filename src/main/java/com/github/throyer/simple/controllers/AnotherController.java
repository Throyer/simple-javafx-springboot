package com.github.throyer.simple.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.github.throyer.simple.TodoUI;

import org.springframework.stereotype.Component;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

@Component
public class AnotherController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("initialize another controller");
    }

    @FXML
    private void change() {
        TodoUI.setRoot("home");
    }
}
