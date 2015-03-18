package sis.model;

import java.util.ArrayList;


public class GradeModel 
{
	private String semester;
	private int sel1;
	private String Subject_id;
	private String Subject_name;
	private String Grade;
	private String Result;
	ArrayList<String> sem;
	private String valid="true";
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	
	

	
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public ArrayList<String> getSem() {
		return sem;
	}
	public void setSem(ArrayList<String> sem) {
		this.sem = sem;
	}
	public String getSubject_id() {
		return Subject_id;
	}
	public void setSubject_id(String subject_id) {
		Subject_id = subject_id;
	}
	public String getSubject_name() {
		return Subject_name;
	}
	public void setSubject_name(String subject_name) {
		Subject_name = subject_name;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getResult() {
		return Result;
	}
	public void setResult(String result) {
		Result = result;
	}
	public int getSel1() {
		return sel1;
	}
	public void setSel1(int sel1) {
		this.sel1 = sel1;
	}
	

}