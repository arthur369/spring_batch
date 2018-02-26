package com.model.arthur;

import org.springframework.batch.item.ItemProcessor;

public class ReportItemProcessor implements ItemProcessor{

	

	

	public Object process(Object myReport) throws Exception {
		// TODO Auto-generated method stub
Report report=(Report)myReport;
		
		System.out.println("處理到"+report);
		
		return report;
	}

	
	
	
	
	
}
