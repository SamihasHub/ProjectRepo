/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package OnGoingProjects;

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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class OnGoingProjectSceneController implements Initializable {

    @FXML
    private MenuItem dashBMenuItem;
    @FXML
    private MenuItem openMultipleProjectsMenuitem;
    @FXML
    private Label progressResultsLabel;
    @FXML
    private Button checkProgressButton;
    @FXML
    private TableView<?> selectedProjectTable;
    @FXML
    private TableColumn<?, ?> nameColumn;
    @FXML
    private TableColumn<?, ?> timeColumn;
    @FXML
    private TableColumn<?, ?> budgetColumn;
    @FXML
    private TableColumn<?, ?> rawMaterialsColumn;
    @FXML
    private Button sendEmailButton;
    @FXML
    private Label ongoingProjectViewLabel;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextField budgetTextField;
    @FXML
    private TextField materialsTextField;
    @FXML
    private Button upload2TableButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void going2DashBMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void multipleFileChooserProMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void checkProgressButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void sendEmailButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void upload2TableButtonOnClick(ActionEvent event) {
    }
    
}
