/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Reports;

import Login.pkg.SceneSwitcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ReportSceneController implements Initializable {

    @FXML
    private MenuButton finanFileChooserMenuItem;
    @FXML
    private MenuButton reciFileChooserMenuItem;
    @FXML
    private MenuItem confiFileChooserMenuItem;
    @FXML
    private Button downloadButton;
    @FXML
    private Button shareButton;
    @FXML
    private Button goToDashButton;
    @FXML
    private Label viewSelectedFileLabel;
    private ArrayList<String> fileTypeList, fileTypeList2;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        fileTypeList = new ArrayList<String>();
        fileTypeList.add("*.txt");
        fileTypeList.add("*.doc");
        fileTypeList.add("*.docx");
        fileTypeList.add("*.TXT");
        fileTypeList.add("*.DOC");
        fileTypeList.add("*.DOCX");

        fileTypeList2 = new ArrayList<String>();
        fileTypeList2.add("*.*");
          
    }    


    @FXML
    private void finanFileChooserMenuItemOnClick(ActionEvent event) {
        
        FileChooser fc = new FileChooser();
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files", fileTypeList));
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All files", fileTypeList2));
        
         File f = fc.showOpenDialog(null);
         if(f != null){
            try {
                Scanner sc = new Scanner(f);
                String str="";
                while(sc.hasNextLine()){
                    str+=sc.nextLine()+"\n";
                }
                viewSelectedFileLabel.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
    }
        
    

    @FXML
    private void payFileChooserMenuItemOnClick(ActionEvent event) {
        
        FileChooser fc = new FileChooser();
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files", fileTypeList));
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All files", fileTypeList2));
        
         File f = fc.showOpenDialog(null);
         if(f != null){
            try {
                Scanner sc = new Scanner(f);
                String str="";
                while(sc.hasNextLine()){
                    str+=sc.nextLine()+"\n";
                }
                viewSelectedFileLabel.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
        
    }

    @FXML
    private void reciFileChooserMenuItemOnClick(ActionEvent event) {
        
        FileChooser fc = new FileChooser();
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files", fileTypeList));
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All files", fileTypeList2));
        
         File f = fc.showOpenDialog(null);
         if(f != null){
            try {
                Scanner sc = new Scanner(f);
                String str="";
                while(sc.hasNextLine()){
                    str+=sc.nextLine()+"\n";
                }
                viewSelectedFileLabel.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
        
        
    }

    @FXML
    private void confiFileChooserMenuItemOnClick(ActionEvent event) {
        
        FileChooser fc = new FileChooser();
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files", fileTypeList));
         fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All files", fileTypeList2));
        
         File f = fc.showOpenDialog(null);
         if(f != null){
            try {
                Scanner sc = new Scanner(f);
                String str="";
                while(sc.hasNextLine()){
                    str+=sc.nextLine()+"\n";
                }
                viewSelectedFileLabel.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
       
    }

    @FXML
    private void downloadButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void shareButtonOnClick(ActionEvent event) {
        
        SceneSwitcher.createStagewithScene("Reports/ShareStageScene", true);
    }

    @FXML
    private void goToDashButtonOnClick(ActionEvent event) {
        
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "AccountsOfficer/AccountsDashboardScene.fxml");
        
        
    }
    
}
