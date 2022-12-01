package com.mycompany.splittingfiles;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Class with a GUI that splits up a file
 * @author Nolan Lowhorn
 */
public class App extends Application {
    
    Label lblMain;

    /**
     * Method that opens the main window
     * @param stgMain 
     */
    @Override
    public void start(Stage stgMain) {
        
        lblMain = new Label("Please enter what file you'd like to split and\ninto how many pieces.");
        lblMain.setPadding(new Insets(0, 0, 0, 20));
        
        Label lblFile = new Label("File: ");
        Label lblPieces = new Label("Number of Pieces: ");
        
        TextField txtFile = new TextField();
        TextField txtPieces = new TextField();
        
        Button btnSplit = new Button("Split");
        btnSplit.setOnAction(e -> {
            System.out.println(System.getProperty("user.dir"));
            splitFiles(txtFile.getText(), Integer.parseInt(txtPieces.getText()));
        });
        
        VBox vbxLeft = new VBox(lblFile, lblPieces);
        vbxLeft.setSpacing(10);
        vbxLeft.setPadding(new Insets(0, 0, 0, 20));
        VBox vbxRight = new VBox(txtFile, txtPieces, btnSplit);
        
        HBox hbxCenter = new HBox(vbxLeft, vbxRight);
        hbxCenter.setPadding(new Insets(10, 0, 0, 0));
        
        BorderPane bpMain = new BorderPane();
        bpMain.setTop(lblMain);
        bpMain.setCenter(hbxCenter);
        Scene scnMain = new Scene(bpMain, 300, 200);
        
        stgMain.setScene(scnMain);
        stgMain.setTitle("Split Files");
        stgMain.show();
    }//end start

    /**
     * Method that reads all the bytes in a file, splits them up, and then writes them into smaller files
     * @param file String - Name of the original file
     * @param numberOfPieces int - Number of smaller files to be split into
     */
    public void splitFiles(String file, int numberOfPieces){
        try{
            FileInputStream input = new FileInputStream(file);
            byte[] fileBytes = input.readAllBytes();
            int pieceLength = fileBytes.length / numberOfPieces;
            for(int i = 0; i < numberOfPieces; i++){
                int start = pieceLength * i;
                int end = pieceLength * (i + 1);
                byte[] splitBytes = Arrays.copyOfRange(fileBytes, start, end);
                File newFile = new File(file + "." + (i + 1));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(newFile));
                output.write(splitBytes);
                output.close();
            input.close();
            }//end for
        }//end try
        catch(Exception e){  
            lblMain.setText("Couldn't find file");
        }//end catch
    }//end splitFile
    
    public static void main(String[] args) {
        launch();
    }//end main

}//end App class
