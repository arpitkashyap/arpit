package sis.model;

import java.sql.Timestamp;

public class NewsModel {
	private int id;
	private String newsDescription;
	private String newsHeading;
	private Timestamp timestamp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNewsDescription() {
		return newsDescription;
	}
	public void setNewsDescription(String newsDescription) {
		this.newsDescription = newsDescription;
	}
	public String getNewsHeading() {
		return newsHeading;
	}
	public void setNewsHeading(String newsHeading) {
		this.newsHeading = newsHeading;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
}
