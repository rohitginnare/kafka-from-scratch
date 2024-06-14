package com.example.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic-1")
    public void consume(String message) {
        System.out.println("Message consumed successfully");
    }
}
