package sis.model;


import java.sql.Date;
import java.util.ArrayList;
public class StudentModel {

public	String fname;
public String sid;
public String address;
private String lname;
private int phno;
private String email;
private Date dob;
private String Password;
private String destpath;
private String Subject_Name;
private String Semester;



private ArrayList<String> interestAll;

private ArrayList<String> intereststudent;


private String stuinterest;



/*
public StudentModel(){
	interestAll = new ArrayList<String>();
	interestAll.add("coding");
	interestAll.add("sports");
	interestAll.add("dance");
	interestAll.add("music");
	interestAll.add("OTHER");

}
*/


public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getDestpath() {
	return destpath;
}
public void setDestpath(String destpath) {
	this.destpath = destpath;
}
public String getSubject_Name() {
	return Subject_Name;
}
public void setSubject_Name(String subject_Name) {
	Subject_Name = subject_Name;
}
public String getSemester() {
	return Semester;
}
public void setSemester(String semester) {
	Semester = semester;
}


public String getStuinterest() {
	return stuinterest;
}

public void setStuinterest(String stuinterest) {
	this.stuinterest = stuinterest;
}



public ArrayList<String> getInterestAll() {
	return interestAll;
}



public void setInterestAll(ArrayList<String> interestAll) {
	this.interestAll = interestAll;
}



public ArrayList<String> getIntereststudent() {
	return intereststudent;
}



public void setIntereststudent(ArrayList<String> intereststudent) {
	this.intereststudent = intereststudent;
}




}