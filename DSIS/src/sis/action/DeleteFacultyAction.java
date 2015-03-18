package sis.action;

import sis.db.*;
import sis.model.*;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class DeleteFacultyAction extends ActionSupport implements ModelDriven<FacultyModel> {
	
		/**
	 * 
	 */
	public FacultyModel editFacultyModel=new FacultyModel() ;
	private static final long serialVersionUID = 8472136069243128329L;

	    
		
		       DBhandler deleteFacultyDetail; 
		         public String execute()
		         {  
		        	 deleteFacultyDetail = new DBhandler();
		        	 
		        	 deleteFacultyDetail.deleteFaculty(editFacultyModel);   
		             return "Success";  
			    
			      
			}  

		@Override
		public FacultyModel getModel() {
			// TODO Auto-generated method stub
			return editFacultyModel;
		}
}