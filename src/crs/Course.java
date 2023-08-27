package crs;
import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Comparable<Course>, Serializable{
	private static final long serialVersionUID = 5338485430684252530L;
	
	// Private class variables
	private String name;
	private String id;
	private int maxStudents;
	private String instructor;
	private int section;
	private String location;
	
	//TODO: Convert from user to student
	//DONE^
	//TODO: Check if ^ still works
	ArrayList<Student> students = new ArrayList<Student>();
	
	public Course() {
		name = "";
		maxStudents = -1;
		instructor = "";
		section = 0;
		location = "";
	}
	
	public Course(String a, String b, int c, String d, int e, String f) {
		name = a;
		id = b;
		maxStudents = c;
		instructor = d;
		section = e;
		location = f;
	}
	
	// Return a courses information in string format
	public String displayInfo() {
		/*return String.format("Course Name: %s\nCourse id: %s\nNo. of students: %d\nMax Students: %d\nInstructor: %s\nSection: %d\nLocation: %s", 
				name, id, this.getNumStudents(), maxStudents, instructor, section, location
				);*/
		return String.format("%s, %s,%d,%d,%s,%d,%s", 
				name, id, this.getNumStudents(), maxStudents, instructor, section, location
				);
	}
	
	// Get the amount of free slots in acourse
	public int getFree() {
		return maxStudents - students.size();
	}
	
	// Add a student into the course
	public void addStudent(Student student) {
		students.add(student);
	}
	
	// Remove the student from the course
	public void dropStudent(Student student) {
		for(int i = 0; i < students.size(); ++i) {
			if(student.equals(students.get(i))) {
				students.remove(i);
				return;
			}
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String s) {
		id = s;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	// Set the number of max students, only if it is higher than than the current no. of students
	public void setMaxStudents(int maxStudents) {
		if(maxStudents > students.size()) {
			this.maxStudents = maxStudents;
		}
	}
	public int getNumStudents() {
		return students.size();
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String s) {
		instructor = s;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String l) {
		location = l;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int s) {
		section = s;
	}

	// Compare two courses, used in sorting the courses
	@Override
	public int compareTo(Course other) {
		return Integer.compare(this.getNumStudents(), other.getNumStudents());
	}
}
