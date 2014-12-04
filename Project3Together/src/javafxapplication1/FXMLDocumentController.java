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
import java.util.Arrays;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.util.Callback;




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
    @FXML private TableView studTable;
    
    @FXML private TextField editInputName;      //edit tab
    @FXML private TextField editInputID;
    @FXML private ChoiceBox editInputGrade;
    @FXML private TextField editAdviseDate;
    @FXML private CheckBox editAdvised;
    private StuLinkedList stulist = new StuLinkedList();
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
    
        @FXML
    private void adviseSave(ActionEvent event) {
        //TODO save date to linked list
            
        
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
        chooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
        chooser.setTitle("Choose Input Student File");
        File file = chooser.showOpenDialog(new Stage());
        importPath.setText(file.getName());
    }
        
    //EDIT TAB
    
    @FXML
    private void editSave(ActionEvent event) {
        //TODO
            
        
    }

    @FXML
    private void editGetData(ActionEvent event) {
        //TODO 
        
        // remove if id changes
        // edit if not

//        int i = selectionmodel place
//        editInputName.setText(array[i][0]);
//        editInputID.setText(array[i][1]);
//        editAdviseDate.setText(array[i][4]);
//        if (array[i][3][.equals("1")){
//            editAdvised.setSelected(true);
//        }
//        else { editAdvised.setSelected(false); }

//        switch (array[i][2]) {
//             case "Freshman":
//             editInputGrade.getSelectionModel().select(0);
//             break;             
//             case "Sophomore":
//             editInputGrade.getSelectionModel().select(1);
//             break;             
//             case "Junior":
//             editInputGrade.getSelectionModel().select(2);
//             break;             
//             case "Senior":
//             editInputGrade.getSelectionModel().select(3);
//             break;
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        stulist.getSize();
        

        
//String[][] studentArray = {{"nice to ", "have", "tittles", "have", "titles"},
//						 {"a", "b", "c","have", "titles"},
//						 {"d", "e", "f","have", "titles"}};
//ObservableList<String[]> data = FXCollections.observableArrayList();
//data.addAll(Arrays.asList(studentArray));
//data.remove(0);//remove titles from data
//TableView<String[]> table = new TableView<>();
//for (int i = 0; i < staffArray[0].length; i++) {
//	TableColumn tc = new TableColumn(staffArray[0][i]);
//	final int colNo = i;
//	tc.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<String[], String>, ObservableValue<String>>() {
//		@Override
//		public ObservableValue<String> call(TableColumn.CellDataFeatures<String[], String> p) {
//			return new SimpleStringProperty((p.getValue()[colNo]));
//		}
//	});
//	tc.setPrefWidth(90);
//	table.getColumns().add(tc);
//}
//        studTable.setItems(data);

     
        
        //TODO Edit Tab populate list  :   setItems(ObservableList<T> value)
        
    }    
    
}
