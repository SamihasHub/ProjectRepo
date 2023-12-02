/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Salary.pkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SalarySceneController implements Initializable {

    @FXML    private MenuItem goToDashMenuItem;
    @FXML    private Menu viewSceneMenu;
    @FXML    private ComboBox<?> designationComboBox;
    @FXML    private CheckBox checkBox;
    @FXML    private Button calculateSaveButton;
    @FXML    private TextField nameTextField;
    @FXML    private TextField salaryTextField;
    @FXML    private Button payNowButton;
    @FXML    private TreeTableColumn<?, ?> nameColumn;
    @FXML    private TreeTableColumn<?, ?> salaryColumn;
    @FXML    private Button updateSalaryButton;
    @FXML    private ComboBox<?> designationComboBox1;
    @FXML    private TextField nameTextField1;
    @FXML    private TextField updatedsalaryTextField;
    @FXML    private CheckBox updatecheckBox;
    @FXML    private Button downloadButton;
    @FXML    private TreeTableView<?> updatedSalaryTableView;
    @FXML    private TreeTableColumn<?, ?> designationColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML    private void goToDashMenuItemOnClick(ActionEvent event) {
    }


    @FXML    private void viewSceneMenuOnClick(ActionEvent event) {
    }

    @FXML    private void calculateSaveButtonOnClick(ActionEvent event) {
    }


    @FXML    private void payNowButtonOnClick(ActionEvent event) {
    }

    @FXML    private void updateSalaryButtonOnClick(ActionEvent event) {
    }

    @FXML    private void downloadButtonOnClick(ActionEvent event) {
    }
    
}
