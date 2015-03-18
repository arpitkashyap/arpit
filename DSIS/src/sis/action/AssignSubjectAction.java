package sis.action;
import java.util.ArrayList;
import java.util.StringTokenizer;

import com.opensymphony.xwork2.ModelDriven;

import sis.db.*;
import sis.model.AssignSubjectModel;

public class AssignSubjectAction implements ModelDriven<AssignSubjectModel> {

	//AssignSubjectModel assignStudentSubject=new AssignSubjectModel();
	AssignSubjectModel assignSubject=new AssignSubjectModel();
	
	ArrayList<String> list=new  ArrayList<String>();
	ArrayList<String> list1=new  ArrayList<String>();

	 public ArrayList<String> getList1() {
		return list1;
	}


	public void setList1(ArrayList<String> list1) {
		this.list1 = list1;
	}


	public ArrayList<String> getList() {
			return list;
		}


		public void setList(ArrayList<String> list) {
			this.list = list;
		}
	
	DBhandler dbhandler;
		
	public String execute()
    {  
		String abc;
		abc=assignSubject.getFaculty_Id();
		String tok;
		StringTokenizer st= new StringTokenizer(abc);
		tok=st.nextToken("-");
		System.out.println("token:"+tok);
		System.out.println(tok+" get");
		
		
		
		 dbhandler = new DBhandler();
   	 int i=dbhandler.insertFacultySubject(getsubid(),tok);  
   	 if(i>0)
   	 {  
   		 return "success";  
   	 }  
   	 return "failure";
    } 
	
	public String studentAssign()
    {  

		String abc=assignSubject.getS_Id();
		String tok1;
		StringTokenizer st1= new StringTokenizer(abc);
		tok1=st1.nextToken("-");
		System.out.println("token:"+tok1);
		System.out.println(tok1+" get");
		 
		 dbhandler = new DBhandler();
		 int j=dbhandler.checkNoOfsubject(tok1);
		if(j>0)
		{
		   	 int i=dbhandler.insertStudentSubject(getsubid(),tok1);  
		   	 if(i>0)
		   	 {  
		   		 return "success";  
		   	 }  
		   	 return "failure";  
		    
		 }
		else
		{
			return "fail";
		}
	}
	public String getsubid()
    {  

		String sub=assignSubject.getSubject_Id();
		String subj;
		StringTokenizer st1= new StringTokenizer(sub);
		subj=st1.nextToken("-");
		//System.out.println("token:"+tok1);
		//System.out.println(tok1+" get");
		 
		return subj;
    } 
	
	@Override
	public AssignSubjectModel getModel() {
		// TODO Auto-generated method stub
		return assignSubject;
	}

}
