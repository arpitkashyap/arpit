package sis.action;

import sis.db.*;
import sis.model.*;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DeleteStudentAction extends ActionSupport implements ModelDriven<StudentModel> {
	
		/**
	 * 
	 */
	public StudentModel deleteStudentModel=new StudentModel() ;
	private static final long serialVersionUID = 8472136069243128329L;

	    
		
		       DBhandler deleteStudent; 
		         public String execute()
		         {  
		        	 deleteStudent = new DBhandler();
		        	 
		        	 deleteStudent.deleteDetails(deleteStudentModel);  
		        	   
		             return "Success";  
			    
			      
			}  

		@Override
		public StudentModel getModel() {
			// TODO Auto-generated method stub
			return deleteStudentModel;
		}
}