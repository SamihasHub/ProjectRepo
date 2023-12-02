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
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class RecordNewStocksSceneController implements Initializable {

    @FXML
    private MenuItem dashboardMenuItem;
    @FXML
    private MenuItem viewStocksMenuItem;
    @FXML
    private TextField nameProTextField;
    @FXML
    private TextField projectStocks;
    @FXML
    private DatePicker projectDatePicker;
    @FXML
    private Button uploadViewButton;
    @FXML
    private CheckBox saveAsTxtCheckBox;
    @FXML
    private TableColumn<?, ?> nameProColumn;
    @FXML
    private TableColumn<?, ?> dateProColumn;
    @FXML
    private TableColumn<?, ?> stocksRecoColumn;
    @FXML
    private TableView<?> newStocksTableView;

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
    private void viewStocksMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void uploadViewButtonOnClick(ActionEvent event) {
    }
    
}
