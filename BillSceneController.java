/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bills;

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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class BillSceneController implements Initializable {

    @FXML    private Menu goDashMenu;
    @FXML    private TextField billamountTextField;
    @FXML    private ComboBox<String> billOptionComboBox;
    @FXML    private Button showBillButton;
    @FXML    private Button payBillStgButton;
    @FXML    private Button downloadBillButton;
    @FXML    private CheckBox binCheckBox;
    @FXML    private TextField billTypeTextField;
    @FXML    private TextArea billResultTextArea;
    @FXML    private ComboBox<String> selectbillComboBox;
    @FXML    private TextField billNoTextField;
    @FXML    private Button prepareBillButton;
    @FXML    private Label showPreparedBillLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goDashMenuOnClick(ActionEvent event) {
    }

    @FXML
    private void showBillButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void payBillStgButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void downloadBillButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void prepareBillButtonOnClick(ActionEvent event) {
    }
    
}
