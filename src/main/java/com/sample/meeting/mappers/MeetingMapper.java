package com.sample.meeting.mappers;

import java.util.List;

import com.sample.meeting.vo.Meeting;

public interface MeetingMapper {

	List<Meeting> getAllMeeting();
	void addMeeting(Meeting meeting);
	int getSEQ();
}
