/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Salary;

import Login.pkg.SceneSwitcher;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class SalarySceneController implements Initializable {

    @FXML
    private ComboBox<String> designationComboBox;
    @FXML
    private CheckBox checkBox;
    @FXML
    private Button calculateSaveButton;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField salaryTextField;
    @FXML
    private Button payNowButton;
    @FXML
    private Button updateSalaryButton;
    @FXML
    private ComboBox<String> designationComboBox1;
    @FXML
    private TextField nameTextField1;
    @FXML
    private TextField updatedsalaryTextField;
    @FXML
    private CheckBox updatecheckBox;
    
    @FXML
    private Button goToDashButton;
    @FXML
    private Button viewSalarySceneButton;
    @FXML
    private TextField taxChargeTextField;
    @FXML
    private TableView<SalaryTableScene> updatedSalaryTable;
    @FXML
    private TableColumn<SalaryTableScene, String> nameColumn1;
    @FXML
    private TableColumn<SalaryTableScene, String> designationColumn1;
    @FXML
    private TableColumn<SalaryTableScene, String> salaryColumn1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        designationComboBox.getItems().addAll("Pharmacists"
                ,"Researchers",
                "Interns",
                "HR",
                "Project Manager",
                "IT Officer");
        
        designationComboBox1.getItems().addAll("Pharmacists"
                ,"Researchers",
                "Interns",
                "HR",
                "Project Manager",
                "IT Officer");
      
        nameColumn1.setCellValueFactory(
        new PropertyValueFactory<SalaryTableScene, String>("name"));
        designationColumn1.setCellValueFactory(
        new PropertyValueFactory<SalaryTableScene, String>("deg"));
        salaryColumn1.setCellValueFactory(
        new PropertyValueFactory<SalaryTableScene, String>("salary"));
        
    }    


    @FXML
    private void calculateSaveButtonOnClick(ActionEvent event) {
        if(checkBox.isSelected()){
            File f = null;
            FileOutputStream fos = null;
            DataOutputStream dos = null;
        
        try {
            f = new File(nameTextField.getText()+".bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
   
            dos = new DataOutputStream(fos);
            
            dos.writeInt(Integer.parseInt(taxChargeTextField.getText()));
            dos.writeUTF(nameTextField.getText());
            dos.writeUTF(designationComboBox.getValue());
            dos.writeFloat(Float.parseFloat(salaryTextField.getText()));

        } catch (IOException ex) {
            Logger.getLogger(SalarySceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(SalarySceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        }else{
            Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Empty Email field!");
                a.showAndWait();}
        }
        
    

    @FXML
    private void payNowButtonOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("Salary/PayNowStage", true);
        
    }

    @FXML
    private void updateSalaryButtonOnClick(ActionEvent event) {
        
        String n, d, s;
        n = nameColumn1.getText();
        s = updatedsalaryTextField.getText(); 
        d = designationComboBox1.getValue();
        
        if(updatecheckBox.isSelected()){
            File f = null;
            FileOutputStream fos = null;
            DataOutputStream dos = null;
        
        try {
            f = new File(nameTextField1.getText()+".bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
   
            dos = new DataOutputStream(fos);
            
            //dos.writeInt(Integer.parseInt(taxChargeTextField.getText()));
            dos.writeUTF(nameTextField1.getText());
            dos.writeUTF(designationComboBox1.getValue());
            dos.writeInt(Integer.parseInt(updatedsalaryTextField.getText()));;

        } catch (IOException ex) {
            Logger.getLogger(SalarySceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(SalarySceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        }else{
            updatedSalaryTable.getItems().add(
        new SalaryTableScene(n, d,s));
            
        }
        
    }


    @FXML
    private void goToDashButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "AccountsOfficer/AccountsDashboardScene.fxml");
        
    }

    @FXML
    private void viewSalarySceneButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "Salary/ViewSalaryScene.fxml");
        
    }
    
}
