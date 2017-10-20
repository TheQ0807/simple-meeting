package com.sample.meeting.web;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.meeting.services.MeetingService;
import com.sample.meeting.vo.Employee;
import com.sample.meeting.vo.Meeting;
import com.sample.meeting.vo.MeetingEmployee;
import com.sample.meeting.vo.MeetingForm;

@Controller
public class MeetingController {

	@Autowired
	private MeetingService meetingService;
	
	@RequestMapping("/home.do")
	public String list(Model model) {
		
		List<Meeting> meetings = meetingService.getAllMeeting();
		model.addAttribute("meetings", meetings);
		return "/WEB-INF/views/list.jsp";
	}
	
	@RequestMapping("/form.do")
	public String form(Model model) {
		
		List<Employee> employees = meetingService.getEmployeeBy50();
		model.addAttribute("employees", employees);
		System.out.println(employees);
		return "/WEB-INF/views/form.jsp";
	}
	
	@RequestMapping("/add.do")
	public String addMeeting(MeetingForm meetingForm) {
		Meeting meeting = new Meeting();
		
		BeanUtils.copyProperties(meetingForm, meeting);
		
		List<Integer> empIds = meetingForm.getEmpIds();
		meetingService.addMeeting(meeting, empIds);
		
		return "redirect:/home.do";
	}
	
	public String getAllME(Model model) {
		
		
		return "/WEB-INF/views/detail.jsp";
	}
}
