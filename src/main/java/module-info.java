module com.example.javafxtestfordocker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtestfordocker to javafx.fxml;
    exports com.example.javafxtestfordocker;
}