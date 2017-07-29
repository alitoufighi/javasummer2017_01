package entities;

import java.util.Vector;

public class Course {
	private String name;
	private char minGrade;
	private String professorName;
	private int year;
	private Vector<String> studentNames;
	
	public Course(){
		setName("");
		setMinGrade('F');
		setProfessorName("");
		setYear(0);
		studentNames = new Vector<>();
	}
	
	public Course(String _name, char _minGrade, String _professorName, int _year, Vector<String> _studentNames){
		setName(_name);
		setMinGrade(_minGrade);
		setProfessorName(_professorName);
		setYear(_year);
		setStudentNames(_studentNames);
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		name = _name;
	}

	public Vector<String> getStudentNames() {
		return studentNames;
	}

	public void setStudentNames(Vector<String> _studentNames) {
		studentNames = _studentNames;
	}

	public char getMinGrade() {
		return minGrade;
	}

	public void setMinGrade(char _minGrade) {
		minGrade = _minGrade;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String _professorName) {
		professorName = _professorName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
