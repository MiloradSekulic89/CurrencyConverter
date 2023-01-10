package com.example.currencyexchangerfinal;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;


public class SceneControllerAboutWindow implements Initializable {


    // about window nodes
    @FXML
    public VBox VboxAbout;
    @FXML
    public MenuBar aboutMenu;
    @FXML
    public Menu aboutMenuFile;
    @FXML
    public MenuItem miClose2;
    @FXML
    public Text aboutText1;
    @FXML
    public Text aboutText2;
    @FXML
    public Text aboutText3;
    @FXML
    public Button Back;
    @FXML
    public ImageView logo;

// end of about window nodes

    Image Logo = new Image("file:image/commi.jpg");

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
    public void initialize(URL arg0, ResourceBundle arg1) {


        logo.setImage(Logo);



    }



}
