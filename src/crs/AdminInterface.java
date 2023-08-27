package crs;

import java.io.IOException;

public interface AdminInterface {
	// Creates a new course
	public boolean AddCourse(String name, String id, int maxStudents, String professor, int section, String location);  
	
	// Edits a course to the new max students, instructor and location
	// Identifies the course via the id and section - course name is not used
	public boolean EditCourse(String name, String id, int maxStudents, String professor, int section, String location); 
	
	// Deletes a course
	// Identifies the course via the id and section - course name is not used
	public boolean DeleteCourse(String name, String id, int section);
	
	// Returns a string array containing the course information
	public String[] DisplayCourse(String name, String id, int section);
	
	// Registers a new student.
	// Does not allow multiple students to be registered with the same username
	public boolean RegisterStudent(String firstName, String lastName, String username, String password);
	
	// Return a String[][] with all course information
	public String[][] GetAll();
	
	// Return a String[][] of all full courses
	public String[][] GetFull();
	
	// Writes all full courses to a CSV
	public void WriteFull() throws IOException;
	
	// Return a string[] of the students in a course given its position in the course array
	public String[] ViewStudentsInCourse(int index);
	
	// Return a string[] of the courses a student is registered in given its position in the student array
	public String[] ViewStudentsCourses(int index);
	
	// Returns a String[][] of the courses sorted by most to least students
	public String[][] SortCourses();
	
	// Return a String[] of all student full names
	public String[] GetStudents();
}
