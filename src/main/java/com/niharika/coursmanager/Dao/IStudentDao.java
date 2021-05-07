package com.niharika.coursmanager.Dao;
import com.niharika.coursmanager.p1.*;
import java.util.*;

public interface IStudentDao {

	public List<Student> getStudentDetails();
	public Integer addStudentDetails(Student s);
	public Integer deleteStudentDetails(int roll);
	public Integer updateStudentDetails(Student s);
}
