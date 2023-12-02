/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ProjectManager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ProjectManagerSceneController implements Initializable {

    @FXML
    private Button createProjectsButton;
    @FXML
    private Button onGoingProjectsButton;
    @FXML
    private Button projectsButton;
    @FXML
    private Button reportsButton;
    @FXML
    private Button signOutButton;
    @FXML
    private MenuButton stocksMenuButton;
    @FXML
    private MenuItem viewStockRecoMenuItem;
    @FXML
    private MenuItem makeStockRecotMenuItem;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void go2CreateProjectButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void go2OnGoingProjectButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void go2ProjectButtonOnClick(ActionEvent event) {
    }



    @FXML
    private void signOutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void go2ProReportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void go2ViewStockRecoMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void go2MakeStockRecotMenuItemOnClick(ActionEvent event) {
    }
    
}
