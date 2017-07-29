package entities;
import java.util.Date;

public class Person {
	private String name;
	private String houseName;
	private String school;
	private Date birthday;
	private BloodStatus bloodStatus;
	private String job;
	
	public String getName() {
		return name;
	}
	public void setName(String _name) {
		name = _name;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String _houseName) {
		houseName = _houseName;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String _school) {
		school = _school;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date _birthday) {
		birthday = _birthday;
	}
	public BloodStatus getBloodStatus() {
		return bloodStatus;
	}
	public void setBloodStatus(BloodStatus _bloodStatus) {
		bloodStatus = _bloodStatus;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String _job) {
		job = _job;
	}
	
	public Person(){
		name = "";
		houseName = "";
		school = "";
		birthday = new Date();
		bloodStatus = BloodStatus.PUREBLOOD;
		job = "Unemployed"; // :|
	}
	
	public Person(String _name, String _houseName, String _school, Date _birthday, BloodStatus _bs) {
		name = _name;
		houseName = _houseName;
		school = _school;
		birthday = _birthday;
		bloodStatus = _bs;
	}
	
}
