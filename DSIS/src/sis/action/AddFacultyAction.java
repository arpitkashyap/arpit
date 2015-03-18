package sis.action;
import com.opensymphony.xwork2.ModelDriven;

import sis.db.*;

import sis.model.AddFacultyModel;

public class AddFacultyAction implements ModelDriven<AddFacultyModel> {

	
	public AddFacultyModel addFacultyModel=new AddFacultyModel() ;
	DBhandler dbhandler;
	
	public String execute()
    {  
		dbhandler = new DBhandler();
   	 int i=DBhandler.Save(addFacultyModel);  
   	 if(i>0)
   	 {  
   		 return "success";  
   	 }  
   	 return "error";  
    } 
	
	@Override
	public AddFacultyModel getModel() {
		// TODO Auto-generated method stub
		return addFacultyModel;
	}

}
