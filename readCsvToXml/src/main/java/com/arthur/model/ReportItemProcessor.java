package com.arthur.model;

import org.springframework.batch.item.ItemProcessor;

import com.arthur.model.Report;

public class ReportItemProcessor implements ItemProcessor {

	public Report process(Object item) throws Exception {
		// TODO Auto-generated method stub
		Report myItem=(Report) item;
		System.out.println("執行中..." + myItem);
		  return myItem;
	}

 
 


}
