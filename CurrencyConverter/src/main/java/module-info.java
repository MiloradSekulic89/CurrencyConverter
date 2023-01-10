module com.example.currencyexchangerfinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires com.google.gson;




    opens com.example.currencyexchangerfinal to javafx.fxml;
    exports com.example.currencyexchangerfinal;

}