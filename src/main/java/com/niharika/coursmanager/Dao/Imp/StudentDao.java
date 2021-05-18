package com.niharika.coursmanager.Dao.Imp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.niharika.coursmanager.Dao.IStudentDao;
import com.niharika.coursmanager.p1.Student;

@Repository
public class StudentDao implements IStudentDao{

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Value("${addStudentDetails}")
	private String addStudent;
	
	@Value("${getStudentDetails}")
	private String studentQuery;
	
	@Value("${deleteStudentDetails}")
	private String deleteStudent;
	
	@Value("${updateStudentDetails}")
	private String updateStudent;
	
	@Override
	public List<Student> getStudentDetails() {
		// TODO Auto-generated method stub
		List<Student> li = new ArrayList<Student>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("me", "meee");
		List<Map<String, Object>> li2 = namedParameterJdbcTemplate.queryForList(studentQuery, map);
		System.out.println(li2);
		for(Map<String, Object> row : li2) {
			Student st = new Student();
			
			st.setRoll((int) row.get("ROLL"));
			st.setName((String) row.get("NAME"));
			st.setEmail((String) row.get("EMAIL"));
			st.setPassword((String) row.get("PASSWORD"));
			li.add(st);
			}
		return li;
	}

	@Override
	public Integer addStudentDetails(Student s) {
		// TODO Auto-generated method stub
		SqlParameterSource sqlPara = new MapSqlParameterSource();
		((MapSqlParameterSource) sqlPara).addValue("roll", s.getRoll());
		((MapSqlParameterSource) sqlPara).addValue("name", s.getName());
		((MapSqlParameterSource) sqlPara).addValue("email", s.getEmail());
		((MapSqlParameterSource) sqlPara).addValue("password", s.getPassword());
		return namedParameterJdbcTemplate.update(addStudent, sqlPara);
	}
	
	

	@Override
	public Integer deleteStudentDetails(int roll) {
		// TODO Auto-generated method stub
		
		SqlParameterSource sqlPara = new MapSqlParameterSource();
		((MapSqlParameterSource) sqlPara).addValue("roll", roll);
		
		return namedParameterJdbcTemplate.update(deleteStudent, sqlPara);
	}

	@Override
	public Integer updateStudentDetails(Student s) {
		// TODO Auto-generated method stub
		SqlParameterSource sqlPara = new MapSqlParameterSource();
		((MapSqlParameterSource) sqlPara).addValue("roll", s.getRoll());
		((MapSqlParameterSource) sqlPara).addValue("name", s.getName());
		((MapSqlParameterSource) sqlPara).addValue("email", s.getEmail());
		((MapSqlParameterSource) sqlPara).addValue("password", s.getPassword());
		return namedParameterJdbcTemplate.update(updateStudent, sqlPara);
	}

	@Override
	public Integer addMultipleStudentDetails(ArrayList<Student> s) {
		// TODO Auto-generated method stub

		for (Student st : s) {
			SqlParameterSource sqlPara = new MapSqlParameterSource();
			((MapSqlParameterSource) sqlPara).addValue("roll", st.getRoll());
			((MapSqlParameterSource) sqlPara).addValue("name", st.getName());
			((MapSqlParameterSource) sqlPara).addValue("email", st.getEmail());
			((MapSqlParameterSource) sqlPara).addValue("password", st.getPassword());
			System.out.println(st.getEmail());
			namedParameterJdbcTemplate.update(addStudent, sqlPara);
		}
		return 1;
	}

}
