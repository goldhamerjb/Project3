package advising;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.AbstractListModel;

import java.awt.Choice;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.JFileChooser;
import java.awt.Color;


public class StudentInfo {

	private JFrame frmNewStudent;
	private JTextField studentName;
	private JTextField studentId;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInfo window = new StudentInfo();
					window.frmNewStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNewStudent = new JFrame();
		frmNewStudent.setTitle("New Student");
		frmNewStudent.setBounds(100, 100, 407, 382);
		frmNewStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNewStudent.getContentPane().setLayout(null);
		final File selectedFile = null;
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setBounds(10, 180, 73, 20);
		frmNewStudent.getContentPane().add(lblStudentName);
		
		JLabel lblStudentID = new JLabel("Student ID");
		lblStudentID.setBounds(10, 211, 73, 20);
		frmNewStudent.getContentPane().add(lblStudentID);
		
		JLabel lblStudentYear = new JLabel("Student Year");
		lblStudentYear.setBounds(10, 242, 73, 20);
		frmNewStudent.getContentPane().add(lblStudentYear);
		
		studentName = new JTextField();
		studentName.setBounds(93, 180, 243, 20);
		frmNewStudent.getContentPane().add(studentName);
		studentName.setColumns(10);

		
		studentId = new JTextField();
		studentId.setColumns(10);
		studentId.setBounds(93, 211, 158, 20);
		frmNewStudent.getContentPane().add(studentId);
		

		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmNewStudent.dispose();
			}
		});
		btnCancel.setBounds(249, 296, 89, 23);
		frmNewStudent.getContentPane().add(btnCancel);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Freshman", "Sophomore", "Junior", "Senior"}));
		comboBox.setBounds(93, 246, 158, 16);
		frmNewStudent.getContentPane().add(comboBox);
		

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 130, 371, 2);
		frmNewStudent.getContentPane().add(separator);
		
		  
	    frmNewStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    final JButton selectFile = new JButton("Select File");
	    selectFile.setBounds(36, 46, 89, 23);
	    selectFile.setEnabled(false);

	    selectFile.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ae) {
	        JFileChooser fileChooser = new JFileChooser();
	        int returnValue = fileChooser.showOpenDialog(null);
	        if (returnValue == JFileChooser.APPROVE_OPTION) {
	          File selectedFile = fileChooser.getSelectedFile();			//file from selection
	        }
	      }
	    });
	    frmNewStudent.getContentPane().add(selectFile);
	    
	    final JLabel lblErrorNoFile = new JLabel("Error: No File Chosen");
	    lblErrorNoFile.setVisible(false);
	    lblErrorNoFile.setForeground(new Color(255, 0, 0));
	    lblErrorNoFile.setBackground(Color.RED);
	    lblErrorNoFile.setBounds(191, 50, 166, 20);
	    frmNewStudent.getContentPane().add(lblErrorNoFile);
	    
	    
		final JRadioButton rdbtnImportFromList = new JRadioButton("Import from list");
		rdbtnImportFromList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
														// clear and disable the text boxes
				studentName.setText("");
				studentName.setEditable(false);
				studentId.setText("");
				studentId.setEditable(false);
				comboBox.setEnabled(false);
				comboBox.setSelectedItem("");
				selectFile.setEnabled(true);

		
			}
		});

		final JRadioButton rdbtnTypeViaKeyboard = new JRadioButton("Type via keyboard");
		rdbtnTypeViaKeyboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				studentName.setEditable(true);			//reenable editable fields
				studentId.setEditable(true);
				comboBox.setEnabled(true);
				selectFile.setEnabled(false);

			}
		});
		
		buttonGroup.add(rdbtnTypeViaKeyboard);
		rdbtnTypeViaKeyboard.setBounds(26, 139, 145, 23);
		frmNewStudent.getContentPane().add(rdbtnTypeViaKeyboard);
		
		buttonGroup.add(rdbtnImportFromList);
		rdbtnImportFromList.setBounds(26, 19, 109, 23);
		frmNewStudent.getContentPane().add(rdbtnImportFromList);
		
		
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (rdbtnImportFromList.isSelected()){				///@TODO - add if file is empty throw error
					System.out.print("file exists");
					lblErrorNoFile.setVisible(true);
				}
				else if (rdbtnImportFromList.isSelected()){
					//*****PASS DATA******
					frmNewStudent.dispose();	//close
				}
				if (rdbtnTypeViaKeyboard.isSelected()){			//verify data is entered
					//ternary operator to display messages
					
				}
				

				
				//if input file (selectedFile) is empty and radiobutton is on input then say so & dont exit
				//if all fields are empty then 
				//_______________ACCEPT
				//pass data to correct place
				
			}
		});
		btnAccept.setBounds(46, 296, 89, 23);
		frmNewStudent.getContentPane().add(btnAccept);
	}
}
