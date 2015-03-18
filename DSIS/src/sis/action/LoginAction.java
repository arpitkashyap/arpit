package sis.action;

import java.io.FileNotFoundException;

import sis.db.DBhandler;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;

import sis.model.*;
public class LoginAction implements SessionAware ,ModelDriven<UserModel>{
	
	public ArrayList<NewsModel> news=new ArrayList<NewsModel>(); 
	public ArrayList<AnnouncementModel> ann=new ArrayList<AnnouncementModel>();
	
	
	public UserModel userModel=new UserModel();
public String execute() throws FileNotFoundException{
	
	
	//	String sid=(String)userModel.getSession().get("userid");
		
		//System.out.println("sid in login"+sid);
		DBhandler validate = new DBhandler();
		validate.checkdb(userModel);
		String str1="student";
		String str2="admin";
		System.out.println(userModel.getDestpath());
		String p="image/"+userModel.getDestpath();
		userModel.setDestpath(p);
		System.out.println("tweta/t" +userModel.getRole());
		System.out.println(userModel.getRole().equals(str1));
		
		

			DBhandler retrive = new DBhandler();
			DBhandler retrive2 = new DBhandler();
		
			
			//String sid=(String)session.get("userid");
			
			
	
		if(userModel.getRole().equals(str1)){
			news=retrive.searchNews();
			ann=retrive2.searchAnnouncement(userModel);
			return "student";
		}
		else if(userModel.getRole().equals(str2))
			return "admin";
		else
		return "failure";
}

@Override
public UserModel getModel() {
	
	return userModel;
}
@Override
public void setSession(Map session) {
	this.userModel.session=session;
	
}
}