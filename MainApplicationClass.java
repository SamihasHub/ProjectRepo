

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */

import Login.pkg.SceneSwitcher;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class MainApplicationClass extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {

        SceneSwitcher.setMainstage(stage);
        SceneSwitcher.setGlobal_class_handle(getClass());
       
        
        Parent root = FXMLLoader.load(getClass().getResource("Login/pkg/LoginPageScene.fxml"));
        
        Scene scene = new Scene(root);
      
        
        stage.setTitle("LOGIN PAGE");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
