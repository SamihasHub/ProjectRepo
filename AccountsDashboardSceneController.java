/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class AccountsDashboardSceneController implements Initializable {

    @FXML
    private Button signOutButton;
    @FXML
    private ComboBox<?> salaryComboBox;
    @FXML
    private ComboBox<?> balanceSheetsComboBox;
    @FXML
    private ComboBox<?> proflieComboBox;
    @FXML
    private ComboBox<?> budgetComboBox;
    @FXML
    private ComboBox<?> dealsComboBox;
    @FXML
    private ComboBox<?> taxesComboBox;
    @FXML
    private ComboBox<?> reportsComboBox;
    @FXML
    private ComboBox<?> billsComboBox;
    @FXML
    private Button statementsButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signOutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void statementsButtonOnClick(ActionEvent event) {
    }
    
}
