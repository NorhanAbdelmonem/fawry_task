module org.example.task {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.task to javafx.fxml;
    exports org.example.task;
}