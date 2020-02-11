/**
 * 
 */
package com.pavnik.kafka.svc;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author pavni
 *
 */
@Service
public class MessageConsumer 
{

	private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
	private static final String TOPIC = "pavnik-message";
    
	@KafkaListener(topics = TOPIC, groupId = "pavnik_groupid")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> MessageConsumer message -> %s", message));
    }
}
