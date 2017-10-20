package com.sample.meeting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.meeting.mappers.EmployeeMapper;
import com.sample.meeting.mappers.MeetingEmployeeMapper;
import com.sample.meeting.mappers.MeetingMapper;
import com.sample.meeting.vo.Employee;
import com.sample.meeting.vo.Meeting;
import com.sample.meeting.vo.MeetingEmployee;

@Service
public class MeetingServiceImpl implements MeetingService{

	@Autowired
	private MeetingMapper meetingMapper;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private MeetingEmployeeMapper meetingEmployeeMapper;
	
	@Override
	public List<Meeting> getAllMeeting() {
		return meetingMapper.getAllMeeting();
	}
	
	
	@Override
	public List<Employee> getEmployeeBy50() {
		List<Employee> employees = employeeMapper.getEmployeeBy50();
		return employees;
	}
	
	@Override
	public int getSEQ() {
		return meetingMapper.getSEQ();
	}
	
	
	
	@Override
	public void addMeeting(Meeting meeting, List<Integer> empIds) {
		
		int seq = meetingMapper.getSEQ();
		
		meeting.setNo(seq);
		meetingMapper.addMeeting(meeting);
		
		for(int id :empIds ) {
			MeetingEmployee meetingEmployee = new MeetingEmployee();
			Employee employee = new Employee();
			employee.setId(id);
			meetingEmployee.setNo(seq);
			meetingEmployee.setEmployee(employee);
			
			meetingEmployeeMapper.addME(meetingEmployee);	
		}
	}
	
	@Override
	public MeetingEmployee getAllME(int no) {
		return meetingEmployeeMapper.getAllME(no);
	}
}
