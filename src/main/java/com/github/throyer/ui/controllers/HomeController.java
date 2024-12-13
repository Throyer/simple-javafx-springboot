package com.github.throyer.ui.controllers;

import static com.github.throyer.ui.UI.navigateTo;
import static com.github.throyer.ui.controllers.AnotherController.ANOTHER_SCREEN;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

@Component
public class HomeController implements Initializable {
  public static final String HOME_SCREEN = "home";

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    System.out.println("initialize home controller");
  }

  @FXML
  private void change() {
    navigateTo(ANOTHER_SCREEN);
  }
}
