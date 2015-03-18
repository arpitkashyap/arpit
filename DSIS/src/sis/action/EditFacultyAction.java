package sis.action;

import java.util.ArrayList;

import sis.db.*;
import sis.model.*;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EditFacultyAction extends ActionSupport implements ModelDriven<FacultyModel> {
	
		/**
	 * 
	 */
	public FacultyModel editFacultyModel=new FacultyModel() ;
	private static final long serialVersionUID = 8472136069243128329L;
	ArrayList<FacultyModel> Faculty_list = new ArrayList<FacultyModel>();
	    
		
	public ArrayList<FacultyModel> getFaculty_list() {
		return Faculty_list;
	}

	public void setFaculty_list(ArrayList<FacultyModel> faculty_list) {
		Faculty_list = faculty_list;
	}

			DBhandler getFacultyDetail; 
		         public String execute()
		         {  
		        	 getFacultyDetail = new DBhandler();
		        	 
		        	 getFacultyDetail.editFaculty(editFacultyModel);
		        	 
		        	 DBhandler getSubject = new DBhandler();
						Faculty_list = getSubject.fetchFacultySubject(editFacultyModel);
		        	   
		             return "EditFaculty";  
			    
			      
			}  

		@Override
		public FacultyModel getModel() {
			// TODO Auto-generated method stub
			return editFacultyModel;
		}
}