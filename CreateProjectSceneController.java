/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CreateProjects;

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
public class CreateProjectSceneController implements Initializable {

    @FXML
    private Label newProjectViewLabel;
    @FXML
    private MenuItem openMultipleProjectsMenuitem;
    @FXML
    private Button saveNewProjectButton;
    @FXML
    private Label twoProjectViewLabel;
    @FXML
    private Label efficiencyResultsLabel;
    @FXML
    private Button compareButton;
    @FXML
    private MenuItem openFileResearchMenuItem;
    @FXML
    private Button goToDashButton;
    @FXML
    private TextField p1TextField;
    @FXML
    private TextField p2TextField;
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
                    Logger.getLogger(CreateProjectSceneController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        twoProjectViewLabel.setText(str);
    }

    @FXML
    private void saveNewProjectButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void compareButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void singleFileChooserResearchMenuItemOnClick(ActionEvent event) {
        
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
                newProjectViewLabel.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
        
    }

    @FXML
    private void goToDashButtonOnClick(ActionEvent event) {
        SceneSwitcher.switchToScene(SceneSwitcher.getStageFromEvent(event), "ProjectManager/ProjectManagerDashboardScene.fxml");
    }
    
}
