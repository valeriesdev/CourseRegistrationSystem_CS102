package crs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Data implements Serializable {
	private static final long serialVersionUID = 4169457952382225379L;
	
	// Main arraylists for the program to store data
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Course> courses = new ArrayList<Course>();
	
	// Save the data to a .ser file using serialization
	public void save() {
		try {
	         FileOutputStream fileOut = new FileOutputStream("data.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(this);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data saved in data.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}
	
	public ArrayList<User> GetUsers() {
		return users;
	}
	
	// Returns a list of the students in the users arraylist
	public ArrayList<Student> GetStudents() {
		ArrayList<Student> output = new ArrayList<Student>();
		
		for(int i = 0; i < GetUsers().size(); ++i) {
			if(GetUsers().get(i) instanceof Student) {
				output.add((Student) GetUsers().get(i));
			}
		}
		
		return output;
	}
	
	// Returns a list of the admin in the users arraylist
	public ArrayList<Admin> GetAdmin() {
		ArrayList<Admin> output = new ArrayList<Admin>();
		
		for(int i = 0; i < GetUsers().size(); ++i) {
			if(GetUsers().get(i) instanceof Admin) {
				output.add((Admin) GetUsers().get(i));
			}
		}
		
		return output;
	}
	
	public void AddUser(User u) {
		users.add(u);
	}

	public ArrayList<Course> GetCourses() {
		return courses;
	}
	
	public void AddCourse(Course c) {
		courses.add(c);
	}
}
