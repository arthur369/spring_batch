package com.model.arthur;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

import java.util.List;

import org.joda.time.DateTime;


public class ReportResultJobListener implements JobExecutionListener{

	private DateTime startTime;
	private DateTime stopTime;
	public void afterJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		startTime=new DateTime();
		System.out.println("開始時間: "+ startTime);
		
		
		
		
	}

	public void beforeJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		stopTime=new DateTime();
		System.out.println("結束時間: "+stopTime);
		System.out.println("總共費時: "+getTime(startTime,stopTime));
		if(arg0.getStatus()==BatchStatus.COMPLETED) {
			System.out.println("成功");
		}else if(arg0.getStatus()==BatchStatus.FAILED) {
			System.out.println("產生以下錯誤");
			List<Throwable> exceptionList=arg0.getAllFailureExceptions();
			for(Throwable th: exceptionList) {
				System.out.println("exception "+th.getLocalizedMessage());
			}
		}
		
	}
	
	
	private long getTime(DateTime startTime,DateTime stopTime) {
		return stopTime.getMillis()-startTime.getMillis();
	}
	

}
