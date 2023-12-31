package crs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
class Admin extends User implements AdminInterface, Serializable{
	private static final long serialVersionUID = -1980318512596547007L;

	public Admin(String u, String p, String f, String l) {
		super(u,p,f,l);
	}
	
	public Admin() {
		super();
	}

	public boolean AddCourse(String name, String id, int maxStudents, String professor, int section, String location) {
		try {
			Main.data.AddCourse(new Course(name, id, maxStudents, professor, section, location));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	// Edits a course to the new max students, instructor and location
	// Identifies the course via the id and section - course name is not used
	public boolean EditCourse(String name, String id, int maxStudents, String professor, int section, String location) {
		try {
			//Main.data.AddCourse(new Course(name, id, maxStudents, professor, section, location));
			for(Course c : Main.data.GetCourses()) {
				if(id.equals(c.getId()) && section == c.getSection()) {
					c.setMaxStudents((maxStudents < 0) ? c.getMaxStudents() : maxStudents);
					c.setInstructor(professor.equals("") ? c.getInstructor() : professor);
					c.setLocation(location.equals("") ? c.getLocation() : location);
					return true;
				}
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	// Deletes a course
	// Identifies the course via the id and section - course name is not used
	public boolean DeleteCourse(String name, String id, int section) {
		try {
			for(Course c : Main.data.GetCourses()) {
				if(id.equals(c.getId()) && section == c.getSection()) {
					Main.data.GetCourses().remove(c);
					return true;
				}
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	// Returns a string array containing the course information
	public String[] DisplayCourse(String name, String id, int section) {
		for(Course c : Main.data.GetCourses()) {
			if(c.getName().equals(name) && c.getId().equals(id) && c.getSection() == section) {
				return new String[] {c.getName(), c.getId(), ""+c.getMaxStudents(), ""+c.getNumStudents(), c.getInstructor(), ""+c.getSection(), c.getLocation()};
			}
		}
		return new String[] {};
	}
	
	// Registers a new student.
	// Does not allow multiple students to be registered with the same username
	public boolean RegisterStudent(String firstName, String lastName, String username, String password) {
		try {
			for(Student s : Main.data.GetStudents()) {
				if(username.equals(s.getUsername())) {
					return false;
				}
			}
			Main.data.AddUser(new Student(firstName, lastName, username, password));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	// Return a String[][] with all course information
	public String[][] GetAll() {
		String[][] values = new String[7][Main.data.GetCourses().size()];
        for (int i = 0; i < values[0].length; ++i) {
            values[0][i] = Main.data.GetCourses().get(i).getName();
            values[1][i] = Main.data.GetCourses().get(i).getId();
            values[2][i] = "" + Main.data.GetCourses().get(i).getSection();
            values[3][i] = "" + Main.data.GetCourses().get(i).getNumStudents();
            values[4][i] = "" + Main.data.GetCourses().get(i).getMaxStudents();
            values[5][i] = Main.data.GetCourses().get(i).getInstructor();
            values[6][i] = Main.data.GetCourses().get(i).getLocation();
        }
        
        return values;
	}
	
	// Return a String[] of all student full names
	public String[] GetStudents() {
		String[] values = new String[Main.data.GetStudents().size()];
        for (int i = 0; i < values.length; ++i) {
            values[i] = Main.data.GetStudents().get(i).getName();
        }
        return values;
	}
	
	// Return a String[][] of all full courses
	public String[][] GetFull() {
		String[][] values = new String[7][];
		List<ArrayList < String >> aValues = (List<ArrayList<String>>) Arrays.asList(new ArrayList < String > (),new ArrayList < String > (),new ArrayList < String > (),new ArrayList < String > (),new ArrayList < String > (),new ArrayList < String > (),new ArrayList < String > ());

        for (Course c : Main.data.GetCourses()) {
        	if(c.getNumStudents() >= c.getMaxStudents()) {
                aValues.get(0).add(c.getName());
                aValues.get(1).add(c.getId());
                aValues.get(2).add("" + c.getSection());
                aValues.get(3).add("" + c.getNumStudents());
                aValues.get(4).add("" + c.getMaxStudents());
                aValues.get(5).add(c.getInstructor());
                aValues.get(6).add(c.getLocation());
        	}
        }
        
        IntStream.range(0, 7).forEach(i -> values[i] = aValues.get(i++).toArray(new String[0]));
        return values;
	}
	
	// Writes all full courses to a csv
	public void WriteFull() throws IOException {
		String output = "";
		for(int i = 0; i < GetFull()[0].length; ++i) {
			output += GetFull()[0][i];
			output += ",";
			output += GetFull()[1][i];
			output += ",";
			output += GetFull()[2][i];
			output += ",";
			output += GetFull()[3][i];
			output += ",";
			output += GetFull()[4][i];
			output += ",";
			output += GetFull()[5][i];
			output += ",";
			output += GetFull()[6][i];
			output += "\n";
		}
		
        File file = new File("full_courses.csv");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(output);
        }
	}
	
	// Return a string[] of the students in a course given its position in the course array
	public String[] ViewStudentsInCourse(int index) {
		String[] values = new String[Main.data.GetCourses().get(index).students.size()];
        for (int i = 0; i < values.length; ++i) {
            values[i] = Main.data.GetCourses().get(index).students.get(i).getName();
        }
        
        return values;
	}
	
	// Return a string[] of the courses a student is registered in given its position in the student array
	public String[] ViewStudentsCourses(int index) {
		if(index > -1) {
			String[] values = new String[Main.data.GetStudents().get(index).getCourses().size()];
	        for (int i = 0; i < values.length; ++i) {
	            values[i] = Main.data.GetStudents().get(index).getCourses().get(i).getId();
	        }
	        
	        return values;
		}
		return new String[] {};
	}
	
	// Returns a String[][] of the courses sorted by most to least students
	public String[][] SortCourses() {
		ArrayList<Course> sortedCourses = new ArrayList<Course>(Main.data.GetCourses());
		Collections.sort(sortedCourses);

		String[][] values = new String[7][Main.data.GetCourses().size()];
        for (int i = 0; i < Main.data.GetCourses().size(); ++i) {
                values[0][i] = sortedCourses.get(i).getName();
                values[1][i] = sortedCourses.get(i).getId();
                values[2][i] = "" + sortedCourses.get(i).getSection();
                values[3][i] = "" + sortedCourses.get(i).getNumStudents();
                values[4][i] = "" + sortedCourses.get(i).getMaxStudents();
                values[5][i] = sortedCourses.get(i).getInstructor();
                values[6][i] = sortedCourses.get(i).getLocation();
        }
        
        return values;
	}
}