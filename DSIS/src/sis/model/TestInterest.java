package sis.model;


public class TestInterest {

	public	String fname;
	public String sid;
	private String lname;
	private String destpath;
	private String Semester;
	private String Interest;
	
	public String getInterest() {
		return Interest;
	}
	public void setInterest(String interest) {
		Interest = interest;
	}
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
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDestpath() {
		return destpath;
	}
	public void setDestpath(String destpath) {
		this.destpath = destpath;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		Semester = semester;
	}

}
