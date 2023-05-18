module com.circle.circlefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.circle.circlefx to javafx.fxml;
    exports com.circle.circlefx;
}