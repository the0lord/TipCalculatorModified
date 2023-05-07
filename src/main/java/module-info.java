module com.example.tipcalculatormodified {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tipcalculatormodified to javafx.fxml;
    exports com.example.tipcalculatormodified;
}