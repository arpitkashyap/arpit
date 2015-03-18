package sis.action;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import sis.db.DBhandler;
import sis.model.*;

import com.opensymphony.xwork2.ModelDriven;
public class SelectSubject implements ModelDriven<User>,SessionAware {
	public StudentModel student=new StudentModel();
	public User u=new User();
	private Map session;
	ArrayList<String> sub=new ArrayList<String>();
	ArrayList<String> sub1=new ArrayList<String>();
	 public ArrayList<String> getSub1() {
		return sub1;
	}
	public void setSub1(ArrayList<String> sub1) {
		this.sub1 = sub1;
	}

	private InputStream fileStream;
	 
	// private InputStream fileStream;
		public void setFileStream(InputStream arg) {
			fileStream = arg;
		}
		public InputStream getFileStream() {
			return fileStream;
		}

	public ArrayList<String> getSub() {
		return sub;
	}

	public void setSub(ArrayList<String> sub) {
		this.sub = sub;
	}

	public String execute() throws FileNotFoundException{
		//u= new User();
	//	u.getSemlist();
		String sid=(String)session.get("userid");
		System.out.println("sid in fetch"+sid);
	
		student.setSid(sid);
		System.out.println("Yeah entered in SelectSubject");
		System.out.println(u.getSemlist());
		DBhandler db=new DBhandler();
	sub=	db.getSubjects(u,sid);
	System.out.println(sub.get(0));
		return "success";
	}
	
	
	public String preview() throws Exception {
		try{
			String sid=(String)session.get("userid");
			System.out.println("sid in fetch"+sid);
		
			student.setSid(sid);
			//DBhandler db1=new DBhandler();
			//sub1=db1.getSubjects(u,sid);
			fileStream = new DataInputStream(
			  new FileInputStream("/home/arpit/workspace/DSIS/WebContent/ntwrkscn.pdf"));
		} catch (IOException ioEx) {
			ioEx.printStackTrace();
		}
		return "test-stream";
	}
	
	/*public List getmy(){
		return u.list;
	}*/

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return u;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}
	
}
