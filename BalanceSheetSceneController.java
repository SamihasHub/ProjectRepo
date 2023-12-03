/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package BalanceSheets;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class BalanceSheetSceneController implements Initializable {

    @FXML private TableView<BalanceSheetTableClass> balanceSheetTableView;
    @FXML private TableColumn<BalanceSheetTableClass,String> particularsColumn;
    @FXML private TableColumn<BalanceSheetTableClass,String> currentColumn;
    @FXML private TableColumn<BalanceSheetTableClass,String> prevColumn;
    @FXML private RadioButton weeklyRB;
    @FXML private RadioButton quarterlyRB;
    @FXML private RadioButton monthlyRB;
    @FXML private RadioButton annuallyRB;
    @FXML private TextField particularsTextField;
    @FXML private TextField prevAmTextField;
    @FXML private TextField currAmTextField;
    @FXML private Button prepareAndSaveBalSButton;
    @FXML private Button goDashButton;
    @FXML private Button shareStgButton;
    private ToggleGroup tg;
    @FXML    private CheckBox saveAsTxtCheckBox;
    @FXML    private MenuItem openFileChooserMenuItem;
    @FXML    private Label viewBalSheetLabel;
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
        
        tg = new ToggleGroup();
        weeklyRB.setToggleGroup(tg);
        quarterlyRB.setToggleGroup(tg);
        monthlyRB.setToggleGroup(tg);
        annuallyRB.setToggleGroup(tg);
        
        particularsColumn.setCellValueFactory(
                new PropertyValueFactory<BalanceSheetTableClass,String>("particulars"));
        currentColumn.setCellValueFactory(
                new PropertyValueFactory<BalanceSheetTableClass,String>("currAmo"));
        prevColumn.setCellValueFactory(
                new PropertyValueFactory<BalanceSheetTableClass,String>("prevAmo"));
        
    }    

    @FXML private void prepareAndSaveBalSButtonOnClick(ActionEvent event) {
        String p , curr, prev;
        p = particularsTextField.getText();
        curr = currAmTextField.getText();
        prev = prevAmTextField.getText();
        
        if (saveAsTxtCheckBox.isSelected()){
            File f = null;
            FileWriter fw = null;
            FileChooser fc = null;
            
            try {
                if (weeklyRB.isSelected());
                f = new File("Weekly BalanceSheet.txt");  
                    if(f.exists()) fw = new FileWriter(f,true);
                    else fw = new FileWriter(f);
           
                    fw.write(
                        particularsTextField.getText()+","
                        +currAmTextField.getText()+","	
                        +prevAmTextField.getText()+"\n");
            }catch (IOException ex) {
            Logger.getLogger(BalanceSheetSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(BalanceSheetSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }       
            }        
                    
            try {        
                if (quarterlyRB.isSelected());
                f = new File("Quarterly BalanceSheet.txt");  
                    if(f.exists()) fw = new FileWriter(f,true);
                    else fw = new FileWriter(f);
           
                    fw.write(
                        particularsTextField.getText()+","
                        +currAmTextField.getText()+","	
                        +prevAmTextField.getText()+"\n");
            }catch (IOException ex) {
            Logger.getLogger(BalanceSheetSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(BalanceSheetSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            try {     
                if (monthlyRB.isSelected());
                f = new File("Monthly BalanceSheet.txt");  
                    if(f.exists()) fw = new FileWriter(f,true);
                    else fw = new FileWriter(f);
           
                    fw.write(
                        particularsTextField.getText()+","
                        +currAmTextField.getText()+","	
                        +prevAmTextField.getText()+"\n"); 
            }catch (IOException ex) {
            Logger.getLogger(BalanceSheetSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(BalanceSheetSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }        
            }    
            
            try {        
                if (annuallyRB.isSelected());
                f = new File("Annually BalanceSheet.txt");  
                    if(f.exists()) fw = new FileWriter(f,true);
                    else fw = new FileWriter(f);
           
                    fw.write(
                        particularsTextField.getText()+","
                        +currAmTextField.getText()+","	
                        +prevAmTextField.getText()+"\n");    
            }
            catch (IOException ex) {
            Logger.getLogger(BalanceSheetSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(BalanceSheetSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }else 
        balanceSheetTableView.getItems().add(
        new BalanceSheetTableClass(p, curr, prev));
    }
    
    @FXML private void goDashButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "AccountsOfficer/AccountsDashboardScene.fxml");
    }

    @FXML private void shareStgButtonOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("BalanceSheets/ShareScene.fxml", true);
    }

    @FXML
     void openFileChooserMenuItemOnClick(ActionEvent event) {
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
                viewBalSheetLabel.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
    }
}
