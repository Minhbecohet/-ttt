module com.example.javafxtutorials {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxtutorials to javafx.fxml;
    exports com.example.javafxtutorials;
}