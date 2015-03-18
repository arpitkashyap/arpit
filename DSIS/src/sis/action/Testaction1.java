package sis.action;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import sis.db.DBhandler;
import sis.model.InterestModel;
import sis.model.TestInterest;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Testaction1 extends ActionSupport implements
ModelDriven<TestInterest>{
	private static final long serialVersionUID = 1L;
	
	
public ArrayList<TestInterest> arr_test = new ArrayList<TestInterest>();
TestInterest in = new TestInterest();
	public String execute() throws FileNotFoundException {
		System.out.println("in test action class\n and interest");
		try {
			
			arr_test.add(in);
			System.out.println("interest="+in.getInterest());


				DBhandler retrive = new DBhandler();
			arr_test = retrive.searchTestInterest(in.getInterest());
			System.out.println("after serchtest");
			return "success";

		} catch (Exception e) {
			// TODO: handle exception
			return "failure";
		}
	}

	
	
	
	@Override
	public TestInterest getModel() {
		// TODO Auto-generated method stub
		return in;
	}

}
