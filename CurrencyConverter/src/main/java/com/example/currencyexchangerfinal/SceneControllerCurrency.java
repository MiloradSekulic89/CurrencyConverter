package com.example.currencyexchangerfinal;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneControllerCurrency {

    @FXML
    public VBox VboxEchangeRateWindow;

    @FXML
    public MenuBar MenuBarExchangeRateWindow;
    @FXML
    public Menu MenuFileExchangeRateWindow;
    @FXML
    public MenuItem MenuItemCloseExchangeRateWindow;

    @FXML
    public TextArea TextAreaExchangeRateWIndow;
    @FXML
    public Button BackToHelloView;
    @FXML
    public Button ShowButton;

    @FXML
    public void switchToSceneHello(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/hello-view.fxml"));
        Scene HelloWindowScene = new Scene(root);
        //stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(HelloWindowScene);
        window.show();

    }

    public void close(ActionEvent event) throws IOException {
        Platform.exit();
    }

    public void CurrencyList (ActionEvent event) throws IOException {

        // here you can add your currency codes

        TextAreaExchangeRateWIndow.setText();

    }


}
