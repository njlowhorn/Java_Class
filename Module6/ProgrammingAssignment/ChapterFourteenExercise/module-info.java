module com.mycompany.javafximages {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafximages to javafx.fxml;
    exports com.mycompany.javafximages;
}
