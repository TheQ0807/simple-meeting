package com.sample.meeting.vo;

import java.util.List;

public class MeetingForm {

	private String title;
	private String dates;
	private int room;
	private String description;
	private List<Integer> empIds;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Integer> getEmpIds() {
		return empIds;
	}
	public void setEmpIds(List<Integer> empIds) {
		this.empIds = empIds;
	}
	@Override
	public String toString() {
		return "MeetingForm [title=" + title + ", dates=" + dates + ", room=" + room + ", description=" + description
				+ ", empIds=" + empIds + "]";
	}
	
	
}
