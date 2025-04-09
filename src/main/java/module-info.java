module com.example.mentalhealthapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.mentalhealthapp to javafx.fxml;
    exports com.example.mentalhealthapp;
}