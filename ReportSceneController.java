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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ReportSceneController implements Initializable {

    @FXML
    private MenuItem dashBMenuItem;
    @FXML
    private MenuButton finanFileChooserMenuItem;
    @FXML
    private MenuButton reciFileChooserMenuItem;
    @FXML
    private MenuItem confiFileChooserMenuItem;
    @FXML
    private Button downloadButton;
    @FXML
    private Button shareButton;
    @FXML
    private TextArea viewSelectedFileTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dashBMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void finanFileChooserMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void payFileChooserMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void reciFileChooserMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void confiFileChooserMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void downloadButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void shareButtonOnClick(ActionEvent event) {
    }
    
}
