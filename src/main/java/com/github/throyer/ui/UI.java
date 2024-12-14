package com.github.throyer.ui;

import static javafx.application.Platform.exit;
import static org.springframework.boot.SpringApplication.run;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class UI extends Application {
  private ConfigurableApplicationContext context;
  private Parent root;
  
  @Override
  public void init() throws Exception {
    context = run(UI.class);
    var loader = new FXMLLoader(UI.class.getResource("/fxml/main.fxml"));
    loader.setControllerFactory(context::getBean);
    root = loader.load();
  }

  @Override
  public void start(Stage stage) throws Exception {
    stage.setScene(new Scene(root, 640, 480));
    stage.show();
  }

  @Override
  public void stop() throws Exception {
    context.close();
    exit();
  }
}
