/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ProjectReports;

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
public class ProjectReportsSceneController implements Initializable {

    @FXML
    private MenuItem dashboardMenuItem;
    @FXML
    private Label projectRepoNameLabel;
    @FXML
    private Label projectRepoStrtDateLabel;
    @FXML
    private Label projectRepoBudLabel;
    @FXML
    private Label projectRepoInvoLabel;
    @FXML
    private MenuItem openMultipleProjectsRepoMenuitem;
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
    private Button viewSelRepoButton;
    @FXML
    private Button makeReportButton;

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
    private void multipleFileChooserProRepoMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void viewSelRepoButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void makeReportButtonOnClick(ActionEvent event) {
    }

    
}
