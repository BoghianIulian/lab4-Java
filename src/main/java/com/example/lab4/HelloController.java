package com.example.lab4;

import Domain.Comanda;
import Domain.Tort;
import Repository.DuplicateObjectException;
import Repository.RepositoryException;
import Service.ServiceComanda;
import Service.ServiceTort;
import UI.UI;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.Collection;

import static com.example.lab4.Convert.convertToComanda;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}