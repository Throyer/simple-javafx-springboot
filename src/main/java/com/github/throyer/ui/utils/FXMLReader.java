package com.github.throyer.ui.utils;

import java.io.IOException;

import com.github.throyer.ui.UI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class FXMLReader {
  private FXMLReader() { }
  
  public static Parent load(String fxml) {
    try {
      var loader = new FXMLLoader(UI.class.getResource(String.format("/fxml/%s.fxml", fxml)));
      return loader.load();
    } catch (IOException exception) {
      throw new RuntimeException(exception);
    }
  }
}
