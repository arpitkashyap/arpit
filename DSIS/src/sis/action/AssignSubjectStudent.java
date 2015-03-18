package sis.action;
import java.sql.SQLException;
import java.util.ArrayList;

import sis.db.DBhandler;

import com.opensymphony.xwork2.ActionSupport;

public class AssignSubjectStudent extends ActionSupport{

	
		private static final long serialVersionUID = 1L;
		
		ArrayList<String> list=new  ArrayList<String>();
		ArrayList<String> list1=new  ArrayList<String>();
		
		public ArrayList<String> getList1() {
			return list1;
		}


		public void setList1(ArrayList<String> list1) {
			this.list1 = list1;
		}


		public ArrayList<String> getList() {
			return list;
		}


		public void setList(ArrayList<String> list) {
			this.list = list;
		}

			DBhandler getstudentDetail; 
			DBhandler getsubjectdetail; 				
				       
						public String execute()
				         {  
							getstudentDetail = new DBhandler();
							getsubjectdetail=new DBhandler();
							try {
							
							list= getstudentDetail.fetchallstudents();
							list1=getsubjectdetail.fetchallsubject();
							}
					
				catch (ClassNotFoundException | SQLException e)
				{
					
					e.printStackTrace();
				}
		        	   
		             return "Success";  
			}		

	}