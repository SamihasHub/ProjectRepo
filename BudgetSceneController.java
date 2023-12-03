/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Budgets;

import BalanceSheets.BalanceSheetSceneController;
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
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
public class BudgetSceneController implements Initializable {

    @FXML    private TableView<BudgetTableClass> bugetTableView;
    @FXML    private TableColumn<BudgetTableClass, String> expenditureColumn;
    @FXML    private TableColumn<BudgetTableClass, String> expenseColmn;
    @FXML    private TextField expendiTextField;
    @FXML    private TextField ExpensTextField;
    @FXML    private TextField yearTextField;
    @FXML    private TextField totalAmTextField;
    @FXML    private Button prepareSaveButton;
    @FXML    private Button deleteBudButton;
    @FXML    private MenuItem prevBudFileChooser;
    @FXML    private CheckBox saveTxtFileCheckBox;
    @FXML    private Button goToDashButton;
    @FXML    private Button shareStgButton;
    @FXML    private TableColumn<BudgetTableClass, String> yearColmn;
    private ArrayList<String> fileTypeList, fileTypeList2;
    @FXML
    private TableColumn<BudgetTableClass, String> totalColmn;
    @FXML
    private Label budgetViewLabel;
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
        
        yearColmn.setCellValueFactory(
        new PropertyValueFactory<BudgetTableClass, String>("year"));
        expenditureColumn.setCellValueFactory(
        new PropertyValueFactory<BudgetTableClass, String>("expendi"));
        expenseColmn.setCellValueFactory(
        new PropertyValueFactory<BudgetTableClass, String>("expns"));
        totalColmn.setCellValueFactory(
        new PropertyValueFactory<BudgetTableClass, String>("total"));
    }    


    @FXML    private void prepareSaveButtonOnClick(ActionEvent event) {
        
        String y, expd, expen, t;
        expd = expenditureColumn.getText();
        y = yearColmn.getText(); 
        expen = expenseColmn.getText();
        t = totalAmTextField.getText();
        
        if (saveTxtFileCheckBox.isSelected()){
            File f = null;
            FileWriter fw = null;
            FileChooser fc = null;
            
            try {
                f = new File(yearTextField.getText()+"Budget.txt");  
                    if(f.exists()) fw = new FileWriter(f,true);
                    else fw = new FileWriter(f);
           
                    fw.write(
                        yearTextField.getText()+","
                        +expendiTextField.getText()+","	
                        +ExpensTextField.getText()+","
                        +totalAmTextField.getText()+"\n");
            }catch (IOException ex) {
            Logger.getLogger(BudgetSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(BudgetSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }       
            }
        }else 
        bugetTableView.getItems().add(
        new BudgetTableClass(y, expd, expen,t));
       
    }


    @FXML    private void deleteBudButtonOnClick(ActionEvent event) {
        
        ObservableList<BudgetTableClass> selectedRows, yearBudget;
        yearBudget = bugetTableView.getItems();
        selectedRows = bugetTableView.getSelectionModel().getSelectedItems();
        
        for(BudgetTableClass b: selectedRows){
            yearBudget.remove(b);
        }
       
    }

    @FXML    private void prevBudFileChooserOnClick(ActionEvent event) {
        
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
                budgetViewLabel.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
       
    }

    @FXML    private void goToDashButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "AccountsOfficer/AccountsDashboardScene.fxml");
    }

    @FXML    private void shareStgButtonOnClick(ActionEvent event) {
        SceneSwitcher.createStagewithScene("Budgets/BudgetShareStgScene", true);
    }
    
}
