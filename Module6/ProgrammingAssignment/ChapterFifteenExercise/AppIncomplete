package com.mycompany.investmentcalculator;

import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Class with a GUI that can calculate the return of an investment
 * @author Nolan Lowhorn
 */
public class App extends Application {

    /**
     * Opens a window for calculating the return of an investment
     * @param stgMain Stage - Holds everything in a window
     */
    @Override
    public void start(Stage stgMain) {
        
        Label lblInvest = new Label("Investment Amount: ");
        Label lblYear = new Label("Number of Years: ");
        Label lblRate = new Label("Annual Interest Rate (%): ");
        Label lblValue = new Label("Future Value: ");
        
        TextField txtInvest = new TextField();
        TextField txtYear = new TextField();
        TextField txtRate = new TextField();
        TextField txtValue = new TextField();
        
        Button btnCalculate = new Button("Calculate");
        btnCalculate.setOnAction(event -> {
            calculateInvestment(txtInvest, txtYear, txtRate, txtValue);
        });
        
        VBox vbxLabels = new VBox(lblInvest, lblYear, lblRate, lblValue);
        vbxLabels.setSpacing(10);
        VBox vbxFields = new VBox(txtInvest, txtYear, txtRate, txtValue, btnCalculate);
        
        HBox hbxEverything = new HBox(vbxLabels, vbxFields);
        
        Pane pnMain = new Pane();
        pnMain.getChildren().addAll(hbxEverything);
        Scene scnMain = new Scene(pnMain, 300, 200);
        
        stgMain.setScene(scnMain);
        stgMain.setTitle("Calculate Investment");
        stgMain.show();
    }//end start

    /**
     * Calculates the return on an investment
     * @param txtInvest TextField - Original amount invested
     * @param txtYear TextField - How many years after original investment
     * @param txtRate TextField - Annual interest rate
     * @param txtValue TextField - Amount returned
     */
    public void calculateInvestment(TextField txtInvest, TextField txtYear, TextField txtRate, TextField txtValue){
        DecimalFormat df = new DecimalFormat("#.##");
        double invest = Double.parseDouble(txtInvest.getText());
        double year = Double.parseDouble(txtYear.getText());
        double rate = Double.parseDouble(txtRate.getText()) / 100 + 1;
        double futureValue = rate;
        futureValue = Math.pow(futureValue, year);
        futureValue *= invest;
        txtValue.setText("$" + df.format(futureValue));
    }//end calculateInvestment
    
    public static void main(String[] args) {
        launch();
    }//end main

}//end App class
