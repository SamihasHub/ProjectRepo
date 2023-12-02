package AccountsOfficer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
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
    @FXML    private ComboBox<String> proflieComboBox;
    @FXML    private Button statementsButton;
    @FXML    private Button salaryButton;
    @FXML    private Button billSceneButton;
    @FXML
    private Button budgetSceneButton;
    @FXML
    private Button reportsSceneButton;
    @FXML
    private Button dealsSceneButton;
    @FXML
    private Button balanceSheetSceneButton;
    @FXML
    private MenuItem taxReturnSceneMenuItem;
    @FXML
    private MenuItem prepareTaxReturnSceneMenuItem;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML    private void signOutButtonOnClick(ActionEvent event) {
    }

    @FXML    private void statementsButtonOnClick(ActionEvent event) {
    }

    @FXML    private void salaryButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void billSceneButtonOnClick(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BillScene.fxml"));
            Parent secondRoot =loader.load();
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    //(Stage) ((Node) event.getSource()).getScene().getWindow();
    }

    @FXML
    private void budgetSceneButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void reportsSceneButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void dealsSceneButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void balanceSheetSceneButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void taxReturnSceneMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void prepareTaxReturnSceneMenuItemOnClick(ActionEvent event) {
    }
    
}
