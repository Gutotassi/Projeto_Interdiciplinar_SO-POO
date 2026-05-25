package com.biblioteca.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class BibliotecaApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();

        // Esta abordagem ignora problemas de escopo de classe e lê o arquivo direto do fluxo de recursos do módulo
        InputStream fxmlStream = BibliotecaApplication.class.getResourceAsStream("/com/biblioteca/view/biblioteca-view.fxml");

        if (fxmlStream == null) {
            throw new IOException("O arquivo fxml nao foi encontrado dentro do target/classes! Verifique a pasta resources.");
        }

        Scene scene = new Scene(fxmlLoader.load(fxmlStream), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}