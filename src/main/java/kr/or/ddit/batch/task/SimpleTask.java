package kr.or.ddit.batch.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;

import kr.or.ddit.batch.hello.HelloWriter;

public class SimpleTask {
	private Logger logger = LoggerFactory.getLogger(HelloWriter.class);

	@Scheduled(cron="*/3 * * * * *")
	public void simpleTask(){
		logger.debug("simpleTask");
	}
}
