package kr.or.ddit.batch.hello;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class HelloReader implements ItemReader<String>{

	private Logger logger = LoggerFactory.getLogger(HelloWriter.class);
	
	private List<String> rangers;
	private int index = 0;
	
	public HelloReader(){
		rangers = new ArrayList<String>();
		rangers.add("brown");
		rangers.add("cony");
		rangers.add("sally");
		rangers.add("james");
		rangers.add("moon");
	}
	
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		//size : 5 [0-4]
		if(index < rangers.size()){
			String ranger = rangers.get(index);
			index++;
			
			logger.debug("read : {}", ranger);
			
			return ranger;
		}else{
			return null;	//spring batch���� �� �̻� ���� �����Ͱ� ���ٰ� �˸�
			
		}
		
	}

}