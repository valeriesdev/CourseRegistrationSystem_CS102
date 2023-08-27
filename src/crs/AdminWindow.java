package crs;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;

public class AdminWindow {
    /**
     * README! README! README! README! README! README! README! README! README! README! 
     * README! README! README! README! README! README! README! README! README! README! 
     * README! README! README! README! README! README! README! README! README! README! 
     * README! README! README! README! README! README! README! README! README! README! 
     * README! README! README! README! README! README! README! README! README! README! 
     * 
     * Most of this code is mangled auto-generated WindowBuilder code, for my code go to line 89-130 and line 750 and below.
     */

    JFrame frame;
    private JTextField CourseName;
    private JTextField CourseId;
    private JTextField MaxStudents;
    private JTextField CourseInstructor;
    private JTextField SectionNumber;
    private JTextField CourseLocation;

    /**
     * Create the application.
     */
    public AdminWindow() {
        initialize();
    }

    private JList<String> list = new JList<String>();
    private JTextField textField;
    private JTextField MaxStudents_E;
    private JTextField CourseLocation_E;
    private JTextField CourseInstructor_E;
    private JTextField CourseID_E;
    private JTextField FirstName_R;
    private JTextField LastName_R;
    private JTextField UserName_R;
    private JTextField Password_R;
    private JTextField sectionField;
    private JTextField Section_E;

