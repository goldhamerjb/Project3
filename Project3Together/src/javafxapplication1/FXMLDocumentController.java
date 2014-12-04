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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.util.Callback;




/*
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
   
//    @FXML private TableView studTable;
    
    @FXML private TextField editInputName;      //edit tab
    
    @FXML private ChoiceBox editStudentList;
    @FXML private TextField editInputID;
    @FXML private ChoiceBox editInputGrade;
    @FXML private TextField editAdviseDate;
    @FXML private CheckBox editAdvised;
    StuLinkedList stuList = new StuLinkedList();
    private File file;
    private String studentID;
    SaveSystem stuSave  = new SaveSystem();  
    ImportStudentInfo ImpStudent = new ImportStudentInfo();
  

    
    
    @FXML private TableView studTable;
    @FXML private TableColumn columnName;
    @FXML private TableColumn columnID;
    @FXML private TableColumn columnGrade;
    @FXML private TableColumn columnAdvised;
    @FXML private TableColumn columnAdvisedDate;
    @FXML private TabPane tabPane;
    @FXML private Tab tableTab;

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
    private void tabpane(ActionEvent event) {
System.out.println("32132");
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
        
 @FXML
    private void editSave(ActionEvent event) throws EmptyLinkedListException {
        //TODO
            String eInputName= ""+editInputName;
            String eInputID = ""+editInputID;
            String eInputGrade = ""+editInputGrade;
            String eAdvised = ""+editAdvised;
            String eAdviseDate = ""+editAdviseDate;
            
           if(studentID.equals(eInputID))
            {
                stuList.ChangeData(eInputName, eInputID, eInputGrade, eAdvised, eAdviseDate );
            }
           else
           {
           if(stuList.contains(eInputID))    
           {
                final Stage dialog = new Stage();                       //TODO not sure if working
                dialog.initModality(Modality.APPLICATION_MODAL);
//                dialog.initOwner(primaryStage);
                VBox dialogVbox = new VBox(20);
                dialogVbox.getChildren().add(new Text("This is a Dialog"));
                Scene dialogScene = new Scene(dialogVbox, 300, 200);
                dialog.setScene(dialogScene);
                dialog.show();
           }
           else{
           stuList.remove(studentID);
           stuList.addFull(eInputName, eInputID, eInputGrade, eAdvised, eAdviseDate);
           }}
    }


        @FXML
    private void editDelete(ActionEvent event) throws EmptyLinkedListException {
        //TODO
//        stuList;
        String[][] newArray = stuList.toArray();
        
 //       stuList.
        
        //STUDENT LIST: use 1D array
        
        stuList.remove(studentID);
        editInputName.setText("");
        editInputID.setText("");
        editInputGrade.getSelectionModel().clearSelection();
        editAdvised.setSelected(false);
        editAdviseDate.setText("");
        editStudentList.getSelectionModel().clearSelection();
        
        
    }
    
    @FXML
    private void editGetData(ActionEvent event) {
        //TODO 
        String fullList = stuList.getInfo(studentID);
        Scanner parser = new Scanner(fullList);
        parser.useDelimiter("&");
	editInputName.setText(parser.next());
	editInputID.setText(parser.next());
        switch (parser.next()) {
             case "Freshman":
             editInputGrade.getSelectionModel().select(0);
             break;             
             case "Sophomore":
             editInputGrade.getSelectionModel().select(1);
             break;             
             case "Junior":
             editInputGrade.getSelectionModel().select(2);
             break;             
             case "Senior":
             editInputGrade.getSelectionModel().select(3);
             break;
        }
        if (parser.next().equals("1")){
            editAdvised.setSelected(true);
        }
        else { editAdvised.setSelected(false); }
	editAdviseDate.setText(parser.next()); 
    }
    
   /*
      private void populateTable() {
          
          String[][] studentArray2 = {{"a", "b", "c", "d", "e"}, {"dd", "dd", "dd", "dd", "dd"},  {"dd", "dd", "dd", "dd", "dd"}};

            for (int rowNumber = 0; rowNumber < dataRows.size(); rowNumber++) {
                for (TableColumn tc : columns) {

                    tc.setCellValueFactory(new ValueFactory(columns.indexOf(tc),rowNumber));
                    dpcontroller.tableView.getColumns().add(tc);
                }
            }
            dpcontroller.tableView.setItems(dataRows);

        }
        private class ValueFactory implements Callback {

            private int rowNumber;
            private int columnNumber;

            public ValueFactory(int columnNumber, int rowNumber) {
                this.columnNumber = columnNumber;
                this.rowNumber = rowNumber;
            }

            @Override
            public Object call(Object o) {
                SimpleStringProperty stringProperty = new SimpleStringProperty(dataRows.get(rowNumber)[columnNumber]);
                return stringProperty;
            }
        }
*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            ImpStudent.importFullInfo(stuList);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

        tabPane.getSelectionModel().clearSelection();
        tabPane.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>() {
        @Override
        public void changed(ObservableValue<? extends Tab> observable, Tab oldValue, Tab newValue) {
            //TODO: RELOAD DATA FROM LINKED LIST

            }
        });
        
        
        
        
        //String[][] studentArray = stuList.toArray();

        String[][] titleArray = {{"Name ", "ID", "Grade", "Advised", "Date Advised"}};

        
        String[][] staffArray = stuList.toArray();
        
        ObservableList<String[]> data = FXCollections.observableArrayList();
        data.addAll(Arrays.asList(staffArray));
//        data.remove(0);
        TableView<String[]> table = new TableView<>();
        for (int i = 0; i < staffArray[0].length; i++) {
            TableColumn tc = new TableColumn(titleArray[0][i]);
            final int colNo = i;
            tc.setCellValueFactory(new Callback<CellDataFeatures<String[], String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<String[], String> p) {
                    return new SimpleStringProperty((p.getValue()[colNo]));
                }
            });
            tc.setPrefWidth(90);
            table.getColumns().add(tc);
        }
        table.setItems(data);
        StackPane tab_stack = new StackPane();
        tab_stack.setAlignment(Pos.CENTER);
        tab_stack.getChildren().add(table);
        tableTab.setContent(tab_stack);

        
  
//        ObservableList<String[]> data = FXCollections.observableArrayList(studentArray);
//        data.addAll(Arrays.asList(studentArray));
// //       TableView<String[]> table = new TableView<>();
// //       UserId.setCellfactory();
//        studTable.setItems(data);
//        
        
        
        
        
//        columnName.setCellValueFactory(
//                new PropertyValueFactory<String, String>("studentArray[2][2]"));


        
        //TODO Edit Tab populate list  :   setItems(ObservableList<T> value)
        



        
        
        

    }    
    
}
