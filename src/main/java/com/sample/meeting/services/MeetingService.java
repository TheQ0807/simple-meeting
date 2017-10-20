package com.sample.meeting.services;

import java.util.List;

import com.sample.meeting.vo.Employee;
import com.sample.meeting.vo.Meeting;
import com.sample.meeting.vo.MeetingEmployee;
import com.sample.meeting.vo.MeetingForm;

public interface MeetingService {

	List<Meeting> getAllMeeting();
	List<Employee> getEmployeeBy50();
	int getSEQ();
	void addMeeting(Meeting meeting, List<Integer> empIds);
	MeetingEmployee getAllME(int no);
}
