package sis.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ModelDriven;

import sis.db.DBhandler;
import sis.model.AnnouncementModel;

public class AddAnnouncement implements ModelDriven<AnnouncementModel> 
{
	AnnouncementModel announcement = new AnnouncementModel();
	ArrayList<AnnouncementModel> addAnnouncementList = new ArrayList<AnnouncementModel>();

	public String execute() throws Exception {
		System.out.println("action");
		DBhandler dbh = new DBhandler();

		addAnnouncementList.add(announcement);
		System.out.println("des in java"+addAnnouncementList.get(0)
				.getAnnouncementDescription());
		System.out.println("second action");

		try {

			dbh.insertAnnouncement(addAnnouncementList);
			System.out.println("hello3");
			return "success";

		} catch (Exception e) {
			// TODO: handle exception
			return "failure";
		}
	}

	@Override
	public AnnouncementModel getModel() {
		// TODO Auto-generated method stub
		return announcement;
	}

}