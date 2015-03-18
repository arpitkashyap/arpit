package sis.model;

import java.util.ArrayList;

public class User
{
	String Subject;
	String s_id;
	String sub_id;
	private int Semlist;
	private String valid;

	public String getValid() {
		
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	ArrayList<String> list=new ArrayList<String>(); 
	ArrayList<String> subject;	
	ArrayList<Integer> marks;
	
	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	
	public void setSubject(ArrayList<String> subject) {
		this.subject = subject;
	}
	public String getSub_id() {
		return sub_id;
	}
	public ArrayList<String> getSubject() {
		return subject;
	}
	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public int getSemlist() {
		return Semlist;
	}

	public void setSemlist(int semlist) {
		Semlist = semlist;
	}
}
