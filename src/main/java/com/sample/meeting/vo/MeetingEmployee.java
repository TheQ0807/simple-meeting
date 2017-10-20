package com.sample.meeting.vo;

public class MeetingEmployee {

	private int no;
	private String attended;
	private Employee employee;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getAttended() {
		return attended;
	}
	public void setAttended(String attended) {
		this.attended = attended;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "MeetingEmployee [no=" + no + ", attended=" + attended + ", employee=" + employee + "]";
	}
	
	
}
