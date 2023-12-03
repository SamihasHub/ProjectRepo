/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ProjectReports;

import Login.pkg.SceneSwitcher;
import java.io.File;
import java.io.FileWriter;
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
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ProjectReportsSceneController implements Initializable {

    @FXML
    private Button goToDashButton;
    @FXML
    private TextField emailTextField;
    @FXML
    private Label projectRepoNameLabel;
    @FXML
    private Label projectRepoStrtDateLabel;
    @FXML
    private Label projectRepoBudLabel;
    @FXML
    private Label projectRepoInvoLabel;
    @FXML
    private Button viewSelRepoButton;
    @FXML
    private TextField proNameTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextField totalBudgetTextField;
    @FXML
    private TextField rawMaterialsTextField;
    @FXML
    private CheckBox saveTxtFileCheckBox;
    @FXML
    private Button saveShowButton;
    @FXML
    private Button shareButton;
    @FXML
    private TableView<ProjectRepoTable> projectReportTable;
    @FXML
    private TableColumn<ProjectRepoTable, String> nameCol;
    @FXML
    private TableColumn<ProjectRepoTable, String> timeCol;
    @FXML
    private TableColumn<ProjectRepoTable, String> budgetCol;
    @FXML
    private TableColumn<ProjectRepoTable, String> rawMaterialsCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        nameCol.setCellValueFactory(
        new PropertyValueFactory<ProjectRepoTable, String>("nameP"));
        timeCol.setCellValueFactory(
        new PropertyValueFactory<ProjectRepoTable, String>("tTime"));
        budgetCol.setCellValueFactory(
        new PropertyValueFactory<ProjectRepoTable, String>("tBudget"));
        rawMaterialsCol.setCellValueFactory(
        new PropertyValueFactory<ProjectRepoTable, String>("rMaterials"));
        
        
    }    



    @FXML
    private void goToDashButtonOnClick(ActionEvent event) {
        
          SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "ProjectManager/ProjectManagerDashboardScene.fxml");
        
    }

    @FXML
    private void shareButtonOnClick(ActionEvent event) {
        
        int len = emailTextField.getLength();
        String size = String.valueOf(len);
        
        if ("0".equals(size)){ 
            Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Empty Email field!");
                a.showAndWait();}
        
        else{
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText("Email Send!");
        a.showAndWait();
    }
        
    }


    @FXML
    private void viewSelRepoButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void saveShowButtonOnClick(ActionEvent event) {
        
        String np, tT, tB, rM;
        np = proNameTextField.getText();
        tT = timeTextField.getText(); 
        tB = totalBudgetTextField.getText();
        rM = rawMaterialsTextField.getText();
        
        if (saveTxtFileCheckBox.isSelected()){
            File f = null;
            FileWriter fw = null;
            FileChooser fc = null;
            
            try {
                f = new File(proNameTextField.getText()+".txt");  
                    if(f.exists()) fw = new FileWriter(f,true);
                    else fw = new FileWriter(f);
           
                    fw.write(
                        proNameTextField.getText()+","
                        +timeTextField.getText()+","	
                        +totalBudgetTextField.getText()+","
                        +rawMaterialsTextField.getText()+"\n");
            }catch (IOException ex) {
            Logger.getLogger(ProjectReportsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(ProjectReportsSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }       
            }
        }else 
        projectReportTable.getItems().add(
        new ProjectRepoTable(np, tT,tB,rM));
        
        
        
    }


    
}
