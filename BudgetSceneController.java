/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Budgets;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class BudgetSceneController implements Initializable {

    @FXML
    private MenuItem goToDashMenuItem;
    @FXML
    private MenuItem shareStgMenuItem;
    @FXML
    private TableView<?> bugetTableView;
    @FXML
    private TableColumn<?, ?> expenditureColumn;
    @FXML
    private TableColumn<?, ?> expenseColmn;
    @FXML
    private TextField expendiTextField;
    @FXML
    private TextField ExpensTextField;
    @FXML
    private TextField yearTextField;
    @FXML
    private TextField totalAmTextField;
    @FXML
    private Button prepareSaveButton;
    @FXML
    private Button viewPrevButton;
    @FXML
    private Button deleteBudButton;
    @FXML
    private Button downloadBudgButton;
    @FXML
    private Button updateBudButton;
    @FXML
    private MenuItem editFileChooser;
    @FXML
    private MenuItem prevBudFileChooser;
    @FXML
    private Label yearViewLabel;
    @FXML
    private CheckBox saveTxtFileCheckBox;
    @FXML
    private Button viewEditButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToDashMenuItemOnOnClick(ActionEvent event) {
    }

    @FXML
    private void shareStgMenuItemOnOnClick(ActionEvent event) {
    }

    @FXML
    private void prepareSaveButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewPrevButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void deleteBudButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void downloadBudgButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void updateBudButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void editFileChooserOnClick(ActionEvent event) {
    }

    @FXML
    private void prevBudFileChooserOnClick(ActionEvent event) {
    }

    @FXML
    private void viewEditButtonOnClick(ActionEvent event) {
    }
    
}
