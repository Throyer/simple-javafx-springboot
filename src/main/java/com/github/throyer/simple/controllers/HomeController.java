package com.github.throyer.simple.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.github.throyer.simple.models.Category;
import com.github.throyer.simple.models.Situation;
import com.github.throyer.simple.models.Task;
import com.github.throyer.simple.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

@Component
public class HomeController implements Initializable {

    @Autowired
    private CategoryRepository categoryRepository;

    // @Autowired
    // private TaskRepository repository;

    @FXML
    private TableView<Task> tabela;

    @FXML
    private TextField fieldTaskName;

    @FXML
    private ComboBox<Category> fieldCategory;

    @FXML
    private ComboBox<Situation> fieldSituation;

    @FXML
    private Button addButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        gabiarra();
        
        var categories = categoryRepository.findAll();
        
        fieldCategory.setItems(FXCollections.observableList(categories));        
        fieldSituation.setItems(FXCollections.observableArrayList(Situation.values()));
    }

    @FXML
    private void add() {
        var name = fieldTaskName.getText();
        var category = fieldCategory.getValue();
        var situation = fieldSituation.getValue();
        System.out.println(new Task(name, category, situation));
    }

    private void gabiarra() {
        var money = categoryRepository.findOptionalByName("Money");
        var food = categoryRepository.findOptionalByName("Food");

        if (money.isEmpty()) {
            categoryRepository.save(new Category("Money"));
        }

        if (food.isEmpty()) {
            categoryRepository.save(new Category("Food"));
        }
    }
}
