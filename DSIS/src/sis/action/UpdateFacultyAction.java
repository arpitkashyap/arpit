package sis.action;

import sis.db.*;
import sis.model.*;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateFacultyAction extends ActionSupport implements ModelDriven<FacultyModel> {
	
		/**
	 * 
	 */
	public FacultyModel updateFacultyModel=new FacultyModel() ;
	private static final long serialVersionUID = 8472136069243128329L;

	    
		
		       DBhandler updateFacultyDetail; 
		       
		       
		       public void validate()
				{
				  
					if(updateFacultyModel.getFaculty_Id().isEmpty())  //(getUserId()))
					{
						addFieldError("Faculty_Id","Id is blank");
					}
					if(updateFacultyModel.getFaculty_Name().isEmpty())  //(getUserId()))
					{
							addFieldError("Faculty_Name","Faculty Name is blank");
					}
					if(updateFacultyModel.getEmail().isEmpty())  //(getUserId()))
					{
							addFieldError("Email","Email is blank");
					}			
					
				}
		         public String execute()
		         {  
		        	 updateFacultyDetail = new DBhandler();
		        	 
		        	 updateFacultyDetail.updateFaculty(updateFacultyModel);  
		        	   
		             return "Success";  
			    
			      
			}  

		@Override
		public FacultyModel getModel() {
			// TODO Auto-generated method stub
			return updateFacultyModel;
		}
}