package com.model.arthur;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ExamResultRowMapper implements RowMapper<Report>{

	public Report mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
	Report report=new Report();
	report.setFirst(rs.getString("FIRST"));
		report.setSecond(rs.getString("SECOND"));
		report.setThird(rs.getString("THIRD"));
		
		
		return report;
		
	}

	

}
