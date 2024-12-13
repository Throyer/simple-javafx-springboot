package com.github.throyer.ui;

import static com.github.throyer.ui.controllers.HomeController.HOME_SCREEN;
import static com.github.throyer.ui.utils.FXMLReader.load;
import static javafx.application.Platform.exit;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.github.throyer.ui.events.StageReadyEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UI extends Application {

  private static Scene scene;
  private ConfigurableApplicationContext context;

  @Override
  public void init() {
    context = new SpringApplicationBuilder(UI.class).run();
  }

  @Override
  public void start(Stage stage) {
    context.publishEvent(new StageReadyEvent(stage));
    scene = new Scene(load(HOME_SCREEN), 640, 480);
    stage.setScene(scene);
    stage.show();
  }

  @Override
  public void stop() {
    context.close();
    exit();
  }

  public static void navigateTo(String fxml) {
    scene.setRoot(load(fxml));
  }
}
