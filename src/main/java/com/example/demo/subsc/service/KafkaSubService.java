package com.example.demo.subsc.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.subsc.constant.KafkaSubscConstant;
import com.example.demo.subsc.entiry.Customer;

@Service("customerService")
public class KafkaSubService {
	
	@KafkaListener(topics = KafkaSubscConstant.TOPIC, groupId = KafkaSubscConstant.GROUP_ID)
	public Customer listner(Object c) {
		System.out.println("Message received from kafka tafic::");
		return (Customer) c;
	}

}
