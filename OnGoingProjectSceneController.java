/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package OnGoingProjects;

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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
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
public class OnGoingProjectSceneController implements Initializable {

    @FXML
    private MenuItem openMultipleProjectsMenuitem;
    @FXML
    private Label progressResultsLabel;
    @FXML
    private Button checkProgressButton;
    @FXML
    private TableView<OnGoingTable> selectedProjectTable;
    @FXML
    private TableColumn<OnGoingTable, String> nameColumn;
    @FXML
    private TableColumn<OnGoingTable, String> timeColumn;
    @FXML
    private TableColumn<OnGoingTable, String> budgetColumn;
    @FXML
    private TableColumn<OnGoingTable, String> rawMaterialsColumn;
    @FXML
    private Button sendEmailButton;
    @FXML
    private Label ongoingProjectViewLabel;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextField budgetTextField;
    @FXML
    private TextField materialsTextField;
    @FXML
    private Button upload2TableButton;
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
        
        nameColumn.setCellValueFactory(
        new PropertyValueFactory<OnGoingTable, String>("name"));
        timeColumn.setCellValueFactory(
        new PropertyValueFactory<OnGoingTable, String>("time"));
        budgetColumn.setCellValueFactory(
        new PropertyValueFactory<OnGoingTable, String>("budget"));
        rawMaterialsColumn.setCellValueFactory(
        new PropertyValueFactory<OnGoingTable, String>("rawMat"));
    
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
                    Logger.getLogger(OnGoingProjectSceneController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        ongoingProjectViewLabel.setText(str);
    }

    @FXML
    private void checkProgressButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void sendEmailButtonOnClick(ActionEvent event) {
        
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText("Email Send!");
        a.showAndWait();
    }

    @FXML
    private void upload2TableButtonOnClick(ActionEvent event) {
        String n, t, b, r;
        n = nameTextField.getText();
        t = timeTextField.getText(); 
        b = budgetTextField.getText();
        r = materialsTextField.getText();
        
        selectedProjectTable.getItems().add(
        new OnGoingTable(n, t, b,r));
    }

    @FXML
    private void goToDashButtonOnClick(ActionEvent event) {
        
          SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "ProjectManager/ProjectManagerDashboardScene.fxml");
        
    }
    
}
