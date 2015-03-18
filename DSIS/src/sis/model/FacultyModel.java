package sis.model;

public class FacultyModel {

	private String Faculty_Id;
	private String Faculty_Name;
	private String Email;
	private String Password;
	private String Subject_Name;
	
	
	public String getFaculty_Id() {
		System.out.println(Faculty_Id);
		return Faculty_Id;
		
	}
	public void setFaculty_Id(String faculty_Id) {
		Faculty_Id = faculty_Id;
	}
	public String getFaculty_Name() {
		return Faculty_Name;
	}
	public void setFaculty_Name(String faculty_Name) {
		Faculty_Name = faculty_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getSubject_Name() {
		return Subject_Name;
	}
	public void setSubject_Name(String subject_Name) {
		Subject_Name = subject_Name;
	}
}
