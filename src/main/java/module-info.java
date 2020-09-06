 module fxbrowser {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;

    exports pl.javastart.fxbrowser to javafx.graphics;
    opens pl.javastart.fxbrowser to javafx.fxml;
}