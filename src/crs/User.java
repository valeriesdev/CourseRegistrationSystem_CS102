package crs;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
	private static final long serialVersionUID = 2027456427920134515L;
	private String username = "";
	private String password = "";
	private String firstName = "";
	private String lastName = "";
	ArrayList<Course> rCourses;
	
	public User() {
		this.username = "";
		this.password = "";
		this.firstName = "";
		this.lastName = "";
	}
	
	public User(String u, String p, String f, String l) {
		this.username = u;
		this.password = p;
		this.firstName = f;
		this.lastName = l;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	// Outputs formatted full name
	public String getName() {
		return this.lastName + "," + this.firstName;
	}
	
	// Compares if two users are equivalent
	public boolean equals(User s) {
		if(this.username == s.getUsername() &&
				this.password == s.getPassword() &&
				this.firstName == s.getFirstName() &&
				this.lastName == s.getLastName()) {
			return true;
		}
		return false;
	}
}
