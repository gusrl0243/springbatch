package kr.or.ddit.batch.hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:kr/or/ddit/config/spring/context-batch.xml",    //src/main/resources
					   "classpath:kr/or/ddit/config/spring/context-hello-batch-test.xml"}) //src/test/resources 
public class HelloJobTest {

	@Autowired
	private JobLauncherTestUtils jobLauncher;
	
	@Test
	public void testHelloJob() throws Exception {
		
		
		JobExecution jobExecution = jobLauncher.launchJob();
		
		
		assertEquals(ExitStatus.COMPLETED, jobExecution.getExitStatus());
		
	}

}
