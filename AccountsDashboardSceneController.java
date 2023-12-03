package AccountsOfficer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */


import Login.pkg.SceneSwitcher;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class AccountsDashboardSceneController implements Initializable {

    @FXML    private Button signOutButton;
    @FXML    private Button statementsButton;
    @FXML    private Button salaryButton;
    @FXML    private Button billSceneButton;
    @FXML    private Button budgetSceneButton;
    @FXML    private Button reportsSceneButton;
    @FXML    private Button dealsSceneButton;
    @FXML    private Button balanceSheetSceneButton;
    @FXML    private Button prepareTaxReturnSceneButton;
    @FXML    private Button taxReturnSceneButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML   private void signOutButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Login/pkg/LoginPageScene.fxml");
    }

    @FXML   private void statementsButtonOnClick(ActionEvent event){
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Statements/StatementScene.fxml");
        
    }    

    @FXML   private void salaryButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Salary/SalaryScene.fxml");   
    }

    @FXML    private void billSceneButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Bills/BillScene.fxml");
      
    }

    @FXML    private void budgetSceneButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Budgets/BudgetScene.fxml");
    }

    @FXML    private void reportsSceneButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Reports/ReportScene.fxml");
    }

    @FXML    private void dealsSceneButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Deals/DealsScene.fxml");
    }

    @FXML    private void balanceSheetSceneButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "BalanceSheets/BalanceSheetScene.fxml");
    }

    @FXML
    private void prepareTaxReturnSceneButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "TaxesAndTaxReturn/PrepareTaxScene.fxml");
    }

    @FXML
    private void taxReturnSceneButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event),"TaxesAndTaxReturn/TaxReturnScene.fxml");
    
    }
    }
    

