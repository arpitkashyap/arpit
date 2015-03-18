package sis.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;

import sis.db.DBhandler;
import sis.model.StudentModel;


public class FetchStudentInfoAction implements SessionAware,ModelDriven<StudentModel> {
private Map session;
public StudentModel student=new StudentModel();
	

	public Map getSession() {
		return session;
	}

	public String execute()
	{
DBhandler db=new DBhandler();
	
		String sid=(String)session.get("userid");
		System.out.println("sid in fetch"+sid);
	
		student.setSid(sid);
		
		System.out.println("sid in ftech :"+student.getSid());
		
student=db.fetchInfo(student);


return "success";
		
	}
	@Override
	public void setSession(Map session) {
		this.session = session;
	}

	@Override
	public StudentModel getModel() {
		// TODO Auto-generated method stub
		return student;
	}




	
	
}