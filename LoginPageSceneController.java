package Login.pkg;

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
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class LoginPageSceneController implements Initializable {

    @FXML    private Button forgetPasswordButton;
    @FXML    private ComboBox<String> userComboBox;
    @FXML    private TextField userNameTextField;
    @FXML    private PasswordField passwordField;
   /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userComboBox.getItems().addAll(
                "AccountsOfficer",
                "HR Manager",
                "Pharmacist", 
                "Project Management Officer",
                "Patients",
                "Patients",
                "Supply chain and Procurement dept");
    }    


    @FXML    private void loginButtonOnAction(ActionEvent event) {
       
        String username = userNameTextField.getText();
        String password = passwordField.getText();
        if ("Samiha".equals(username) && "kryp2nite1".equals(password) && "AccountsOfficer".equals(userComboBox.getValue())) {
            SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "AccountsOfficer/AccountsDashboardScene.fxml");
        }else if ("SamihaR".equals(username) && "Kryp2nite1".equals(password) && "Project Management Officer".equals(userComboBox.getValue())) {
            SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "ProjectManager/ProjectManagerScene.fxml");
        
            //Sifat's Login
        //}else if ("SamihaR".equals(username) && "Kryp2nite1".equals(password) && "your User".equals(userComboBox.getValue())) {
        //    SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "your Dashboard Scene Location");
        //}else if ("SamihaR".equals(username) && "Kryp2nite1".equals(password) && "your User".equals(userComboBox.getValue())) {
        //    SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "your Dashboard Scene Location");
        
            //Shamit's Login
        //}else if ("SamihaR".equals(username) && "Kryp2nite1".equals(password) && "your User".equals(userComboBox.getValue())) {
        //    SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "your Dashboard Scene Location");
        //}else if ("SamihaR".equals(username) && "Kryp2nite1".equals(password) && "your User".equals(userComboBox.getValue())) {
        //    SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "your Dashboard Scene Location");
        }
        
        
        else {
            Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Login Failed!\". \"Invalid username or password.");
                a.showAndWait();}
    }    

    @FXML    private void forgetPasswordButtonOnAction(ActionEvent event) {}
    
}
