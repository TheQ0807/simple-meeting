package com.sample.meeting.mappers;

import com.sample.meeting.vo.MeetingEmployee;

public interface MeetingEmployeeMapper {

	void addME(MeetingEmployee meetingEmployee);
	MeetingEmployee getAllME(int no);
}
