package com.github.throyer.ui;

import static javafx.application.Application.launch;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  public static void main(String... args) {
    launch(UI.class, args);
  }
}
