package com.sample.meeting.vo;

public class Meeting {

	private int no;
	private String title;
	private int room;
	private String dates;
	private String description;
	private String canceled;
	private String completed;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCanceled() {
		return canceled;
	}
	public void setCanceled(String canceled) {
		this.canceled = canceled;
	}
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "Meeting [no=" + no + ", title=" + title + ", room=" + room + ", dates=" + dates + ", description="
				+ description + ", canceled=" + canceled + ", completed=" + completed + "]";
	}
	
	
	
}
