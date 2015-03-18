package sis.action;

import java.util.ArrayList;

import sis.db.DBhandler;
import sis.model.NewsModel;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddNews extends ActionSupport implements ModelDriven<NewsModel>{

	/**
	 * 
	 */
	NewsModel news=new NewsModel();
	private static final long serialVersionUID = 1L;
	ArrayList<NewsModel> addNewsList = new ArrayList<NewsModel>();

	public String execute() throws Exception {
		System.out.println("action clas" );
		DBhandler dbh = new DBhandler();

		addNewsList.add(news);
		System.out.println(addNewsList.get(0).getNewsDescription());
		System.out.println("second action" );

		try {

			dbh.insertNews(addNewsList);
			System.out.println("hello3");
			return "success";

		} catch (Exception e) {
			// TODO: handle exception
			return "failure";
		}
	}

	@Override
	public NewsModel getModel() {
		// TODO Auto-generated method stub
		return news;
	}
}
