package crs;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.JList;

public class Student extends User implements StudentInterface, Serializable {
	private static final long serialVersionUID = -4471253960770100581L;
	ArrayList<Course> rCourses = new ArrayList<Course>();
	
	public Student() {
		super();
	}
	
	public Student(String f, String l, String u, String p) {
		super(u,p,f,l);
	}
	
	// Sets the lists passed into it to contain the values from all the courses
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public void ViewAll_GUI(ArrayList<JList<String>> ListsA) {
		String[] nValues = new String[Main.data.GetCourses().size()];
		String[] iValues = new String[Main.data.GetCourses().size()];
		String[] sValues = new String[Main.data.GetCourses().size()];
		String[] nuValues = new String[Main.data.GetCourses().size()];
		String[] mValues = new String[Main.data.GetCourses().size()];
		String[] isValues = new String[Main.data.GetCourses().size()];
		String[] lValues = new String[Main.data.GetCourses().size()];
		for(int i = 0; i < nValues.length; ++i) {
			nValues[i]  = Main.data.GetCourses().get(i).getName();
			iValues[i]  = Main.data.GetCourses().get(i).getId();
			sValues[i]  = ""+Main.data.GetCourses().get(i).getSection();
			nuValues[i] = ""+Main.data.GetCourses().get(i).getNumStudents();
			mValues[i]  = ""+Main.data.GetCourses().get(i).getMaxStudents();
			isValues[i] = Main.data.GetCourses().get(i).getInstructor();
			lValues[i]  = Main.data.GetCourses().get(i).getLocation();
		}
		ListsA.get(0).setModel(new AbstractListModel() { String[] values = nValues; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
		ListsA.get(1).setModel(new AbstractListModel() { String[] values = iValues; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
		ListsA.get(2).setModel(new AbstractListModel() { String[] values = sValues; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
		ListsA.get(3).setModel(new AbstractListModel() { String[] values = nuValues; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
		ListsA.get(4).setModel(new AbstractListModel() { String[] values = mValues; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
		ListsA.get(5).setModel(new AbstractListModel() { String[] values = isValues; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
		ListsA.get(6).setModel(new AbstractListModel() { String[] values = lValues; public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
	}

	// Sets the lists passed into it to contain the values from courses with free slots
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public void ViewFree_GUI(ArrayList<JList<String>> ListsF) {
		if(Main.data.GetCourses().size() > 0) {
			ArrayList<String> nValues  = new ArrayList<String>();
			ArrayList<String> iValues  = new ArrayList<String>();
			ArrayList<String> sValues  = new ArrayList<String>();
			ArrayList<String> nuValues = new ArrayList<String>();
			ArrayList<String> mValues  = new ArrayList<String>();
			ArrayList<String> isValues = new ArrayList<String>();
			ArrayList<String> lValues  = new ArrayList<String>();
			for(int i = 0; i < Main.data.GetCourses().size(); ++i) {
				if(Main.data.GetCourses().get(i).getMaxStudents() > Main.data.GetCourses().get(i).getNumStudents()) {
					nValues.add(Main.data.GetCourses().get(i).getName());
					iValues.add(Main.data.GetCourses().get(i).getId());
					sValues.add(""+Main.data.GetCourses().get(i).getSection());
					nuValues.add(""+Main.data.GetCourses().get(i).getNumStudents());
					mValues.add(""+Main.data.GetCourses().get(i).getMaxStudents());
					isValues.add(Main.data.GetCourses().get(i).getInstructor());
					lValues.add(Main.data.GetCourses().get(i).getLocation());
				}
			}
			ListsF.get(0).setModel(new AbstractListModel() { String[] values = nValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsF.get(1).setModel(new AbstractListModel() { String[] values = iValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsF.get(2).setModel(new AbstractListModel() { String[] values = sValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsF.get(3).setModel(new AbstractListModel() { String[] values = nuValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsF.get(4).setModel(new AbstractListModel() { String[] values = mValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsF.get(5).setModel(new AbstractListModel() { String[] values = isValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsF.get(6).setModel(new AbstractListModel() { String[] values = lValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
		}
	}

	// Register a student to a course
	@Override
	public boolean Register(String name, int section, String id, String fName, String lName) {
		for(int i = 0; i < Main.data.GetCourses().size(); ++i) {
			if((Main.data.GetCourses().get(i).getSection() == section) && Main.data.GetCourses().get(i).getId().equals(id)) {
				Main.data.GetCourses().get(i).addStudent(this);
				rCourses.add(Main.data.GetCourses().get(i));
				return true;
			}
		}
		
		return false;
	}

	// Drop a student from a course
	@Override
	public boolean Drop(String name, int section, String id, String fName, String lName) {
		for(int i = 0; i < Main.data.GetCourses().size(); ++i) {
			if((Main.data.GetCourses().get(i).getSection() == section) && Main.data.GetCourses().get(i).getId().equals(id)) {
				Main.data.GetCourses().get(i).dropStudent(this);
				((Student) Main.activeUser).rCourses.remove(Main.data.GetCourses().get(i));
				return true;
			}
		}
		return false;
	}
	
	// Sets the lists passed into it to contain the values from signed in students courses
	// TODO: change from Main.activeUser to this
	@SuppressWarnings({ "rawtypes", "serial", "unchecked" })
	public void ViewMine_GUI(ArrayList<JList<String>> ListsM) {
		if(Main.data.GetCourses().size() > 0) {
			ArrayList<String> nValues  = new ArrayList<String>();
			ArrayList<String> iValues  = new ArrayList<String>();
			ArrayList<String> sValues  = new ArrayList<String>();
			ArrayList<String> nuValues = new ArrayList<String>();
			ArrayList<String> mValues  = new ArrayList<String>();
			ArrayList<String> isValues = new ArrayList<String>();
			ArrayList<String> lValues  = new ArrayList<String>();
			for(int i = 0; i < ((Student)Main.activeUser).rCourses.size(); ++i) {
				nValues.add(((Student)Main.activeUser).rCourses.get(i).getName());
				iValues.add(((Student)Main.activeUser).rCourses.get(i).getId());
				sValues.add(""+((Student)Main.activeUser).rCourses.get(i).getSection());
				nuValues.add(""+((Student)Main.activeUser).rCourses.get(i).getNumStudents());
				mValues.add(""+((Student)Main.activeUser).rCourses.get(i).getMaxStudents());
				isValues.add(((Student)Main.activeUser).rCourses.get(i).getInstructor());
				lValues.add(((Student)Main.activeUser).rCourses.get(i).getLocation());
			}
			ListsM.get(0).setModel(new AbstractListModel() { String[] values = nValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsM.get(1).setModel(new AbstractListModel() { String[] values = iValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsM.get(2).setModel(new AbstractListModel() { String[] values = sValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsM.get(3).setModel(new AbstractListModel() { String[] values = nuValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsM.get(4).setModel(new AbstractListModel() { String[] values = mValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsM.get(5).setModel(new AbstractListModel() { String[] values = isValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
			ListsM.get(6).setModel(new AbstractListModel() { String[] values = lValues.toArray(new String[0]); public int getSize() { return values.length; } public Object getElementAt(int index) { return values[index]; } });
		}
	}

	public ArrayList<Course> getCourses() {
		return rCourses;
	}

}
