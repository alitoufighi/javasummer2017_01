package entities;

import java.util.ArrayList;
import java.util.Vector;

public class School {
	private String name;
	private int numStudents;
	private Boolean housed;
	private ArrayList<String> houseNames;
	private Vector<String> studentNames;
	private Vector<String> professorNames;
	private ArrayList<String> courseNames;
	
	//default constructor
	public School() {
		name = "";
		numStudents = 0;
		housed = false;
		houseNames = new ArrayList<>();
		studentNames = new Vector<>();
		professorNames = new Vector<>();
		courseNames = new ArrayList<>();
	}
	
	//constructor with predefined fields value
	public School(String _name, ArrayList<String> _houseNames, ArrayList<String> _courseNames,
			Vector<String> _studentNames, Vector<String> _professorNames) {
		name = _name;
		housed = false; // Please read my note at the first of "SchoolTest.java" file
		houseNames = _houseNames;
		studentNames = _studentNames;
		numStudents = studentNames.size();
		professorNames = _professorNames;
		courseNames = _courseNames;
	}
	
	public School(String _name) {
		name = _name;
	}
	
	//some simple setters
	

	public void setName(String _name) {
		name = _name;
	}
	
	public void setNumStudents(int _numStudents){
		numStudents = _numStudents;
	}
	
	public void setHoused(Boolean _housed) {
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
	public Boolean getIsHoused() { return housed; }
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
