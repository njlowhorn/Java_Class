package com.mycompany.javafximages;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * A GUI with four different flags
 * @author Nolan Lowhorn
 */
public class App extends Application {

    /**
     * Creates a window for four different images
     * @param stgMain Stage - Holds everything in the window
     */
    @Override
    public void start(Stage stgMain) {
        
        Image imgUS = new Image("us.gif");
        ImageView imvUS = new ImageView();
        imvUS.setImage(imgUS);
        imvUS.setFitWidth(100);
        imvUS.setPreserveRatio(true);
        
        Image imgUK = new Image("uk.gif");
        ImageView imvUK = new ImageView();
        imvUK.setImage(imgUK);
        imvUK.setFitWidth(100);
        imvUK.setPreserveRatio(true);
        
        Image imgCanada = new Image("ca.gif");
        ImageView imvCanada = new ImageView();
        imvCanada.setImage(imgCanada);
        imvCanada.setFitWidth(100);
        imvCanada.setPreserveRatio(true);
        
        Image imgChina = new Image("china.gif");
        ImageView imvChina = new ImageView();
        imvChina.setImage(imgChina);
        imvChina.setFitWidth(100);
        imvChina.setPreserveRatio(true);
        
        HBox hbxTopImages = new HBox();
        hbxTopImages.getChildren().addAll(imvUS, imvUK);
        
        HBox hbxBottomImages = new HBox();
        hbxBottomImages.getChildren().addAll(imvCanada, imvChina);
        
        VBox vbxImages = new VBox();
        vbxImages.getChildren().addAll(hbxTopImages, hbxBottomImages);
        
        Button btnQuit = new Button("Exit");
        btnQuit.setOnAction(buttonClick -> {
            exit(stgMain);
        });
        
        HBox hbxQuit = new HBox();
        hbxQuit.getChildren().addAll(btnQuit);
        hbxQuit.setAlignment(Pos.CENTER_RIGHT);
        
        BorderPane bpMain = new BorderPane();
        bpMain.setCenter(vbxImages);
        bpMain.setBottom(hbxQuit);
        Scene scnMain = new Scene(bpMain, 300, 200);
        
        stgMain.setScene(scnMain);
        stgMain.setTitle("Four Images");
        stgMain.show();
    }//end start
    
    /**
     * Closes the window
     * @param stgMain Stage - Holds everything in the window
     */
    public void exit(Stage stgMain){
        stgMain.close();
    }//end exit

    public static void main(String[] args) {
        launch();
    }//end main

}//end App class
