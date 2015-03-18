package sis.model;

import java.sql.Date;

public class LibraryModel
{
	private String S_ID;
	private String BOOK_ID;

	private String Book_name;
	private Date Issued_Date;
	private Date Return_Date;
	private int Fine;
	//System.out.println("in model class");

	
	public String getBook_name() {
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	
	public Date getIssued_Date() {
		return Issued_Date;
	}
	public void setIssued_Date(Date issued_Date) {
		Issued_Date = issued_Date;
	}
	public Date getReturn_Date() {
		return Return_Date;
	}
	public void setReturn_Date(Date return_Date) {
		Return_Date = return_Date;
	}
	public int getFine() {
		return Fine;
	}
	public void setFine(int fine) {
		Fine = fine;
	}
	public String getS_ID() {
		return S_ID;
	}
	public void setS_ID(String s_ID) {
		S_ID = s_ID;
	}
	public String getBOOK_ID() {
		return BOOK_ID;
	}
	public void setBOOK_ID(String bOOK_ID) {
		BOOK_ID = bOOK_ID;
	}

	
}
