package Salary.pkg;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class PayNowStageController implements Initializable {

    @FXML    private TextField accNameTextField;
    @FXML    private TextField accNoTextField;
    @FXML    private TextField branchTextField;
    @FXML    private Button sendButton;
    @FXML    private Button exitButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML    private void sendButtonOnClick(ActionEvent event) {
    }

    @FXML    private void exitButtonOnClick(ActionEvent event) {
    }
    
}
