/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.stage.FileChooser;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javafx.scene.Group;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;



//import javafx.*;

/**
 *
 * @author Goldhamer-Laptop
 */
public class FXMLDocumentController implements Initializable {
    
    final FileChooser fileChooser = new FileChooser();
    @FXML private Label label;
    @FXML private TextField textInputName;
    @FXML private TextField textInputID;
    @FXML private ChoiceBox textInputGrade;
    @FXML private Button buttonBrowse;
    @FXML private Text importPath;
    @FXML private RadioButton radioInput;
    @FXML private ToggleGroup radioButtons;
    private File file;

    

    @FXML
    // Disable appropriate buttons
    private void radioButtonFile(ActionEvent event) {
        textInputName.setText("");
        textInputName.setDisable(true);
        textInputID.setText("");
        textInputID.setDisable(true);
        textInputGrade.setDisable(true);
        buttonBrowse.setDisable(false);
        textInputGrade.getSelectionModel().clearSelection();

    }   
    
    @FXML
    // Disable appropriate buttons
    private void radioButtonKey(ActionEvent event) {
        textInputName.setDisable(false);
        textInputID.setDisable(false);
        textInputGrade.setDisable(false);
        buttonBrowse.setDisable(true);
        
    }
    
    @FXML
    private void addSave(ActionEvent event) {
        if (file == null) {   //
            System.out.println(radioButtons.getSelectedToggle().getUserData().toString());
        }
        
//        else if (true){
//            
//        }
        
        
        
        //if inputselected and not empty
        //else if keyboard selected and not empty
        //else "nothing entered!"
        //TODO pass to theo's stuff
    }
    
    @FXML   //Clear Name, ID, Grade Level, and input file
    private void addClear(ActionEvent event) {
        textInputName.setText("");
        textInputID.setText("");
        textInputGrade.getSelectionModel().clearSelection();
        file = null;
        importPath.setText("");
    }
    
    @FXML
        private void fileSelect(ActionEvent event) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Choose Input Student File");
        File file = chooser.showOpenDialog(new Stage());
        importPath.setText(file.getName());
    }
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
