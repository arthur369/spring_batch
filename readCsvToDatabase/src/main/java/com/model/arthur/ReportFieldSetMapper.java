package com.model.arthur;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class ReportFieldSetMapper implements FieldSetMapper{

	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		// TODO Auto-generated method stub
		Report report=new Report();
		report.setFirst(fieldSet.readString(0));
		report.setSecond(fieldSet.readString(1));
		report.setThird(fieldSet.readString(2));
		
		
		return report;
	}

}
