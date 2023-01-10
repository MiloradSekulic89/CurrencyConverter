package com.example.currencyexchangerfinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



import java.io.IOException;

public class HelloApplication extends Application {

    Scene scene;


    @Override
    public void start(Stage stage) throws IOException {



        Parent root = FXMLLoader.load(getClass().getResource("/fxml/hello-view.fxml"));
        Scene scene = new Scene(root);
        Image icon = new Image("file:image/logo.jpg");
        stage.setTitle("Currency Converter v1.0");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}