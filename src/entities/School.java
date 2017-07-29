package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School {
	private String name;
	private int numStudents;
	private boolean housed;
	private ArrayList<String> houseNames;
	private Vector<String> studentNames;
	private Vector<String> professorNames;
	private ArrayList<String> courseNames;
	
	//default constructor
	public School() {
		name = "";
		numStudents = 0;
		housed = false;
	}
	
	//constructor with predefined fields value
	public School(String _name, boolean _housed, ArrayList<String> _houseNames,
			Vector<String> _studentNames, Vector<String> _professorNames, ArrayList<String> _courseNames) {
		name = _name;
		housed = _housed;
		houseNames = _houseNames;
		studentNames = _studentNames;
//		numStudents = _numStd;
		numStudents = studentNames.size();
		professorNames = _professorNames;
		courseNames = _courseNames;
	}
	
	//some simple setters
	
	public void setName(String _name) {
		name = _name;
	}
	
	public void setNumStudents(int _numStudents){
		numStudents = _numStudents;
	}
	
	public void setHoused(boolean _housed) {
		housed = _housed;
	}
	
	public void setHouseNames(ArrayList<String> _houseNames){
		houseNames = _houseNames;
	}
	
	public void setStudentNames(Vector<String> _studentNames) {
		studentNames = _studentNames;
	}

	public void setProfessorNames(Vector<String> _professorNames){
		professorNames = _professorNames;
	}
	
	public void setCourseNames(ArrayList<String> _courseNames){
		courseNames = _courseNames;
	}
	
	// some getters
	
	public String getName() { return name; }
	public int getNumStudents() { return numStudents; }
	public boolean getIsHoused() { return housed; }
	public ArrayList<String> getHouseNames() { return houseNames; }
	public Vector<String> getStudentNames() { return studentNames; }
	public Vector<String> getProfessorNames() { return professorNames; }
	public ArrayList<String> getCourseNames() { return courseNames; }
	
	public void addStudent(String name){
		studentNames.add(name);
		numStudents++;
	}
	
	public void addHouse(String name){
		houseNames.add(name);
	}
	
	public void addProfessor(String name){
		professorNames.add(name);
	}
	
	public void addCourse(String name){
		courseNames.add(name);
	}
	
	
	
}
