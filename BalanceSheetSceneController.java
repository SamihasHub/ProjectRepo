/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package BalanceSheets;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class BalanceSheetSceneController implements Initializable {

    @FXML
    private Menu goDashBMenu;
    @FXML
    private Menu shareStgMenu;
    @FXML
    private TableView<?> balanceSheetTableView;
    @FXML
    private TableColumn<?, ?> particularsColumn;
    @FXML
    private TableColumn<?, ?> currentColumn;
    @FXML
    private TableColumn<?, ?> prevColumn;
    @FXML
    private RadioButton weeklyRB;
    @FXML
    private RadioButton quarterlyRB;
    @FXML
    private RadioButton monthlyRB;
    @FXML
    private RadioButton annuallyRB;
    @FXML
    private TextField particularsTextField;
    @FXML
    private TextField prevAmTextField;
    @FXML
    private TextField currAmTextField;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Button prepareAndSaveBalSButton;
    @FXML
    private Button viewBalSButton;
    @FXML
    private ComboBox<?> periodComboBox;
    @FXML
    private Button downloadBalSButton;
    @FXML
    private Label viewLabel;
    @FXML
    private Menu editAndSAveBalSMenu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goDashBMenuOnClick(ActionEvent event) {
    }


    @FXML
    private void shareStgMenuOnClick(ActionEvent event) {
    }

    @FXML
    private void weeklyRBOnClick(ActionEvent event) {
    }

    @FXML
    private void quarterlyRBOnClick(ActionEvent event) {
    }

    @FXML
    private void monthlyRBOnClick(ActionEvent event) {
    }

    @FXML
    private void annuallyRBOnClick(ActionEvent event) {
    }

    @FXML
    private void datePickerOnClick(ActionEvent event) {
    }

    @FXML
    private void prepareAndSaveBalSButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewBalSButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void downloadBalSButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void editAndSAveBalSMenuOnClick(ActionEvent event) {
    }
    
}
