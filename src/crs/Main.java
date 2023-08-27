package crs;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.UIManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static User activeUser = null;
	public static LoginWindow loginWindow = new LoginWindow();
	public static Data data;
	
	/**
	 * TODO:
	 * 
	 * review requirements
	 * note differences
	 **/
	
	public static void main(String[] args) {
		loadData(); // Attempts to load data
		
		// Simply sets the appearance of the windows
		try { 
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"); } 
		catch (Throwable e) {
			e.printStackTrace();
		}
		
		// Starts up the window
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginWindow.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	static void loadData() {
		try {
			// Attempts to read from the data.ser files
	         FileInputStream fileIn = new FileInputStream("data.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         data = (Data) in.readObject();
	         in.close();
	         fileIn.close();
	         System.out.println("Successfully loaded SER");
	    } catch (IOException | ClassNotFoundException i) {
	    	// Loads from CSV on fail to read SER
	    	 System.out.println("Failed loading SER");
	    	 
	    	 // Creates a new Data(), something might have gone wrong on the prior load
	         data = new Data();
	         data.AddUser(new Admin("admin", "admin001", "null", "null"));
	         // Create a List<List<String>> to store the CSV in
	         List<List<String>> dataSheet = new ArrayList<>();
	         // Load the CSV into ^
	         try (BufferedReader br = new BufferedReader(new FileReader("MyUniversityCourses (4) (2).csv "))) {
	             String line;
	             while ((line = br.readLine()) != null) {
	                 String[] values = line.split(",");
	                 dataSheet.add(Arrays.asList(values));
	             }
	             
	             // Remove headers
	             dataSheet.remove(0);
	             
	             // Store CSV to the List<List<String>>
	             for(List<String> row : dataSheet) {
	            	 data.AddCourse(new Course(row.get(0), row.get(1), Integer.parseInt(row.get(2)), row.get(5), Integer.parseInt(row.get(6)), row.get(7)));
	             }
	             System.out.println("Successfully loaded CSV");
	         } catch (IOException ioe) {
	        	 // If that fails, then ... ¯\_(ツ)_/¯
	        	 System.out.println("Failed loading CSV");
	        	 ioe.printStackTrace();
	         }
	    }
	}
	
	// On a sign in attempt
	public static boolean onSignIn(String user, String pass) {
		// Iterate through the users, look for the user and pass which were inputted
		for(User u : data.GetUsers()) {
			if(u.getUsername().equals(user) && u.getPassword().equals(pass)) {
				// If successful, set the activeUser and open the relevant window
				activeUser = u;
				// Close the login window, open Admin window
				if(activeUser.getClass() == (new Admin()).getClass()) {
					loginWindow.frame.setVisible(false);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								AdminWindow window = new AdminWindow();
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				// Close the login window, open the Student window
				} else if(activeUser.getClass() == (new Student()).getClass()) {
					loginWindow.frame.setVisible(false);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								StudentWindow window = new StudentWindow();
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				// Send true to signal a successful login
				return true;
			} 
		}
		// onSignIn is invoked each time the login button is pressed, so nothing needs to be handled on a failed attempt other than return false
		return false;
	}
}