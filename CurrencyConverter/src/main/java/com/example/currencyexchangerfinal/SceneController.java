package com.example.currencyexchangerfinal;

import com.google.gson.*;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class SceneController implements Initializable {

@FXML
    public VBox VboxMain;
@FXML
    public VBox Vbox1;
@FXML
    public MenuBar MenuBar;
@FXML
    public Menu MenuFile;
@FXML
    public MenuItem miClose;

@FXML
    public Button CurrencyList;
@FXML
    public HBox Hbox1;
@FXML
    public VBox Vbox2;
@FXML
    public AnchorPane AnchorPane;
@FXML
    public Text textLogo;
@FXML
    public ImageView centralLogo;
@FXML
    public VBox Vbox3;



@FXML
    public Text text1;
@FXML
    public ChoiceBox<String> fromChoiceBox;
@FXML
    public Text text2;
@FXML
    public ChoiceBox<String> toChoiceBox;
@FXML
    public Text text3;
@FXML
    public TextArea amountText;
@FXML
    public Button convert;
@FXML
    public Text text4;
@FXML
    public TextArea resultText;
@FXML
    public Button aboutWindow;
@FXML
    public ImageView arrows;
@FXML
    public ImageView CompanyLogo;




    public Stage stage;
    public Scene scene;


Image logo = new Image("file:image/logo.jpg");
Image Companylogo = new Image("file:image/commi.jpg");
Image Arrows = new Image("file:image/arrows.jpg");
public String fromCurrency[] = {"USD","EUR","GBP","CAD","AUD","JPY","ADA","AED","AFN","AMD","ANG","AOA","ARS","AUD","AWG","AZN","BAM","BBD","BCH","BDT","BGN","BHD","BIF","BND","BOB","BRL","BSD","BTC","BTN","BWP","BYN","BYR","BZD","CDF","CHF","CLP","CNY","COP","CRC","CUC","CUP","CVE","CZK","DJF","DKK","DOGE","DOP","DOT","DZD","EEK","EGP","ERN","ETB","ETH","FJD","FKP","GEL","GGP","GHS","GIP","GMD","GNF","GTQ","GYD","HKD","HNL","HRK","HTG","HUF","IDR","ILS","IMP","INR","IQD","IRR","ISK","JEP","JMD","JOD","JPY","KES","KGS","KHR","KMF","KPW","KRW","KWD","KYD","KZT","LAK","LBP","LINK","LKR","LRD","LSL","LTC","LTL","LUNA","LVL","LYD","MAD","MGA","MKD","MMK","MNT","MOP","MRU","MUR","MVR","MWK","MXN","MYR","MZN","NAD","NGN","NOK","NPR","NZD","OMR","PAB","PEN","PGK","PHP","PKR","PLN","PYG","QAR","RON","RSD","RUB","RWF","SAR","SBD","SCR","SDG","SEK","SGD","SHP","SLE","SLL","SOS","SPL","SRD","STN","SVC","SYP","SZL","THB","TJS","TMT","TND","TOP","TRY","TTD","TVD","TWD","TZS","UAH","UGX","UNI","UYU","UZS","VEF","VND","VUV","WST","XAF","XAG","XAU","XCD","XDR","XLM","XOF","XPD","XPF","XPT","XRP","YER","ZAR","ZMK","ZMW","ZWD"};
public String toCurrency[] = {"USD","EUR","GBP","CAD","AUD","JPY","ADA","AED","AFN","AMD","ANG","AOA","ARS","AUD","AWG","AZN","BAM","BBD","BCH","BDT","BGN","BHD","BIF","BND","BOB","BRL","BSD","BTC","BTN","BWP","BYN","BYR","BZD","CDF","CHF","CLP","CNY","COP","CRC","CUC","CUP","CVE","CZK","DJF","DKK","DOGE","DOP","DOT","DZD","EEK","EGP","ERN","ETB","ETH","FJD","FKP","GEL","GGP","GHS","GIP","GMD","GNF","GTQ","GYD","HKD","HNL","HRK","HTG","HUF","IDR","ILS","IMP","INR","IQD","IRR","ISK","JEP","JMD","JOD","JPY","KES","KGS","KHR","KMF","KPW","KRW","KWD","KYD","KZT","LAK","LBP","LINK","LKR","LRD","LSL","LTC","LTL","LUNA","LVL","LYD","MAD","MGA","MKD","MMK","MNT","MOP","MRU","MUR","MVR","MWK","MXN","MYR","MZN","NAD","NGN","NOK","NPR","NZD","OMR","PAB","PEN","PGK","PHP","PKR","PLN","PYG","QAR","RON","RSD","RUB","RWF","SAR","SBD","SCR","SDG","SEK","SGD","SHP","SLE","SLL","SOS","SPL","SRD","STN","SVC","SYP","SZL","THB","TJS","TMT","TND","TOP","TRY","TTD","TVD","TWD","TZS","UAH","UGX","UNI","UYU","UZS","VEF","VND","VUV","WST","XAF","XAG","XAU","XCD","XDR","XLM","XOF","XPD","XPF","XPT","XRP","YER","ZAR","ZMK","ZMW","ZWD"};



Scene scene1, scene2;



    public void switchToSceneAbout(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/about-view.fxml"));
        Scene aboutWindowScene = new Scene(root);
        //stage info
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(aboutWindowScene);
        window.show();

    }

    public void switchToSceneCurrencyList(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/currency.fxml"));
        Scene currencyListWindowScene = new Scene(root);
        //stage info
        Stage window3 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window3.setScene(currencyListWindowScene);
        window3.show();

    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        fromChoiceBox.getItems().addAll(fromCurrency);
        fromChoiceBox.setOnAction(this::from);
        toChoiceBox.getItems().addAll(toCurrency);
        toChoiceBox.setOnAction(this::to);
        centralLogo.setImage(logo);
        arrows.setImage(Arrows);
        CompanyLogo.setImage(Companylogo);

    }

    @FXML
    public void from (ActionEvent event) {
        String  from = fromChoiceBox.getValue();
        text1.setText(from);
    }

    @FXML
    public void to (ActionEvent event){
        String to = toChoiceBox.getValue();
        text2.setText(to);
    }


    // for privacy of code this section I had to delete but you can get your own api key and just use the code to run it
    // keep in mind you will have to edit the string url to match your api querry otherwise it will not work
    @FXML
    protected void Convert(ActionEvent event) throws IOException {

        String from = fromChoiceBox.getValue();
        String to = toChoiceBox.getValue();
        double amount = Double.parseDouble(amountText.getText());

        String convertUrl = "" + to;
        URL url1 = new URL(convertUrl);
        HttpURLConnection request = (HttpURLConnection) url1.openConnection();
        request.connect();

        JsonParser jp1 = new JsonParser();
        JsonElement root1 = jp1.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj1 = root1.getAsJsonObject();

        double req_result = jsonobj1.get("result").getAsDouble();
        double finResult = req_result * amount;

        NumberFormat f = NumberFormat.getCurrencyInstance();
        DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) f).getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol("");
        ((DecimalFormat) f).setDecimalFormatSymbols(decimalFormatSymbols);
        String finalResult = f.format(finResult);

        resultText.setText(finalResult + "\t" + to);

    }

    @FXML
    public void close (ActionEvent event){

        Platform.exit();
    }





}
