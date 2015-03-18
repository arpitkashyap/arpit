package sis.action;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;


import sis.db.DBhandler;
import sis.model.NewsModel;

public class DisplayNewsAction extends ActionSupport {
	
	
	private static final long serialVersionUID = 1L;

	public ArrayList<NewsModel> new_name=new ArrayList<NewsModel>(); 
	public String execute() throws FileNotFoundException{
		System.out.println("in action class\n");
	
		DBhandler retrive = new DBhandler();
		new_name=retrive.searchNews();
		System.out.println("arraay size db\n"+new_name.size());
		
		
		
		return "news";
	}

	public ArrayList<NewsModel> getNews_name() {
		return new_name;
	}

	public void setBook_name(ArrayList<NewsModel> new_name) {
		this.new_name = new_name;
	}

	
}
