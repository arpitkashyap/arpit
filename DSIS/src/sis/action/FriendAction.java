package sis.action;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import sis.db.DBhandler;
import sis.model.FriendModel;
import sis.model.StudentModel;

public class FriendAction extends ActionSupport implements  SessionAware,ModelDriven<FriendModel>{
	/**
	 * 
	 */
	FriendModel fm= new FriendModel();
	private static final long serialVersionUID = 1L;
	
	public ArrayList<FriendModel> fname=new  ArrayList<FriendModel>();
	public ArrayList<StudentModel> Sname=new  ArrayList<StudentModel>();

	//String sid=(String)session.get("userid");
	
	public String findfriend() throws FileNotFoundException{
		
		DBhandler db = new DBhandler();
		fname=db.retriveFriend();
		return "frnd";
	}
	
	public String FetchFrnd()throws FileNotFoundException{
		DBhandler db=new DBhandler();
		db.showFriendDetail(fm);
		return "fetched";
	}
	
	
	public String SearchFriend()throws FileNotFoundException{
		DBhandler db=new DBhandler();
		fname=db.retriveFriend();
		db.srchFrnd(fm);
		
		System.out.println("afrte geeta  work ;)"+fm.getSrch_frnd());
		return "searched";
	}
	
	public String Addfriend()throws FileNotFoundException{
		System.out.println("m in Addfriend");
		
		DBhandler db=new DBhandler();
		System.out.println("m after call");
		db.insertfrnd(fm);
		findfriend();
		System.out.println("m after insertfrnd method");
		return "addedfrnd";
	}
	public String Testfriend()throws FileNotFoundException{
		System.out.println("m in Addfriend");
		DBhandler db=new DBhandler();
		System.out.println("m after call");
		Sname=db.retriveTestFriend();
		System.out.println("m after insertfrnd method");
		return "addedfrnd";
	}
	 
	public String delectFriend() throws FileNotFoundException{
		DBhandler db=new DBhandler();
		System.out.println("m after call");
		db.deletFrnd(fm);
		findfriend();
		System.out.println("bahar"+fm.getDelFrnd());
		return "deleted";
	}
	@Override
	public FriendModel getModel() {
		// TODO Auto-generated method stub
		return fm;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

}