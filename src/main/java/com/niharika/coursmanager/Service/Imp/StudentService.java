package com.niharika.coursmanager.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niharika.coursmanager.Dao.IStudentDao;
import com.niharika.coursmanager.Service.IStudentService;
import com.niharika.coursmanager.p1.Student;

@Service
public class StudentService implements IStudentService{
	
	@Autowired
	private IStudentDao studentDao;
	
	@Override
	public List<Student> getStudentDetails() {
		// TODO Auto-generated method stub
		try{
			return studentDao.getStudentDetails();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer addStudentDetails(Student s) {
		// TODO Auto-generated method stub
		try{
			return studentDao.addStudentDetails(s);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer deleteStudentDetails(int roll) {
		// TODO Auto-generated method stub
		try{
			return studentDao.deleteStudentDetails(roll);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer updateStudentDetails(Student s) {
		// TODO Auto-generated method stub
		try{
			return studentDao.updateStudentDetails(s);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
