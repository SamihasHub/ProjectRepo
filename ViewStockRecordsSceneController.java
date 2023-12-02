/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Stocks;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ViewStockRecordsSceneController implements Initializable {

    @FXML
    private MenuItem dashboardMenuItem;
    @FXML
    private MenuItem stockInvenFileChooserMenuItem;
    @FXML
    private TextArea invenStockViewTextArea;
    @FXML
    private TableView<?> projectStockTable;
    @FXML
    private TableColumn<?, ?> proNameColumn;
    @FXML
    private TableColumn<?, ?> proStockColumn;
    @FXML
    private TableColumn<?, ?> stockDistritubedColumn;
    @FXML
    private TableColumn<?, ?> stockAvailColumn;
    @FXML
    private MenuItem projectStockFileChooserMenuItem;
    @FXML
    private TextArea projectStockViewTextArea;
    @FXML
    private TextField projectNameTextField;
    @FXML
    private TextField projectStockTextField;
    @FXML
    private TextField stockDisTextField;
    @FXML
    private TextField invenStockTextField;
    @FXML
    private Label stockLevelResultLabel;
    @FXML
    private Button showInTableButton;
    @FXML
    private Button sendRequiButton;
    @FXML
    private Button checkLevelButton;

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
    private void stockInvenFileChooserMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void projectStockFileChooserMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void showInTableButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void sendRequiButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void checkLevelButtonOnClick(ActionEvent event) {
    }
    
}
