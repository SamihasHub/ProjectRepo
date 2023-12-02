/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Statements;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class StatementSceneController implements Initializable {

    @FXML    private MenuItem singleFileChooserMenuItem;
    @FXML    private MenuItem updateAFileChooserMenuItem;
    @FXML    private Label statementFileContentLabel;
    @FXML    private TextArea editTextArea;
    @FXML    private Button downloadStateButton;
    @FXML    private Button updateStatementButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML    private void backToDashMenuOnClick(ActionEvent event) {
    }

    @FXML    private void singleFileChooserMenuItemOnClick(ActionEvent event) {
    }

    @FXML    private void updateAFileChooserMenuItemOnClick(ActionEvent event) {
    }

    @FXML    private void downloadStateButtonOnClick(ActionEvent event) {
    }

    @FXML    private void updateStatementButtonOnlick(ActionEvent event) {
    }
    
}
