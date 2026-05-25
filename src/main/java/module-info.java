module org.example.projeto_interdiciplinar_sopoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.biblioteca.view to javafx.fxml;
    exports com.biblioteca.view;
    exports com.biblioteca.simulation;
    opens com.biblioteca.simulation to javafx.fxml;
}