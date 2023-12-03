/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Projects;

import Login.pkg.SceneSwitcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class ProjectSceneController implements Initializable {

    @FXML
    private MenuItem invoiceFileChooserMenuItem;
    @FXML
    private MenuItem openMultipleProjectsMenuitem;
    @FXML
    private Label allProjectViewLabel;
    @FXML
    private Label allInvoiceViewLabel;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField materialsTextField;
    @FXML
    private TextField invoiceMaterialsTextField;
    @FXML
    private TextField invoiceNameTextField;
    @FXML
    private Label resultsViewLabel;
    @FXML
    private Button matchButton;
    @FXML
    private Button goToDashButton;
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
    private void multipleInvoiceFileChooserMenuItemOnClick(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files", fileTypeList));
        List<File> files = fc.showOpenMultipleDialog(null);
        String str="";
        for(File f: files){
            if(f != null){
                try {
                    Scanner sc = new Scanner(f);
                    
                    while(sc.hasNextLine()){
                        str+=sc.nextLine()+"\n";
                    }
                    str+="\n";
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ProjectSceneController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        allInvoiceViewLabel.setText(str);
    }

    @FXML
    private void multipleFileChooserProMenuItemOnClick(ActionEvent event) {
        
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files", fileTypeList));
        List<File> files = fc.showOpenMultipleDialog(null);
        String str="";
        for(File f: files){
            if(f != null){
                try {
                    Scanner sc = new Scanner(f);
                    
                    while(sc.hasNextLine()){
                        str+=sc.nextLine()+"\n";
                    }
                    str+="\n";
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ProjectSceneController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        allProjectViewLabel.setText(str);
        
        
    }

    @FXML
    private void matchButtonOnClick(ActionEvent event) {
        if(nameTextField.getText().equals(invoiceNameTextField.getText()) && 
                (materialsTextField.getText().equals(invoiceMaterialsTextField.getText()))){
                resultsViewLabel.setText("Matched!");
        }else {resultsViewLabel.setText("Doesn't Match");}
        
    }

    @FXML
    private void goToDashButtonOnClick(ActionEvent event) {
        
         SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "ProjectManager/ProjectManagerDashboardScene.fxml");
        
    }
    
}
