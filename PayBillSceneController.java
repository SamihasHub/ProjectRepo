/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bills;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class PayBillSceneController implements Initializable {

    @FXML    private TextField bankNameTextField;
    @FXML    private Button sendBillButton;
    @FXML    private TextField accNoTextField;
    @FXML    private TextField branchNameTextField;
    @FXML    private TextField billTypeTextField;
    @FXML    private TextField billAmTextField;
    @FXML    private TextField billNoTextField;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML    
    private void sendBillButtonOnClick(ActionEvent event) {
        
        int len1 = billTypeTextField.getLength();
        int len2 = billAmTextField.getLength();
        int len3 = billNoTextField.getLength();
        int len4 = branchNameTextField.getLength();
        int len5 = accNoTextField.getLength();
        int len6 = bankNameTextField.getLength();
        
        
        String size1 = String.valueOf(len1);
        String size2 = String.valueOf(len2);
        String size3 = String.valueOf(len3);
        String size4 = String.valueOf(len4);
        String size5 = String.valueOf(len5);
        String size6 = String.valueOf(len6);
        
        if ("0".equals(size1)&& "0".equals(size2)&& "0".equals(size3)&& "0".equals(size4)&& "0".equals(size5)&& "0".equals(size6)){ 
            Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Empty Email field!");
                a.showAndWait();
        }
        
        else{
            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setContentText("Email Send!");
            a.showAndWait();}
        
        
    }
       // int len1 = billTypeTextField.getLength();         
        
        
    }
        
  