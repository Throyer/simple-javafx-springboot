package com.github.throyer.sample;

import static java.lang.System.setProperty;
import static javafx.application.Application.launch;

public class Main {
  public static void main(final String... args) {
    setProperty("org.jooq.no-logo", "true");
    launch(UI.class, args);
  }
}
