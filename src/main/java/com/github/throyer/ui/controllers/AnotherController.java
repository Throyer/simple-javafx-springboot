package com.github.throyer.ui.controllers;

import static com.github.throyer.ui.controllers.HomeController.HOME_SCREEN;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import com.github.throyer.ui.UI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

@Component
public class AnotherController implements Initializable {
  public static final String ANOTHER_SCREEN = "another";

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    System.out.println("initialize another controller");
  }

  @FXML
  private void change() {
    UI.navigateTo(HOME_SCREEN);
  }
}
