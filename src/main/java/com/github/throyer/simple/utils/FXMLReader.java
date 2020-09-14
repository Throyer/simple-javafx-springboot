package com.github.throyer.simple.utils;

import java.io.IOException;

import com.github.throyer.simple.TodoUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class FXMLReader {
    private FXMLReader() { }

    public static Parent load(String fxml) {
        try {
            var fxmlLoader = new FXMLLoader(TodoUI.class.getResource(String.format("/fxml/%s.fxml", fxml)));
            return fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        } 
    }
}
