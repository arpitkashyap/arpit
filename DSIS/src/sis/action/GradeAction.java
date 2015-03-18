package sis.action;
import sis.db.*;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.io.FileNotFoundException;
import java.util.*;

import org.apache.struts2.interceptor.SessionAware;



import sis.model.*;

public class GradeAction extends ActionSupport implements  SessionAware,ModelDriven<GradeModel>{
	
	

	public ArrayList<GradeModel> getName() {
		return name;
	}

	public void setName(ArrayList<GradeModel> name) {
		this.name = name;
	}

	int uname;
	
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	public GradeModel gm=new GradeModel();
	public ArrayList<GradeModel> name=new ArrayList<GradeModel>(); 
	public StudentModel student=new StudentModel();
	public String execute() throws FileNotFoundException{

	DBhandler retrive = new DBhandler();
	String sid=(String)session.get("userid");
	System.out.println("sid2"+sid);

	student.setSid(sid);
	System.out.println("semestre\n"+gm.getSemester());

	name=retrive.getdetails(sid,gm.getSemester());
	
		return "grade";
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public GradeModel getModel() {
		// TODO Auto-generated method stub
		return gm;
	}


	
}