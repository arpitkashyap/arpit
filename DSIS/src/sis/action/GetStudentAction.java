package sis.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import sis.db.*;
import sis.model.*;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GetStudentAction extends ActionSupport implements
		ModelDriven<StudentModel> {

	
	public StudentModel getStudentModel = new StudentModel();
	// public AssignSubjectModel assignSubjectModel=new AssignSubjectModel() ;
	private static final long serialVersionUID = 8472136069243128329L;
	ArrayList<StudentModel> list = new ArrayList<StudentModel>();

	
	


	public ArrayList<StudentModel> getList() {
		return list;
	}

	public void setList(ArrayList<StudentModel> list) {
		this.list = list;
	}

	DBhandler getStudentDetail;

	public String execute() {
		
		String abc;
		abc=getStudentModel.getSid();
		String tok;
		StringTokenizer st= new StringTokenizer(abc);
		tok=st.nextToken("-");
		System.out.println("token:"+tok);
		System.out.println(tok+" get");
	//System.out.println("SID" +getAbc());
		getStudentDetail = new DBhandler();

		int i = 0;
		getStudentDetail.getDetails(getStudentModel,tok);
		try {
			ArrayList<StudentModel> al = getStudentDetail.display(tok);
			String p = "image/" + al.get(i).getDestpath();

			getStudentModel.setDestpath(p);
			System.out.println(p);
			DBhandler getSubject = new DBhandler();
			list = getSubject.fetchStudentSubject(getStudentModel,tok);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return "ModifyStudent";

	}

	@Override
	public StudentModel getModel() {
		// TODO Auto-generated method stub
		return getStudentModel;
	}
}