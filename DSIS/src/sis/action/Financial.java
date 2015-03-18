package sis.action;

import java.io.FileNotFoundException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;

import sis.model.FinancialModel;
import sis.model.StudentModel;
import sis.db.DBhandler;
import sis.model.*;
public class Financial implements ModelDriven<FinancialModel>,SessionAware{
public FinancialModel us= new FinancialModel(); 
public StudentModel student=new StudentModel();
UserModel user=new UserModel();
private Map session;


public Map getSession() {
	return session;
}

public String execute() throws FileNotFoundException{
		DBhandler op= new DBhandler();
		System.out.println("HELLO");
	String sid=(String)session.get("userid");
	//	System.out.println("sid in financial"+sid);
	
	student.setSid(sid);
		
		System.out.println("sid in financial:"+student.getSid());
		op.getFinancial(student,us);
		return "data";
	}


@Override
public FinancialModel getModel() {

	// TODO Auto-generated method stub
	return us;
}

@Override
public void setSession(Map<String, Object> session) {
	// TODO Auto-generated method stub
	this.session=session;
}

	
}