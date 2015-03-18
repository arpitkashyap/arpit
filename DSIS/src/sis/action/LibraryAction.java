package sis.action;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sis.db.DBhandler;
import sis.model.LibraryModel;
import sis.model.StudentModel;

public class LibraryAction implements SessionAware{
	
	private Map session;
	public StudentModel student=new StudentModel();
	private static final long serialVersionUID = 1L;

	public ArrayList<LibraryModel> book_name=new ArrayList<LibraryModel>(); 
	public String execute() throws FileNotFoundException{
		System.out.println("in action class\n");
		String sid=(String)session.get("userid");
		System.out.println("sid2"+sid);
	
		student.setSid(sid);
		
		DBhandler retrive = new DBhandler();
		book_name=retrive.searchBook(sid);
		System.out.println("arraay size db\n"+book_name.size());
		
		
		
		return "library";
	}

	public ArrayList<LibraryModel> getBook_name() {
		return book_name;
	}

	public void setBook_name(ArrayList<LibraryModel> book_name) {
		this.book_name = book_name;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	
}
