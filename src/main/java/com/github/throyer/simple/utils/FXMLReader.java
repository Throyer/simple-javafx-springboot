package com.github.throyer.simple.utils;

import java.io.IOException;

import com.github.throyer.simple.TodoUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class FXMLReader {
    
    private FXMLReader() { }

    public static Parent load(String fxml) {
        try {
            var loader = new FXMLLoader(TodoUI.class.getResource(String.format("/fxml/%s.fxml", fxml)));
            loader.setControllerFactory(TodoUI.context::getBean);
            return loader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        } 
    }
}
