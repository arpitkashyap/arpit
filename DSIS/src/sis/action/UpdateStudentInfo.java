package sis.action;

import java.util.Map;

import sis.db.DBhandler;
import sis.model.*;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;

public class UpdateStudentInfo implements SessionAware,ModelDriven<StudentModel>{

	private Map session;
	
	public StudentModel student=new StudentModel();;
	public Map getSession() {
		return session;
	}
	

	public String execute()
	{
	
DBhandler db=new DBhandler();

		String sid=(String)session.get("userid");
	System.out.println("m here sid2"+sid);
	
		student.setSid(sid);
	
		
		System.out.println("sid fname :"+student.getFname());

db.updateInfo(student);


		return "success";
		
	}
	@Override
	public StudentModel getModel() {
		// TODO Auto-generated method stub
		return student;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}
	

}
