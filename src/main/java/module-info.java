module org.example.projeto_interdiciplinar_sopoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.projeto_interdiciplinar_sopoo to javafx.fxml;
    exports org.example.projeto_interdiciplinar_sopoo;
}