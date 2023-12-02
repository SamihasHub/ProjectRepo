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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ViewSalarySceneController implements Initializable {

    @FXML    private Button downloadSelctedButton;
    @FXML    private ComboBox<?> degSelectionComboBox;
    @FXML    private TreeTableView<?> viewSalaryTableView;
    @FXML    private TreeTableColumn<?, ?> viewNameColumn;
    @FXML    private TreeTableColumn<?, ?> viewDegColumn;
    @FXML    private TreeTableColumn<?, ?> veiwSalaryColumn;
    @FXML    private Button dashboardSceneButton;
    @FXML    private Button showSalaryButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML    private void downloadSelctedButtonOnClick(ActionEvent event) {
    }

    @FXML    private void dashboardSceneButtonOnClick(ActionEvent event) {
    }

    @FXML    private void showSalaryButtonOnClick(ActionEvent event) {
    }
    
}
