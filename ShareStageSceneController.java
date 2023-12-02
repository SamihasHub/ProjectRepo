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
    @FXML
    private Button exitButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendEmailButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void existButtonOnClick(ActionEvent event) {
    }
    
}
