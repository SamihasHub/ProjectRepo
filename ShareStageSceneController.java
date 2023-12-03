/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Reports;

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
public class ShareStageSceneController implements Initializable {

    @FXML
    private TextField emailTextFielfd;
    @FXML
    private Button sendEmailButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendEmailButtonOnClick(ActionEvent event) {
        
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

    
}
