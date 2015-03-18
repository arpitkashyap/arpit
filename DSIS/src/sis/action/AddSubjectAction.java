package sis.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


import java.util.ArrayList;
import java.util.Map;
import java.io.*;

import sis.db.*;
import sis.model.SubjectModel;

//public class AddSubjectAction  extends ActionSupport implements ModelDriven<SubjectModel> {
public class AddSubjectAction 
{

	private String Subject_Id;
	private String Subject_Name;
	private String Syllabus;
	private String Credit;
	private String Specialization;
	private String Semester;

	private static final long serialVersionUID = 1L;

	ArrayList<SubjectModel> modl = new ArrayList<SubjectModel>();

	public ArrayList<SubjectModel> addSubjectModel = new  ArrayList<SubjectModel>() ;



	//private Map<String, Object> session;
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


	@SuppressWarnings("unchecked")
	public String execute() throws Exception
	{		System.out.println("pre driver loaded sucess");

	SubjectModel model = new SubjectModel();
	DBhandler db = new DBhandler();

	model.setSubject_Name(Subject_Name);
	model.setSubject_Id(Subject_Id);
	model.setSyllabus(Syllabus);
	model.setSemester(Semester);
	model.setSpecialization(Specialization);
	model.setCredit(Credit);
    addSubjectModel.add(model);

	System.out.println("ID :" + Subject_Id + "Name " + Subject_Name);
	db.addSubject(addSubjectModel);
	return("Success");
	}

	//@Override
	//public SubjectModel getModel() {
	//return modl;
	//}

	public void setModel(ArrayList<SubjectModel> modl) {
		this.modl = modl;

	}
	}


