package com.niharika.coursmanager.controller.Imp;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.niharika.coursmanager.Service.IStudentService;
import com.niharika.coursmanager.controller.IStudent;

@RestController
public class Student implements IStudent{

	@Autowired
	private IStudentService studentService;
	@Override
	public List<com.niharika.coursmanager.p1.Student> getStudentDetails() {
		// TODO Auto-generated method stub
		
		return studentService.getStudentDetails();
	}
	@Override
	public Integer addStudentDetails(com.niharika.coursmanager.p1.Student s) {
		// TODO Auto-generated method stub
		return studentService.addStudentDetails(s);
	}
	@Override
	public Integer deleteStudentDetails(int roll) {
		// TODO Auto-generated method stub
		return studentService.deleteStudentDetails(roll);
	}
	@Override
	public Integer updateStudentDetails(com.niharika.coursmanager.p1.Student s) {
		// TODO Auto-generated method stub
		return studentService.updateStudentDetails(s);
	}
	@Override
	public Integer addMultipleStudentDetails(ArrayList<com.niharika.coursmanager.p1.Student> s) {
		// TODO Auto-generated method stub
		return studentService.addMultipleStudentDetails(s);
	}
	

}
