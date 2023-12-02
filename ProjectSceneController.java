/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Projects;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ProjectSceneController implements Initializable {

    @FXML
    private MenuItem dashboardMenuItem;
    @FXML
    private MenuItem invoiceFileChooserMenuItem;
    @FXML
    private MenuItem openMultipleProjectsMenuitem;
    @FXML
    private Label allProjectViewLabel;
    @FXML
    private Label allInvoiceViewLabel;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField materialsTextField;
    @FXML
    private TextField invoiceMaterialsTextField;
    @FXML
    private TextField invoiceNameTextField;
    @FXML
    private Label resultsViewLabel;
    @FXML
    private Button matchButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dashboardMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void multipleInvoiceFileChooserMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void multipleFileChooserProMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void matchButtonOnClick(ActionEvent event) {
    }
    
}
