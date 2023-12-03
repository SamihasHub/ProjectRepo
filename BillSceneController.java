/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Bills;

import Login.pkg.SceneSwitcher;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class BillSceneController implements Initializable {

    @FXML    private TextField billamountTextField;
    @FXML    private ComboBox<String> billOptionComboBox;
    @FXML    private Button payBillStgButton;
    @FXML    private CheckBox binCheckBox;
    @FXML    private TextField billNoTextField;
    @FXML    private Button prepareBillButton;
    @FXML    private Label showPreparedBillLabel;
    @FXML    private Button go2DashboardButton;
    @FXML    private Label viewBillLabel;
    @FXML    private MenuItem openBillMenuItem;
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
        
        
        billOptionComboBox.getItems().addAll(
                "Raw Materials",
                "Lab equipment",
                "Utilities",
                "Security",
                "Transportation");
        
    }    


    @FXML    private void payBillStgButtonOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("Bills/PayBillScene.fxml", true);
    }


    @FXML    private void prepareBillButtonOnClick(ActionEvent event) {
        if (binCheckBox.isSelected()){
            
            File f = null;
            FileOutputStream fos = null;
            DataOutputStream dos = null;
        
        try {
            f = new File("EmpData.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            dos = new DataOutputStream(fos);
            
            dos.writeInt(Integer.parseInt(billNoTextField.getText()));
            dos.writeUTF(billOptionComboBox.getValue());
            dos.writeInt(Integer.parseInt(billamountTextField.getText()));
           

        } catch (IOException ex) {
            Logger.getLogger(BillSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                Logger.getLogger(BillSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
            
           
        }else {
            viewBillLabel.setText(billNoTextField.getText() + 
                    billOptionComboBox.getValue()+ 
                    billamountTextField.getText());
        
        }
        
        
        
        
    }

    @FXML    private void go2DashboardButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "AccountsOfficer/AccountsDashboardScene.fxml");
 
    }

    @FXML    private void openBillFileChooserMenuItemOnClick(ActionEvent event) {
        
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
                viewBillLabel.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
         
    }
    
}
