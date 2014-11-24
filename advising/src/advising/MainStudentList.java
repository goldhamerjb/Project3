package advising;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainStudentList {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainStudentList window = new MainStudentList();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainStudentList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Hari Seldon", "Alex Lifeson", "Johannes Bach"}));		//pass from student objects
		comboBox.setBounds(148, 390, 290, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblDeleteStudent = new JLabel("Delete Student");
		lblDeleteStudent.setBounds(25, 378, 97, 44);
		frame.getContentPane().add(lblDeleteStudent);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(448, 389, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	StudentInfo();
				//
			}
		});
		btnAddStudent.setBounds(202, 159, 89, 23);
		frame.getContentPane().add(btnAddStudent);
		
		
		


	
	}
}
