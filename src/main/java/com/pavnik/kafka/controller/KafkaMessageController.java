package com.pavnik.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pavnik.kafka.svc.MessageProducer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaMessageController 
{

	@Autowired
	private MessageProducer messageProducer;
	
	@PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.messageProducer.sendMessage(message);
    }

}
