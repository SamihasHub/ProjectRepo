/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class PayNowStageController implements Initializable {

    @FXML
    private TextField accNameTextField;
    @FXML
    private TextField accNoTextField;
    @FXML
    private TextField branchTextField;
    @FXML
    private Button sendButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendButtonOnClick(ActionEvent event) {
        
        int len1 = accNameTextField.getLength();
        int len2 = accNoTextField.getLength();
        int len3 = branchTextField.getLength();
        
        String size1 = String.valueOf(len1);
        String size2 = String.valueOf(len2);
        String size3 = String.valueOf(len3);
        
        if ("0".equals(size1)&& 
                "0".equals(size2)&& 
                "0".equals(size3)){
            Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Empty Email field!");
                a.showAndWait();
        }
        
        else{
            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setContentText("Email Send!");
            a.showAndWait();}
        }
        
    }
