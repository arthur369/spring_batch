package SpringBatchHelloWorldExample.PracticSpringBatch;



import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	String [] StringConfig= {"config/practice_batch.xml"};
    	
		ApplicationContext context = new ClassPathXmlApplicationContext(StringConfig);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("practiceJob"); 
        try {
        	 JobExecution execution = jobLauncher.run(job, new JobParameters()); 
        	 System.out.println("Exit Status : " + execution.getStatus()); 
        	 
        	 
        	 
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
        System.out.println("Run Over");
        
        
        
    }
}