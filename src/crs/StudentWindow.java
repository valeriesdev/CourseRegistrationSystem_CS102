package crs;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class StudentWindow {
	/**
	 * README! README! README! README! README! README! README! README! README! README! 
	 * README! README! README! README! README! README! README! README! README! README! 
	 * README! README! README! README! README! README! README! README! README! README! 
	 * README! README! README! README! README! README! README! README! README! README! 
	 * README! README! README! README! README! README! README! README! README! README! 
	 * 
	 * Most of this code is mangled auto-generated WindowBuilder code, for my code go to line 57-104 and line 427 and below.
	 */
	
	public JFrame frame;
	private JTextField IDField_R;
	private JTextField SectionField_R;

	/**
	 * Create the application.
	 */
	public StudentWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 505);
		frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
		frame.addWindowListener(new WindowListener() {
		    @Override
		    public void windowClosed(WindowEvent e) {
		    }

			@Override
			public void windowOpened(WindowEvent e) {
				
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
		    	Main.loginWindow.frame.setVisible(true);
		    	frame.setVisible(false);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		ArrayList<JList<String>> ListsA = new ArrayList<JList<String>>();
		ArrayList<JList<String>> ListsF = new ArrayList<JList<String>>();
		ArrayList<JList<String>> ListsM = new ArrayList<JList<String>>();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JScrollPane ViewAll = new JScrollPane();
		tabbedPane.addTab("All courses", null, ViewAll, null);
		
		JPanel ViewAll_P = new JPanel();
		ViewAll.setViewportView(ViewAll_P);
		ViewAll_P.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JLabel CourseName_A = new JLabel("Course name");
		ViewAll_P.add(CourseName_A, "2, 2");
		
		JLabel ID_A = new JLabel("ID");
		ViewAll_P.add(ID_A, "4, 2");
		
		JLabel Section_A = new JLabel("Section");
		ViewAll_P.add(Section_A, "6, 2");
		
		JLabel Num_A = new JLabel("No. of students");
		ViewAll_P.add(Num_A, "8, 2");
		
		JLabel Max_A = new JLabel("Max students");
		ViewAll_P.add(Max_A, "10, 2");
		
		JLabel Instructor_A = new JLabel("Instructor");
		ViewAll_P.add(Instructor_A, "12, 2");
		
		JLabel Location_A = new JLabel("Location");
		ViewAll_P.add(Location_A, "14, 2");
		
		JList<String> NameList_A = new JList<String>();
		ViewAll_P.add(NameList_A, "2, 4, fill, fill");
		
		JList<String> IDList_A = new JList<String>();
		ViewAll_P.add(IDList_A, "4, 4, fill, fill");
		
		JList<String> SectionList_A = new JList<String>();
		ViewAll_P.add(SectionList_A, "6, 4, fill, fill");
		
		JList<String> NumList_A = new JList<String>();
		ViewAll_P.add(NumList_A, "8, 4, fill, fill");
		
		JList<String> MaxList_A = new JList<String>();
		ViewAll_P.add(MaxList_A, "10, 4, fill, fill");
		
		JList<String> InstructorList_A = new JList<String>();
		ViewAll_P.add(InstructorList_A, "12, 4, fill, fill");
		
		JList<String> LocationList_A = new JList<String>();
		ViewAll_P.add(LocationList_A, "14, 4, fill, fill");
		
		ListsA.add(NameList_A);
		ListsA.add(IDList_A);
		ListsA.add(SectionList_A);
		ListsA.add(NumList_A);
		ListsA.add(MaxList_A);
		ListsA.add(InstructorList_A);
		ListsA.add(LocationList_A);
		
		JScrollPane ViewFree = new JScrollPane();
		tabbedPane.addTab("Courses with space", null, ViewFree, null);
		
		JPanel ViewFree_P = new JPanel();
		ViewFree.setViewportView(ViewFree_P);
		ViewFree_P.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JLabel CourseName_F = new JLabel("Course name");
		ViewFree_P.add(CourseName_F, "2, 2");
		
		JLabel ID_F = new JLabel("ID");
		ViewFree_P.add(ID_F, "4, 2");
		
		JLabel Section_F = new JLabel("Section");
		ViewFree_P.add(Section_F, "6, 2");
		
		JLabel Num_F = new JLabel("No. of students");
		ViewFree_P.add(Num_F, "8, 2");
		
		JLabel Max_F = new JLabel("Max students");
		ViewFree_P.add(Max_F, "10, 2");
		
		JLabel Instructor_F = new JLabel("Instructor");
		ViewFree_P.add(Instructor_F, "12, 2");
		
		JLabel Location_F = new JLabel("Location");
		ViewFree_P.add(Location_F, "14, 2");
		
		JList<String> CourseList_F = new JList<String>();
		ViewFree_P.add(CourseList_F, "2, 4, fill, fill");
		
		JList<String> IDList_F = new JList<String>();
		ViewFree_P.add(IDList_F, "4, 4, fill, fill");
		
		JList<String> SectionList_F = new JList<String>();
		ViewFree_P.add(SectionList_F, "6, 4, fill, fill");
		
		JList<String> NumList_F = new JList<String>();
		ViewFree_P.add(NumList_F, "8, 4, fill, fill");
		
		JList<String> MaxList_F = new JList<String>();
		ViewFree_P.add(MaxList_F, "10, 4, fill, fill");
		
		JList<String> InstructorList_F = new JList<String>();
		ViewFree_P.add(InstructorList_F, "12, 4, fill, fill");
		
		JList<String> LocationList_F = new JList<String>();
		ViewFree_P.add(LocationList_F, "14, 4, fill, fill");
		
		ListsF.add(CourseList_F);
		ListsF.add(IDList_F);
		ListsF.add(SectionList_F);
		ListsF.add(NumList_F);
		ListsF.add(MaxList_F);
		ListsF.add(InstructorList_F);
		ListsF.add(LocationList_F);
		
		JScrollPane Register = new JScrollPane();
		tabbedPane.addTab("Register", null, Register, null);
		
		JPanel Register_P = new JPanel();
		Register.setViewportView(Register_P);
		Register_P.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel Section_R = new JLabel("Section");
		Register_P.add(Section_R, "2, 2, right, default");
		
		SectionField_R = new JTextField();
		Register_P.add(SectionField_R, "4, 2, fill, default");
		SectionField_R.setColumns(10);
		
		JLabel ID_R = new JLabel("ID");
		ID_R.setHorizontalAlignment(SwingConstants.RIGHT);
		Register_P.add(ID_R, "2, 4, right, default");
		ID_R.setHorizontalAlignment(SwingConstants.RIGHT);
		
		IDField_R = new JTextField();
		Register_P.add(IDField_R, "4, 4, fill, default");
		IDField_R.setColumns(10);
		
		JScrollPane Withdraw = new JScrollPane();
		tabbedPane.addTab("Withdraw", null, Withdraw, null);
		
		JPanel Withdraw_P = new JPanel();
		Withdraw.setViewportView(Withdraw_P);
		Withdraw_P.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JButton RegisterButton = new JButton("Register");
		Register_P.add(RegisterButton, "4, 6");
		
		JLabel RegisterStatus = new JLabel("");
		RegisterStatus.setHorizontalAlignment(SwingConstants.CENTER);
		Register_P.add(RegisterStatus, "4, 8");
		
		JLabel ID_W = new JLabel("ID");
		Withdraw_P.add(ID_W, "2, 2, right, default");
		
		JTextField IDField_W = new JTextField();
		Withdraw_P.add(IDField_W, "4, 2, fill, default");
		IDField_W.setColumns(10);
		
		JLabel Section_W = new JLabel("Section");
		Section_W.setHorizontalAlignment(SwingConstants.CENTER);
		Withdraw_P.add(Section_W, "2, 4, right, default");
		
		JTextField SectionField_W = new JTextField();
		Withdraw_P.add(SectionField_W, "4, 4, fill, default");
		SectionField_W.setColumns(10);
		
		JButton WithdrawButton = new JButton("Withdraw");
		Withdraw_P.add(WithdrawButton, "4, 6");
		
		JLabel WithdrawStatus = new JLabel("");
		WithdrawStatus.setHorizontalAlignment(SwingConstants.CENTER);
		Withdraw_P.add(WithdrawStatus, "4, 8");
		
		JScrollPane ViewMine = new JScrollPane();
		tabbedPane.addTab("My courses", null, ViewMine, null);
		
		JPanel ViewMine_P = new JPanel();
		ViewMine.setViewportView(ViewMine_P);
		ViewMine_P.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		JLabel CourseName_M = new JLabel("Course name");
		ViewMine_P.add(CourseName_M, "2, 2");
		
		JLabel ID_M = new JLabel("ID");
		ViewMine_P.add(ID_M, "4, 2");
		
		JLabel Section_M = new JLabel("Section");
		ViewMine_P.add(Section_M, "6, 2");
		
		JLabel Num_M = new JLabel("No. of students");
		ViewMine_P.add(Num_M, "8, 2");
		
		JLabel Max_M = new JLabel("Max students");
		ViewMine_P.add(Max_M, "10, 2");
		
		JLabel Instructor_M = new JLabel("Instructor");
		ViewMine_P.add(Instructor_M, "12, 2");
		
		JLabel Location_M = new JLabel("Location");
		ViewMine_P.add(Location_M, "14, 2");
		
		JList<String> CourseList_M = new JList<String>();
		ViewMine_P.add(CourseList_M, "2, 4, fill, fill");
		
		JList<String> IDList_M = new JList<String>();
		ViewMine_P.add(IDList_M, "4, 4, fill, fill");
		
		JList<String> SectionList_M = new JList<String>();
		ViewMine_P.add(SectionList_M, "6, 4, fill, fill");
		
		JList<String> NumList_M = new JList<String>();
		ViewMine_P.add(NumList_M, "8, 4, fill, fill");
		
		JList<String> MaxList_M = new JList<String>();
		ViewMine_P.add(MaxList_M, "10, 4, fill, fill");
		
		JList<String> InstructorList_M = new JList<String>();
		ViewMine_P.add(InstructorList_M, "12, 4, fill, fill");
		
		JList<String> LocationList_M = new JList<String>();
		ViewMine_P.add(LocationList_M, "14, 4, fill, fill");
		
		ListsM.add(CourseList_M);
		ListsM.add(IDList_M);
		ListsM.add(SectionList_M);
		ListsM.add(NumList_M);
		ListsM.add(MaxList_M);
		ListsM.add(InstructorList_M);
		ListsM.add(LocationList_M);
		
		/**
		 * My code below
		 */
		
		// View all the courses
		ViewAll.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				((Student) Main.activeUser).ViewAll_GUI(ListsA);
			}
		});
		
		// View free courses
		ViewFree.addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent e) {
				((Student) Main.activeUser).ViewFree_GUI(ListsF);
			}
		});
		
		// View the active students courses
		ViewMine.addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent e) {
				((Student) Main.activeUser).ViewMine_GUI(ListsM);
			}
		});
		
		// Withdraw the active student from courses
		WithdrawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Student) Main.activeUser).Drop("", Integer.parseInt(SectionField_W.getText()), IDField_W.getText(), Main.activeUser.getFirstName(), Main.activeUser.getLastName())) {
					WithdrawStatus.setText("Success");
				} else {
					WithdrawStatus.setText("OPERATION FAILED!");
				}
			}
		});
		
		// Register the active student from a course
		RegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Student) Main.activeUser).Register(
						"", 
						Integer.parseInt((SectionField_R.getText().equals("")) ? "0" : SectionField_R.getText()), 
						IDField_R.getText(), 
						Main.activeUser.getFirstName(), 
						Main.activeUser.getLastName())) {
					RegisterStatus.setText("Success");
				} else {
					RegisterStatus.setText("OPERATION FAILED!");
				}
			}
		});
	}
}
