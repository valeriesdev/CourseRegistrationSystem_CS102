package crs;

import java.util.ArrayList;

import javax.swing.JList;

public interface StudentInterface {
	// Sets the lists passed into it to contain the values from all the courses
	void ViewAll_GUI(ArrayList<JList<String>> ListsA);
	
	// Sets the lists passed into it to contain the values from courses with free slots
	void ViewFree_GUI(ArrayList<JList<String>> ListsF);
	
	// Register a student to a course
	boolean Register(String name, int section, String id, String fName, String lName);
	
	// Drop a student from a course
	boolean Drop(String name, int section, String id, String fName, String lName);
	
	// Sets the lists passed into it to contain the values from signed in students courses
	void ViewMine_GUI(ArrayList<JList<String>> ListsN);
}
