package sis.action;

import java.io.FileNotFoundException;

import com.opensymphony.xwork2.ModelDriven;
import sis.model.FinancialInsertModel;
import sis.db.DBhandler;;

public class FinancialInsert implements ModelDriven<FinancialInsertModel>{
public FinancialInsertModel us= new FinancialInsertModel(); 


public String execute() throws FileNotFoundException{
	DBhandler op= new DBhandler();
		op.dbFinancialInsert(us);
		return "success";
	}


@Override
public FinancialInsertModel getModel() {

	// TODO Auto-generated method stub
	return us;
}

	
}