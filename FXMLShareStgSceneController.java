/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Budgets;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class FXMLShareStgSceneController implements Initializable {

    @FXML    private TextField emailTextFielfd;
    @FXML    private Button sendEmailButton;
    @FXML    private MenuButton attatchmentMenueButton;
    @FXML    private MenuItem fileChooserMenuItem;
    @FXML    private Label budgetViewLabel;
     private ArrayList<String> fileTypeList, fileTypeList2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        fileTypeList = new ArrayList<String>();
        fileTypeList.add("*.bin");
        
        fileTypeList2 = new ArrayList<String>();
        fileTypeList2.add("*.*");
    }    

    @FXML    private void sendEmailButtonOnClick(ActionEvent event) {
        
        int len = emailTextFielfd.getLength();
        String size = String.valueOf(len);
        
        if ("0".equals(size)){ 
            Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Empty Email field!");
                a.showAndWait();}
        
        else{
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText("Email Send!");
        a.showAndWait();
    }
         
    }

    @FXML    private void fileChooserMenuItemOnClick(ActionEvent event) {
        
        FileChooser fc = new FileChooser();
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files", fileTypeList));
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All files", fileTypeList2));
        
         File f = fc.showOpenDialog(null);
         if(f != null){
            try {
                Scanner sc = new Scanner(f);
                String str="";
                while(sc.hasNextLine()){
                    str+=sc.nextLine()+"\n";
                }
                budgetViewLabel.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
       
    } 
}
