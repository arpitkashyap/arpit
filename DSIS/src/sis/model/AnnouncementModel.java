package sis.model;

import java.sql.Timestamp;

public class AnnouncementModel {
	private int id;
	private String announcementDescription;
	private String announcementHeading;
	private Timestamp timestamp;
	private String interest;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnnouncementDescription() {
		return announcementDescription;
	}
	public void setAnnouncementDescription(String announcementDescription) {
		this.announcementDescription = announcementDescription;
	}
	public String getAnnouncementHeading() {
		return announcementHeading;
	}
	public void setAnnouncementHeading(String announcementHeading) {
		this.announcementHeading = announcementHeading;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	
}
