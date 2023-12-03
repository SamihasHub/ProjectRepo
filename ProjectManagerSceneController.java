/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ProjectManager;

import Login.pkg.SceneSwitcher;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import Login.pkg.LoginPageSceneController;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ProjectManagerSceneController implements Initializable {

    @FXML    private Button createProjectsButton;
    @FXML    private Button onGoingProjectsButton;
    @FXML    private Button projectsButton;
    @FXML    private Button reportsButton;
    @FXML    private Button signOutButton;
    @FXML    private Button viewStockRecoSceneButton;
    @FXML    private Button makeStockRecoSceneButton;
    @FXML    private Label userNameLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        userNameLabel.setText("SamihaR");
        // TODO
    }    

    @FXML    private void go2CreateProjectButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "CreateProjects/CreateProjectScene.fxml");
        
    }

    @FXML    private void go2OnGoingProjectButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event),"OnGoingProjects/OnGoingProjectScene.fxml");
    }

    @FXML    private void go2ProjectButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Projects/ProjectScene.fxml");
    }

    @FXML    private void signOutButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Login/pkg/LoginScene.fxml");
    }

    @FXML    private void go2ProReportButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "ProjectReports/ProjectReportsScene.fxml");
    }

    @FXML    private void go2ViewStockRecoSceneButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Stocks/ViewStockRecordsScene.fxml");
    }

    @FXML    private void go2MakeStockRecoSceneButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Stocks/RecordNewStocksScene.fxml");
    }
    
}