    /**
     * Initialize the contents of the frame.
     */
    @SuppressWarnings({
        "unchecked",
        "rawtypes",
        "serial"
    })
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1021, 668);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowClosed(WindowEvent e) {}

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

        // Management windows
        // Frames and panels
        JTabbedPane MainTab = new JTabbedPane(JTabbedPane.TOP);
        JTabbedPane ManagementTab = new JTabbedPane(JTabbedPane.TOP);
        JTabbedPane ReportTab = new JTabbedPane(JTabbedPane.TOP);
        JPanel DeleteCourse = new JPanel();
        JPanel EditCourse = new JPanel();
        JPanel DisplayCourse = new JPanel();
        JPanel ManagementPanel = new JPanel();
        JPanel CreateCourse = new JPanel();
        JPanel ReportPanel = new JPanel();
        JPanel ViewAll = new JPanel();
        JPanel ViewFull = new JPanel();
        JPanel ViewStudents = new JPanel();
        JPanel StudentsCourses = new JPanel();
        JPanel SortCourses = new JPanel();


        // Create Window Definitions
        ManagementTab.addTab("Create course", null, CreateCourse, null);
        JLabel lblNewLabel = new JLabel("Course name:");
        CourseName = new JTextField();
        JLabel lblNewLabel_1 = new JLabel("Course id:");
        CourseId = new JTextField();
        JLabel lblNewLabel_2 = new JLabel("Maximum students:");
        MaxStudents = new JTextField();
        JLabel lblNewLabel_3 = new JLabel("Course instructor:");
        CourseInstructor = new JTextField();
        JLabel lblNewLabel_4 = new JLabel("Section number:");
        SectionNumber = new JTextField();
        JLabel lblNewLabel_5 = new JLabel("Course location:");
        JLabel SuccessFailMessage = new JLabel("");
        CourseLocation = new JTextField();


        // Display Window Definitions
        ManagementTab.addTab("Display course", null, DisplayCourse, null);
        JPanel RegisterStudent = new JPanel();

        // Register Window Definitions
        ManagementTab.addTab("Register student", null, RegisterStudent, null);
        JLabel lblNewLabel_21 = new JLabel("Student first name:");
        FirstName_R = new JTextField();
        JLabel lblNewLabel_22 = new JLabel("Student last name:");
        LastName_R = new JTextField();
        JLabel lblNewLabel_23 = new JLabel("Student username:");
        UserName_R = new JTextField();
        JLabel lblNewLabel_24 = new JLabel("Student password:");
        Password_R = new JTextField();
        JButton RegisterButton = new JButton("Register student");
        JLabel RegisterStatus = new JLabel("");

        // Delete Window Definitions
        ManagementTab.addTab("Delete course", null, DeleteCourse, null);
        JLabel lblNewLabel_14 = new JLabel("Course ID:");
        textField = new JTextField();
        JButton DeleteButton = new JButton("Delete");
        JLabel DeleteStatus = new JLabel("");

        // Edit Window Definitions
        JLabel lblNewLabel_15 = new JLabel("Course ID:");
        CourseID_E = new JTextField();
        JLabel lblNewLabel_16 = new JLabel("Course Instructor:");
        CourseInstructor_E = new JTextField();
        JLabel lblNewLabel_17 = new JLabel("Course Location:");
        CourseLocation_E = new JTextField();
        JLabel lblNewLabel_18 = new JLabel("Course Max Students:");
        MaxStudents_E = new JTextField();
        JLabel lblNewLabel_19 = new JLabel("Cannot edit to below current no. of students");
        JLabel lblNewLabel_20 = new JLabel("Cannot edit course name, id, or section no.");
        JLabel EditStatus = new JLabel("");


        // Report windows
        // Report tabs
        ReportPanel.add(ReportTab);

        ReportTab.addTab("All courses", null, ViewAll, null);
        ReportTab.addTab("Full courses", null, ViewFull, null);
        ReportTab.addTab("Students in a course", null, ViewStudents, null);
        ViewStudents.setLayout(new BoxLayout(ViewStudents, BoxLayout.X_AXIS));

        JScrollPane scrollPane_3 = new JScrollPane();
        ViewStudents.add(scrollPane_3);

        JPanel panel_4 = new JPanel();
        scrollPane_3.setViewportView(panel_4);

        ReportTab.addTab("Student's Courses", null, StudentsCourses, null);
        StudentsCourses.setLayout(new BoxLayout(StudentsCourses, BoxLayout.X_AXIS));

        JScrollPane scrollPane_1 = new JScrollPane();
        StudentsCourses.add(scrollPane_1);

        JPanel panel = new JPanel();
        scrollPane_1.setViewportView(panel);

        JList Students_RSC = new JList();

        JList Courses_RSC = new JList();
        GroupLayout gl_panel = new GroupLayout(panel);

        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup()
                .addGap(6)
                .addComponent(Students_RSC, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(Courses_RSC, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
                .addGap(35))
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup()
                .addGap(6)
                .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
                    .addComponent(Students_RSC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Courses_RSC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                .addGap(31))
        );
        panel.setLayout(gl_panel);
        ReportTab.addTab("Sort courses", null, SortCourses, null);
        SortCourses.setLayout(new BoxLayout(SortCourses, BoxLayout.X_AXIS));

        JScrollPane scrollPane_4 = new JScrollPane();
        SortCourses.add(scrollPane_4);

        JPanel panel_2 = new JPanel();
        scrollPane_4.setViewportView(panel_2);
        panel_2.setLayout(new FormLayout(new ColumnSpec[] {
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
                    ColumnSpec.decode("default:grow"),
            },
            new RowSpec[] {
                FormSpecs.RELATED_GAP_ROWSPEC,
                    FormSpecs.DEFAULT_ROWSPEC,
                    FormSpecs.RELATED_GAP_ROWSPEC,
                    RowSpec.decode("default:grow"),
            }));

        JLabel lblNewLabel_39 = new JLabel("Course name");
        lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblNewLabel_39, "2, 2");

        JLabel lblNewLabel_40 = new JLabel("ID");
        lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblNewLabel_40, "4, 2");

        JLabel lblNewLabel_41 = new JLabel("Section");
        lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblNewLabel_41, "6, 2");

        JLabel lblNewLabel_42 = new JLabel("No. of students");
        lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblNewLabel_42, "8, 2");

        JLabel lblNewLabel_43 = new JLabel("Max students");
        lblNewLabel_43.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblNewLabel_43, "10, 2");

        JLabel lblNewLabel_44 = new JLabel("Instructor");
        lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblNewLabel_44, "12, 2");

        JLabel lblNewLabel_45 = new JLabel("Location");
        lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
        panel_2.add(lblNewLabel_45, "14, 2");

        JList Name_SC = new JList();
        panel_2.add(Name_SC, "2, 4, fill, fill");

        JList ID_SC = new JList();
        panel_2.add(ID_SC, "4, 4, fill, fill");

        JList Section_SC = new JList();
        panel_2.add(Section_SC, "6, 4, fill, fill");

        JList Num_SC = new JList();
        panel_2.add(Num_SC, "8, 4, fill, fill");

        JList Max_SC = new JList();
        panel_2.add(Max_SC, "10, 4, fill, fill");

        JList Instructor_SC = new JList();
        panel_2.add(Instructor_SC, "12, 4, fill, fill");

        JList Location_SC = new JList();
        panel_2.add(Location_SC, "14, 4, fill, fill");

        frame.getContentPane().add(MainTab);
        MainTab.addTab("Courses Management", null, ManagementPanel, null);
        ManagementPanel.setLayout(new BoxLayout(ManagementPanel, BoxLayout.X_AXIS));

        ManagementPanel.add(ManagementTab);

        // Create course tab
        CreateCourse.setLayout(new FormLayout(new ColumnSpec[] {
            FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
        }, new RowSpec[] {
            FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
        }));
        lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        CreateCourse.add(lblNewLabel, "6, 4, right, default");
        CreateCourse.add(CourseName, "8, 4, fill, default");
        CourseName.setColumns(10);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
        CreateCourse.add(lblNewLabel_1, "6, 6, right, default");
        CreateCourse.add(CourseId, "8, 6, fill, default");
        CourseId.setColumns(10);
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
        CreateCourse.add(lblNewLabel_2, "6, 8, right, default");
        CreateCourse.add(MaxStudents, "8, 8, fill, default");
        MaxStudents.setColumns(10);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
        CreateCourse.add(lblNewLabel_3, "6, 10, right, default");
        CreateCourse.add(CourseInstructor, "8, 10, fill, default");
        CourseInstructor.setColumns(10);
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
        CreateCourse.add(lblNewLabel_4, "6, 12, right, default");
        CreateCourse.add(SectionNumber, "8, 12, fill, default");
        SectionNumber.setColumns(10);
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
        CreateCourse.add(lblNewLabel_5, "6, 14, right, default");
        CreateCourse.add(CourseLocation, "8, 14, fill, default");
        CourseLocation.setColumns(10);
        CreateCourse.add(SuccessFailMessage, "8, 18");

        // Submit button for create course option
        JButton CreateButton = new JButton("Submit");

        CreateCourse.add(CreateButton, "8, 16");


        // Delete course tab
        DeleteCourse.setLayout(new FormLayout(new ColumnSpec[] {
        		FormSpecs.RELATED_GAP_COLSPEC,
        		FormSpecs.DEFAULT_COLSPEC,
        		FormSpecs.RELATED_GAP_COLSPEC,
        		FormSpecs.DEFAULT_COLSPEC,
        		FormSpecs.RELATED_GAP_COLSPEC,
        		FormSpecs.DEFAULT_COLSPEC,
        		FormSpecs.RELATED_GAP_COLSPEC,
        		FormSpecs.DEFAULT_COLSPEC,
        		FormSpecs.RELATED_GAP_COLSPEC,
        		FormSpecs.DEFAULT_COLSPEC,
        		FormSpecs.RELATED_GAP_COLSPEC,
        		ColumnSpec.decode("default:grow"),},
        	new RowSpec[] {
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,}));


        DeleteCourse.add(lblNewLabel_14, "10, 6, right, default");
        DeleteCourse.add(textField, "12, 6, fill, default");
        textField.setColumns(10);
        
        JLabel lblNewLabel_46 = new JLabel("Course section:");
        DeleteCourse.add(lblNewLabel_46, "10, 8, right, default");
        
        sectionField = new JTextField();
        DeleteCourse.add(sectionField, "12, 8, fill, default");
        sectionField.setColumns(10);
        DeleteCourse.add(DeleteButton, "12, 10");
        DeleteCourse.add(DeleteStatus, "12, 14");


        // Edit course tab
        ManagementTab.addTab("Edit course", null, EditCourse, null);
        EditCourse.setLayout(new FormLayout(new ColumnSpec[] {
        		FormSpecs.RELATED_GAP_COLSPEC,
        		FormSpecs.DEFAULT_COLSPEC,
        		FormSpecs.RELATED_GAP_COLSPEC,
        		FormSpecs.DEFAULT_COLSPEC,
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
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,
        		FormSpecs.RELATED_GAP_ROWSPEC,
        		FormSpecs.DEFAULT_ROWSPEC,}));

        lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
        EditCourse.add(lblNewLabel_15, "6, 4, right, default");
        EditCourse.add(CourseID_E, "8, 4, fill, default");
        CourseID_E.setColumns(10);
        
        JLabel lblNewLabel_47 = new JLabel("Course section:");
        lblNewLabel_47.setHorizontalAlignment(SwingConstants.RIGHT);
        EditCourse.add(lblNewLabel_47, "6, 6, right, default");
        
        Section_E = new JTextField();
        EditCourse.add(Section_E, "8, 6, fill, default");
        Section_E.setColumns(10);
        
        JSeparator separator = new JSeparator();
        EditCourse.add(separator, "8, 8");
        lblNewLabel_16.setHorizontalAlignment(SwingConstants.RIGHT);
        EditCourse.add(lblNewLabel_16, "6, 10, right, default");
        EditCourse.add(CourseInstructor_E, "8, 10, fill, default");
        CourseInstructor_E.setColumns(10);
        lblNewLabel_17.setHorizontalAlignment(SwingConstants.RIGHT);
        EditCourse.add(lblNewLabel_17, "6, 12, right, default");
        EditCourse.add(CourseLocation_E, "8, 12, fill, default");
        CourseLocation_E.setColumns(10);
        lblNewLabel_18.setHorizontalAlignment(SwingConstants.RIGHT);
        EditCourse.add(lblNewLabel_18, "6, 14, right, default");
        EditCourse.add(MaxStudents_E, "8, 14, fill, default");
        MaxStudents_E.setColumns(10);
        EditCourse.add(lblNewLabel_19, "10, 14");
        lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
        EditCourse.add(lblNewLabel_20, "8, 16");
        JButton EditButton = new JButton("Edit course");

        EditCourse.add(EditButton, "8, 18");
        EditCourse.add(EditStatus, "8, 20");


        // Display course tab
        DisplayCourse.setLayout(new BorderLayout(0, 0));

        JScrollPane DisplayCourseScroll = new JScrollPane();
        DisplayCourse.add(DisplayCourseScroll, BorderLayout.CENTER);

        JPanel DisplayCourseScrollPanel = new JPanel();
        DisplayCourseScroll.setViewportView(DisplayCourseScrollPanel);
        DisplayCourseScrollPanel.setLayout(new BorderLayout(0, 0));
        DisplayCourseScrollPanel.add(list, BorderLayout.WEST);
        JPanel DisplayCourseSubPanel = new JPanel();
        DisplayCourseScrollPanel.add(DisplayCourseSubPanel, BorderLayout.CENTER);
        JLabel lblNewLabel_6 = new JLabel("Course name:");
        JLabel CourseName_D = new JLabel("");
        JLabel lblNewLabel_7 = new JLabel("Course id:");
        JLabel CourseID_D = new JLabel("");
        JLabel lblNewLabel_8 = new JLabel("Max. students:");
        JLabel MaxStudents_D = new JLabel("");
        JLabel lblNewLabel_9 = new JLabel("No. of students:");
        JLabel NoStudents_D = new JLabel("");
        JLabel lblNewLabel_10 = new JLabel("Students:");
        JLabel lblNewLabel_11 = new JLabel("Instructor:");
        JLabel CourseInsturctor_D = new JLabel("");
        JLabel lblNewLabel_12 = new JLabel("Section number:");
        JLabel CourseSection_D = new JLabel("");
        JLabel lblNewLabel_13 = new JLabel("Course location:");
        JLabel CourseLocation_D = new JLabel("");
        JComboBox studentsBox = new JComboBox();
        studentsBox.setModel(new DefaultComboBoxModel(new String[] {
            " "
        }));
        DisplayCourseSubPanel.setLayout(new FormLayout(new ColumnSpec[] {
            FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
        }, new RowSpec[] {
            FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
        }));
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayCourseSubPanel.add(lblNewLabel_6, "6, 4");
        DisplayCourseSubPanel.add(CourseName_D, "8, 4");
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayCourseSubPanel.add(lblNewLabel_7, "6, 6");
        DisplayCourseSubPanel.add(CourseID_D, "8, 6");
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayCourseSubPanel.add(lblNewLabel_8, "6, 8");
        DisplayCourseSubPanel.add(MaxStudents_D, "8, 8");
        lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayCourseSubPanel.add(lblNewLabel_9, "6, 10");
        DisplayCourseSubPanel.add(NoStudents_D, "8, 10");
        lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayCourseSubPanel.add(lblNewLabel_10, "6, 12");
        DisplayCourseSubPanel.add(studentsBox, "8, 12, fill, default");
        lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayCourseSubPanel.add(lblNewLabel_11, "6, 14");
        DisplayCourseSubPanel.add(CourseInsturctor_D, "8, 14");
        lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayCourseSubPanel.add(lblNewLabel_12, "6, 16");
        DisplayCourseSubPanel.add(CourseSection_D, "8, 16");
        lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayCourseSubPanel.add(lblNewLabel_13, "6, 18");
        DisplayCourseSubPanel.add(CourseLocation_D, "8, 18");


        // Register students tab
        RegisterStudent.setLayout(new FormLayout(new ColumnSpec[] {
            FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC, FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
        }, new RowSpec[] {
            FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
        }));
        lblNewLabel_21.setHorizontalAlignment(SwingConstants.RIGHT);
        RegisterStudent.add(lblNewLabel_21, "6, 4, right, default");
        RegisterStudent.add(FirstName_R, "8, 4, fill, default");
        FirstName_R.setColumns(10);
        lblNewLabel_22.setHorizontalAlignment(SwingConstants.RIGHT);
        RegisterStudent.add(lblNewLabel_22, "6, 6, right, default");
        RegisterStudent.add(LastName_R, "8, 6, fill, default");
        LastName_R.setColumns(10);
        RegisterStudent.add(lblNewLabel_23, "6, 8, right, default");
        RegisterStudent.add(UserName_R, "8, 8, fill, default");
        UserName_R.setColumns(10);
        lblNewLabel_24.setHorizontalAlignment(SwingConstants.RIGHT);
        RegisterStudent.add(lblNewLabel_24, "6, 10, right, default");
        RegisterStudent.add(Password_R, "8, 10, fill, default");
        Password_R.setColumns(10);
        RegisterStudent.add(RegisterButton, "8, 12");
        RegisterStudent.add(RegisterStatus, "8, 14");


        // Reports
        MainTab.addTab("Reports", null, ReportPanel, null);
        ReportPanel.setLayout(new BoxLayout(ReportPanel, BoxLayout.X_AXIS));
        ViewAll.setLayout(new BorderLayout(0, 0));
        JScrollPane scrollPane = new JScrollPane();
        ViewAll.add(scrollPane);
        JPanel panel_1 = new JPanel();
        scrollPane.setViewportView(panel_1);
        panel_1.setLayout(new FormLayout(new ColumnSpec[] {
                FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
            },
            new RowSpec[] {
                FormSpecs.RELATED_GAP_ROWSPEC,
                    FormSpecs.DEFAULT_ROWSPEC,
                    FormSpecs.RELATED_GAP_ROWSPEC,
                    FormSpecs.DEFAULT_ROWSPEC,
            }));

        JLabel lblNewLabel_25 = new JLabel("Course name");
        panel_1.add(lblNewLabel_25, "2, 2");

        JLabel lblNewLabel_26 = new JLabel("ID");
        panel_1.add(lblNewLabel_26, "4, 2");

        JLabel lblNewLabel_27 = new JLabel("Section");
        panel_1.add(lblNewLabel_27, "6, 2");

        JLabel lblNewLabel_28 = new JLabel("No. of students");
        panel_1.add(lblNewLabel_28, "8, 2");

        JLabel lblNewLabel_29 = new JLabel("Max students");
        panel_1.add(lblNewLabel_29, "10, 2");

        JLabel lblNewLabel_30 = new JLabel("Instructor");
        panel_1.add(lblNewLabel_30, "12, 2");

        JLabel lblNewLabel_31 = new JLabel("Location");
        panel_1.add(lblNewLabel_31, "14, 2");

        // All courses report
        JList Name_RA = new JList();
        panel_1.add(Name_RA, "2, 4");
        JList Id_RA = new JList();
        panel_1.add(Id_RA, "4, 4");
        JList Section_RA = new JList();
        panel_1.add(Section_RA, "6, 4");
        JList Num_RA = new JList();
        panel_1.add(Num_RA, "8, 4");
        JList Max_RA = new JList();
        panel_1.add(Max_RA, "10, 4");
        JList Instructor_RA = new JList();
        panel_1.add(Instructor_RA, "12, 4");
        JList Location_RA = new JList();
        panel_1.add(Location_RA, "14, 4");

        ViewFull.setLayout(new BoxLayout(ViewFull, BoxLayout.X_AXIS));

        JScrollPane scrollPane_2 = new JScrollPane();
        ViewFull.add(scrollPane_2);

        JPanel panel_3 = new JPanel();
        scrollPane_2.setViewportView(panel_3);
        panel_3.setLayout(new FormLayout(new ColumnSpec[] {
                FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
                    FormSpecs.RELATED_GAP_COLSPEC,
                    FormSpecs.DEFAULT_COLSPEC,
            },
            new RowSpec[] {
                FormSpecs.RELATED_GAP_ROWSPEC,
                    FormSpecs.DEFAULT_ROWSPEC,
                    FormSpecs.RELATED_GAP_ROWSPEC,
                    FormSpecs.DEFAULT_ROWSPEC,
            }));

        JLabel lblNewLabel_32 = new JLabel("Course name");
        panel_3.add(lblNewLabel_32, "2, 2");

        JLabel lblNewLabel_33 = new JLabel("ID");
        panel_3.add(lblNewLabel_33, "4, 2");

        JLabel lblNewLabel_34 = new JLabel("Section");
        panel_3.add(lblNewLabel_34, "6, 2");

        JLabel lblNewLabel_35 = new JLabel("No. of students");
        panel_3.add(lblNewLabel_35, "8, 2");

        JLabel lblNewLabel_36 = new JLabel("Max students");
        panel_3.add(lblNewLabel_36, "10, 2");

        JLabel lblNewLabel_37 = new JLabel("Instructor");
        panel_3.add(lblNewLabel_37, "12, 2");

        JLabel lblNewLabel_38 = new JLabel("Location");
        panel_3.add(lblNewLabel_38, "14, 2");
        // Full courses report
        JList Name_RF = new JList();
        panel_3.add(Name_RF, "2, 4");
        JList Id_RF = new JList();
        panel_3.add(Id_RF, "4, 4");
        JList Section_RF = new JList();
        panel_3.add(Section_RF, "6, 4");
        JList Num_RF = new JList();
        panel_3.add(Num_RF, "8, 4");
        JList Max_RF = new JList();
        panel_3.add(Max_RF, "10, 4");
        JList Instructor_RF = new JList();
        panel_3.add(Instructor_RF, "12, 4");
        JList Location_RF = new JList();
        panel_3.add(Location_RF, "14, 4");
        JButton Submit_RF = new JButton("Write to file");
        panel_3.add(Submit_RF, "16, 4");

        JList Courses_RVS = new JList();
        JList Students_RVS = new JList();

        GroupLayout gl_panel_4 = new GroupLayout(panel_4);
        gl_panel_4.setHorizontalGroup(
            gl_panel_4.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_4.createSequentialGroup()
                .addGap(6)
                .addComponent(Courses_RVS, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                .addGap(18)
                .addComponent(Students_RVS, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE)
                .addGap(64))
        );
        gl_panel_4.setVerticalGroup(
            gl_panel_4.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_4.createSequentialGroup()
                .addGap(6)
                .addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING, false)
                    .addComponent(Courses_RVS, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Students_RVS, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
                .addGap(30))
        );
        panel_4.setLayout(gl_panel_4);



        /**
         * IMPORTANT IMPORTANT
         * My code below
         */
        
        /**
         * Update the various lists when a user selects a tab in the report window
         */
        ReportTab.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                if (ReportTab.getSelectedIndex() == 0) {
                    // All courses
                    if (Main.data.GetCourses().size() > 0) {
                    	String[][] courseArray = ((Admin) Main.activeUser).GetAll();
                    	
                        Name_RA.setModel(new AbstractListModel() { String[] values = courseArray[0]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                        Id_RA.setModel(new AbstractListModel() { String[] values = courseArray[1]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                        Section_RA.setModel(new AbstractListModel() { String[] values = courseArray[2]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                        Num_RA.setModel(new AbstractListModel() { String[] values = courseArray[3]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                        Max_RA.setModel(new AbstractListModel() { String[] values = courseArray[4]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                        Instructor_RA.setModel(new AbstractListModel() { String[] values = courseArray[5]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                        Location_RA.setModel(new AbstractListModel() { String[] values = courseArray[6]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
                    }
                    // Full courses
                } else if (ReportTab.getSelectedIndex() == 1) {
                    String[][] info = ((Admin) Main.activeUser).GetFull();
                    if (info[0].length > 0) { 
                    	Name_RF.setModel(new AbstractListModel() { String[] values = info[0]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Id_RF.setModel(new AbstractListModel() { String[] values = info[1]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Section_RF.setModel(new AbstractListModel() { String[] values = info[2]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Num_RF.setModel(new AbstractListModel() { String[] values = info[3]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Max_RF.setModel(new AbstractListModel() { String[] values = info[4]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Instructor_RF.setModel(new AbstractListModel() { String[] values = info[5]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Location_RF.setModel(new AbstractListModel() { String[] values = info[6]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
                    }
                    // Students in course
                } else if (ReportTab.getSelectedIndex() == 2) {
                    String[] values = ((Admin) Main.activeUser).GetAll()[0];
                    Courses_RVS.setModel(new AbstractListModel() {

                        public int getSize() {
                            return values.length;
                        }
                        public Object getElementAt(int index) {
                            return values[index];
                        }
                    });
                    // Students' courses
                } else if (ReportTab.getSelectedIndex() == 3) {
                    String[] values = ((Admin) Main.activeUser).GetStudents();

                    Students_RSC.setModel(new AbstractListModel() {
                        public int getSize() {
                            return values.length;
                        }
                        public Object getElementAt(int index) {
                            return values[index];
                        }
                    });
                    // Sorted courses
                } else if (ReportTab.getSelectedIndex() == 4) {
                    String[][] info = ((Admin) Main.activeUser).SortCourses();
                    if (info[0].length > 0) {
                    	Name_SC.setModel(new AbstractListModel() { String[] values = info[0]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	ID_SC.setModel(new AbstractListModel() { String[] values = info[1]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Section_SC.setModel(new AbstractListModel() { String[] values = info[2]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Num_SC.setModel(new AbstractListModel() { String[] values = info[3]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Max_SC.setModel(new AbstractListModel() { String[] values = info[4]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Instructor_SC.setModel(new AbstractListModel() { String[] values = info[5]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } }); 
                    	Location_SC.setModel(new AbstractListModel() { String[] values = info[6]; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
                    }
                }
            }
        });
        
        // Creates a new course
        CreateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (((Admin) Main.activeUser).AddCourse(
                        CourseName.getText(),
                        CourseId.getText(),
                        Integer.parseInt(MaxStudents.getText()),
                        CourseInstructor.getText(),
                        Integer.parseInt(SectionNumber.getText()),
                        CourseLocation.getText())) {
                    SuccessFailMessage.setText("Success!");
                } else {
                    SuccessFailMessage.setText("OPERATION FAILED!");
                }
            }
        });

        // Deletes a course
        DeleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (((Admin) Main.activeUser).DeleteCourse(null, textField.getText(), Integer.parseInt(sectionField.getText()))) {
                    DeleteStatus.setText("Success");
                } else {
                    DeleteStatus.setText("OPERATION FAILED!");
                }
            }
        });

        // Edits a course
        EditButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (((Admin) Main.activeUser).EditCourse(
                		null, 
                		CourseID_E.getText(), 
                		Integer.parseInt(MaxStudents_E.getText().equals("") ? "-1" : MaxStudents_E.getText()), 
                		CourseInstructor_E.getText(), 
                		Integer.parseInt(Section_E.getText().equals("") ? "-1" : Section_E.getText()), 
                		CourseLocation_E.getText())) {
                    EditStatus.setText("Success");
                } else {
                    EditStatus.setText("OPERATION FAILED!");
                }
            }
        });

        // UPDATE TO INCLUDE USER METHODS
        // Updates the course information when a course in the list is selected
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                try {
                	String[] courseInfo = ((Admin) Main.activeUser).DisplayCourse(Main.data.GetCourses().get(list.getSelectedIndex()).getName(), 
                			Main.data.GetCourses().get(list.getSelectedIndex()).getId(),
                			Main.data.GetCourses().get(list.getSelectedIndex()).getSection());
                    CourseName_D.setText(courseInfo[0]);
                    CourseID_D.setText(courseInfo[1]);
                    MaxStudents_D.setText(courseInfo[2]);
                    NoStudents_D.setText(courseInfo[3]);
                    CourseInsturctor_D.setText(courseInfo[4]);
                    CourseSection_D.setText(courseInfo[5]);
                    CourseLocation_D.setText(courseInfo[6]);

                    String[] values = ((Admin) Main.activeUser).ViewStudentsInCourse(list.getSelectedIndex());
                    studentsBox.setModel(new DefaultComboBoxModel(values));
                } catch (Exception exc) {

                }
            }
        });

        // Updates the course list in the display tab
        ManagementTab.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                String[] values = ((Admin) Main.activeUser).GetAll()[1];
                
                list.setModel(new AbstractListModel() {
                    public int getSize() {
                        return values.length;
                    }
                    public Object getElementAt(int index) {
                        return values[index];
                    }
                });
            }
        });

        // Register a new student
        RegisterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (((Admin) Main.activeUser).RegisterStudent(FirstName_R.getText(), LastName_R.getText(), UserName_R.getText(), Password_R.getText())) {
                	RegisterStatus.setText("Success");
                } else {
                    RegisterStatus.setText("OPERATION FAILED!");
                }
            }
        });
        
        // Write the full courses to a file
        Submit_RF.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                try {
					((Admin) Main.activeUser).WriteFull();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
            }
        });

        // View the students in a course
        Courses_RVS.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (ReportTab.getSelectedIndex() == 2) {
                    String[] values = ((Admin) Main.activeUser).ViewStudentsInCourse(Courses_RVS.getSelectedIndex());

                    Students_RVS.setModel(new AbstractListModel() {
                        public int getSize() {
                            return values.length;
                        }
                        public Object getElementAt(int index) {
                            return values[index];
                        }
                    });
                }
            }
        });

        // View the student's registered courses
        Students_RSC.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (ReportTab.getSelectedIndex() == 3) {
                    String[] values = ((Admin) Main.activeUser).ViewStudentsCourses(Students_RSC.getSelectedIndex());

                    Courses_RSC.setModel(new AbstractListModel() {
                        public int getSize() {
                            return values.length;
                        }
                        public Object getElementAt(int index) {
                            return values[index];
                        }
                    });
                }
            }
        });
    }
}