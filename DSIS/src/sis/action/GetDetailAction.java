package sis.action;
import java.sql.SQLException;
import java.util.ArrayList;

import sis.db.*;

import com.opensymphony.xwork2.ActionSupport;

public class GetDetailAction  extends ActionSupport  {

	private static final long serialVersionUID = 1L;
		//public GetDetailModel getdetailModel=new GetDetailModel() ;
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
				DBhandler getfacultyDetail; 				
					       
							public String execute()
					         {  
								getstudentDetail = new DBhandler();
								getfacultyDetail=new DBhandler();
								try {
								
								list= getstudentDetail.fetchallstudents();
								list1= getfacultyDetail.fetchallFaculty();
								}
						
					catch (ClassNotFoundException | SQLException e)
					{
						
						e.printStackTrace();
					}
			        	   
			             return "Success";  
				}		
	}