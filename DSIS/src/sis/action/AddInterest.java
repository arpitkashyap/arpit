package sis.action;

import java.util.ArrayList;

import sis.db.DBhandler;
import sis.model.InterestModel;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddInterest extends ActionSupport implements
		ModelDriven<InterestModel> {
	InterestModel in = new InterestModel();
	private static final long serialVersionUID = 1L;
	ArrayList<InterestModel> addInterestList = new ArrayList<InterestModel>();

	public String execute() throws Exception {
		System.out.println("action clas");
		DBhandler dbh = new DBhandler();

		addInterestList.add(in);
		System.out.println("interest from ineterest"+in.getInterest());
		try {

			dbh.insertInterest(addInterestList);
			return "success";

		} catch (Exception e) {
			// TODO: handle exception
			return "failure";
		}
	}

	@Override
	public InterestModel getModel() {
		// TODO Auto-generated method stub
		return in;
	}
}