package com.niharika.coursmanager.Service;

import java.util.ArrayList;
import java.util.List;

import com.niharika.coursmanager.p1.Student;

public interface IStudentService {
	List<Student> getStudentDetails();
	Integer addStudentDetails(Student s);
	Integer deleteStudentDetails(int roll);
	Integer updateStudentDetails(Student s);
	Integer addMultipleStudentDetails(ArrayList<Student> s);
}
