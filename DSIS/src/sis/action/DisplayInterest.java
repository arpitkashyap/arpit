package sis.action;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sis.db.DBhandler;
import sis.model.InterestModel;
public class DisplayInterest extends ActionSupport implements
		ModelDriven<InterestModel> {

	private static final long serialVersionUID = 1L;

	public ArrayList<InterestModel> arr_interest = new ArrayList<InterestModel>();
	
	public String execute() throws FileNotFoundException {
		System.out.println("in action class\n");
		try {
			DBhandler retrive = new DBhandler();
			arr_interest = retrive.searchInterest();
			System.out.println("arraay size db\n" + arr_interest.size());
			return "success";

		} catch (Exception e) {
			// TODO: handle exception
			return "failure";
		}
	}
	public String abc() throws FileNotFoundException {
		System.out.println("from abc");
		try {
			DBhandler retrive = new DBhandler();
			arr_interest = retrive.searchInterest();
			System.out.println("arraay size db\n" + arr_interest.size());
			return "success";

		} catch (Exception e) {
			// TODO: handle exception
			return "failure";
		}
	}
	public String test() throws FileNotFoundException {
		System.out.println("from abc");
		try {
			DBhandler retrive = new DBhandler();
			arr_interest = retrive.searchInterest();
			System.out.println("arraay size db\n" + arr_interest.size());
			return "success";

		} catch (Exception e) {
			// TODO: handle exception
			return "failure";
		}
	}

	@Override
	public InterestModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}