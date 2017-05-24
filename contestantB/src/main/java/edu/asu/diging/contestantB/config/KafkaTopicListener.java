package edu.asu.diging.contestantB.config;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


public class KafkaTopicListener {
	private org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
	@KafkaListener(id = "test.listener.id", topics = "my_topic")
	public void receiveMessage(String message) {
		logger.info("Received topic: " + message);
	}
	private KafkaTemplate<Integer, String> template;
	
	private Map<String, Object> senderProps() {
	    Map<String, Object> props = new HashMap<>();
	    props.put(ProducerConfig.CLIENT_ID_CONFIG, "test.app.producer");
	    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
	    props.put(ProducerConfig.RETRIES_CONFIG, 0);
	    props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
	    props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
	    props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
	    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
	    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
	    return props;
	}
	
	@PostConstruct
	private void init() {
	    Map<String, Object> senderProps = senderProps();
	    ProducerFactory<Integer, String> pf =
	              new DefaultKafkaProducerFactory<Integer, String>(senderProps);
	    template = new KafkaTemplate<>(pf);
	}
}
