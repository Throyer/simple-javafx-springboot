package com.github.throyer.simple;

import com.github.throyer.simple.events.StageReadyEvent;
import com.github.throyer.simple.utils.FXMLReader;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

@ComponentScan
@EnableJpaRepositories("com.github.throyer.simple.repositories")
public class TodoUI extends Application {

    private static Scene scene;
    public static ConfigurableApplicationContext context;

    @Override
    public void init() {
        context = new SpringApplicationBuilder(TodoUI.class).run();
    }

    @Override
    public void start(Stage stage) {
        context.publishEvent(new StageReadyEvent(stage));
        scene = new Scene(FXMLReader.load("home"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        context.close();
        Platform.exit();
    }

    public static void setRoot(String fxml) {
        scene.setRoot(FXMLReader.load(fxml));
    }
}
