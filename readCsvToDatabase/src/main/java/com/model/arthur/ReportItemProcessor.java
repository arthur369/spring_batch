package com.model.arthur;
import org.springframework.batch.item.ItemProcessor;
public class ReportItemProcessor implements ItemProcessor{

	public Report process(Object report) throws Exception {
		// TODO Auto-generated method stub
		
		Report myReport=(Report)report;
		
		System.out.println("處理到"+myReport);
		
		
		return myReport;
	}

	
	
	
	
}
