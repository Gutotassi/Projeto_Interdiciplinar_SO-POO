package com.biblioteca.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BibliotecaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onBibliotecaButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
