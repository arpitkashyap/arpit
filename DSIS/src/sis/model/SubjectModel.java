package sis.model;

public class SubjectModel {
	private String Subject_Id;
	private String Subject_Name;
	private String Syllabus;
	private String Credit;
	private String Specialization;
	private String Semester;


	public String getSubject_Id() {
		System.out.println(Subject_Id);
		return Subject_Id;

	}
	public void setSubject_Id(String subject_Id) {
		Subject_Id = subject_Id;
	}
	public String getSubject_Name() {
		return Subject_Name;
	}
	public void setSubject_Name(String subject_Name) {
		Subject_Name = subject_Name;
	}
	
	
	public String getSyllabus() {
		return Syllabus;
	}
	public void setSyllabus(String syllabus) {
		Syllabus = syllabus;
	}
	public String getCredit() {
		return Credit;
	}
	public void setCredit(String credit) {
		Credit = credit;
	}
	public String getSpecialization()
	{
		return Specialization;
	}
	public void setSpecialization(String specialization)
	{
		Specialization = specialization;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		Semester = semester;
	}

}
