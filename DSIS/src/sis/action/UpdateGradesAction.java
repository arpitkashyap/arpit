package sis.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import sis.db.*;
import sis.model.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateGradesAction extends ActionSupport implements ModelDriven<User>, SessionAware
{
	private static final long serialVersionUID = 1L;
	User user=new User();

	private Map<String, Object> session;


	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	@SuppressWarnings("unchecked")
	public String execute() throws Exception
	{	
		ArrayList<String> al1 = new ArrayList<String>();
        al1 = (ArrayList<String>)session.get("subject");
		user.setSubject(al1);
		user.setS_id((String)session.get("sid"));
		System.out.println("exec sid"+user.getS_id());
		DBhandler.updateGrades(user);
		return("success");
	}
	
	public String search()throws Exception
	{
		System.out.println("in action search");
		DBhandler.searchSubject(user);
		session.put("subject",user.getSubject());
		System.out.println(user.getS_id());
		session.put("sid",user.getS_id());
	System.out.println("vfjugjb"+session.get("sid"));
		return("success");
	}

	
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
