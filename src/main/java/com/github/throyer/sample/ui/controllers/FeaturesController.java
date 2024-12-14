package com.github.throyer.sample.ui.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import com.github.throyer.sample.domain.sample.services.SampleService;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class FeaturesController implements Initializable {
  public FeaturesController(SampleService bean) {
    this.bean = bean;
  }

  private final SampleService bean;

  @FXML
  private Button button;

  @Override
  public void initialize(URL url, ResourceBundle rb) {

    button.setOnAction(event -> {
      log.info("clicou no botão hello");
      log.info(bean.getMessage());
    });

    log.info("initialize features controller");
  }
}
