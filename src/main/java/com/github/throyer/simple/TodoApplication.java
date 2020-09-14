package com.github.throyer.simple;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class TodoApplication {
	
	public static void main(String... args) {
		Application.launch(TodoUI.class, args);
	}
}
