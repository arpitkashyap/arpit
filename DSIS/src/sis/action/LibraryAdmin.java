package sis.action;

import com.opensymphony.xwork2.ModelDriven;

import sis.db.*;
import sis.model.LibraryModel;

public class LibraryAdmin implements ModelDriven<LibraryModel>
{

	 LibraryModel lm=new LibraryModel();
	 
	 public String execute() throws Exception
     { 
		 DBhandler.InsertLibrary(lm);
		 return("success");
     }

	@Override
	public LibraryModel getModel() {
		// TODO Auto-generated method stub
		return lm;
	}
}
