/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Deals;

import Login.pkg.SceneSwitcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class DealsSceneController implements Initializable {

    @FXML    private TextField compNameTextField;
    @FXML    private TextField dealNameTextField;
    @FXML    private Button createSaveButton;
    @FXML    private Button downloadDealButton;
    @FXML    private MenuItem prevDealFileChooser;
    @FXML    private CheckBox saveTxtFileCheckBox;
    @FXML    private TextField amInvesTextField;
    @FXML    private DatePicker datePicker;
    @FXML    private TextArea editDealTextArea;
    @FXML    private Label newDealLabel;
    @FXML    private Label prevDealLabel;
    @FXML    private Button goToDashButton;
    @FXML    private Button shareStgButton;
    @FXML    private Button updateNDelButton;
    @FXML    private CheckBox editCheckBbox;
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

        editDealTextArea.setEditable(false);
        
    }    


    @FXML    private void createSaveButtonOnClick(ActionEvent event) {
        
        if (saveTxtFileCheckBox.isSelected()){
            File f = null;
            FileWriter fw = null;
            FileChooser fc = null;
            
            try {
                f = new File("Weekly BalanceSheet.txt");  
                    if(f.exists()) fw = new FileWriter(f,true);
                    else fw = new FileWriter(f);
           
                    fw.write(
                        dealNameTextField.getText()+","
                        +compNameTextField.getText()+","	
                        +amInvesTextField.getText()+"\n");
            }catch (IOException ex) {
            Logger.getLogger(DealsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(DealsSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }       
            }
        
    }
    }


    @FXML    private void downloadDealButtonOnClick(ActionEvent event) {
    }


    @FXML    private void prevDealFileChooserOnClick(ActionEvent event) {
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
                prevDealLabel.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
        
        
    }
    
    @FXML    private void goToDashButtonOnClick(ActionEvent event) {
        
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "AccountsOfficer/AccountsDashboardScene.fxml");
    }

    @FXML    private void shareStgButtonOnClick(ActionEvent event) {
        
        SceneSwitcher.createStagewithScene("Deals/ShareStgScene.fxml", true);
    }

    @FXML    private void updateNDelButtonOnClick(ActionEvent event) {
        
        if(editCheckBbox.isSelected()){
            editDealTextArea.setEditable(true);
            editDealTextArea.setText(prevDealLabel.getText()+ newDealLabel.getText());
        }
        else{
            editDealTextArea.setText(null);
            editDealTextArea.setEditable(false);
        }
        
    }
    
}
