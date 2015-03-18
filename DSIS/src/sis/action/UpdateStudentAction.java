package sis.action;

import java.util.StringTokenizer;

import sis.db.*;
import sis.model.*;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateStudentAction extends ActionSupport implements ModelDriven<StudentModel> {
	/**
	 * 
	 */
	public StudentModel updateStudentModel=new StudentModel() ;
	private static final long serialVersionUID = 8472136069243128329L;
			
		       DBhandler updateStudent;
		       
		       public void validate()
				{
		    	  // if(updateStudentModel.getPassword().length() < 4)  {
		    	    //    addFieldError("Password","Password can not be less than 4 character");
		    	   //} 
					if(updateStudentModel.getSid().isEmpty())  //(getUserId()))
					{
						addFieldError("EnrollId","Id is blank");
					}
				
					if(updateStudentModel.getFname().isEmpty())  //(getUserId()))
					{
							addFieldError("F_Name","Name is blank");
					}
					if(updateStudentModel.getPassword().isEmpty())  //(getUserId()))
					{
							addFieldError("Password","Password is blank");
					}
					
					
				}
		       
		         public String execute()
		         {  
		        	 
		        	 String abc;
			     		abc=updateStudentModel.getSid();
			     		String tok;
			     		StringTokenizer st= new StringTokenizer(abc);
			     		tok=st.nextToken("-");

		        	 updateStudent = new DBhandler();
		        	 
		        	 int i = updateStudent.updateDetails(updateStudentModel,tok);  
		        	 if(i>0){
		             return "Success";  
		        	 }
		        	 else {
		        		 return "failure";
		        	 }
			}  

		@Override
		public StudentModel getModel() {
			// TODO Auto-generated method stub
			return updateStudentModel;
		}

		

}
