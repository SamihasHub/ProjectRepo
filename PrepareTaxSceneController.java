/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package TaxesAndTaxReturn;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class PrepareTaxSceneController implements Initializable {

    @FXML
    private TextArea taxViewTextArea;
    @FXML
    private MenuItem fileChooserForTaxMenuItem;
    @FXML
    private TextField yearTextField;
    @FXML
    private Button prepareSaveTaxReturnButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fileChooserForTaxMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void prepareSaveTaxReturnButtonOnClick(ActionEvent event) {
    }
    
}
