package edu.asu.diging.contestantB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import edu.asu.diging.contestantB.domain.Manual;

@Service
public class Receiver {
	@Autowired 
	private Manual man;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	@KafkaListener(id = "contestantB", topics = "my_topic")
	public void receiveMessage(String message) {
		System.out.println("Received topic: " + message);
		man.setMax(man.getMax()-Integer.parseInt(message));
	}
}
