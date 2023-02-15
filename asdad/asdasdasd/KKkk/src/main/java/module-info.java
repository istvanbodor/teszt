module com.example.kkkk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kkkk to javafx.fxml;
    exports com.example.kkkk;
}