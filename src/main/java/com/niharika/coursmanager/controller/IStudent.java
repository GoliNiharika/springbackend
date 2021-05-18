package com.niharika.coursmanager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.niharika.coursmanager.p1.Student;

public interface IStudent {
	@CrossOrigin
	@GetMapping("/getStudent")
	List<Student> getStudentDetails();
	
	@CrossOrigin
	@PostMapping("/addStudent")
	Integer addStudentDetails(@RequestBody Student s);
	
	@CrossOrigin
	@DeleteMapping("/deleteStudent")
	Integer deleteStudentDetails(@RequestParam int roll);
	
	@CrossOrigin
	@PostMapping("/updateStudent")
	Integer updateStudentDetails(@RequestBody Student s);
	
	@CrossOrigin
	@PostMapping("/addMultipleStudents")
	Integer addMultipleStudentDetails(@RequestBody ArrayList<Student> s);
}
