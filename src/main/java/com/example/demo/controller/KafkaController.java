package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.producer.KafkaProducerService;

@RestController
public class KafkaController {


    @Autowired
    private KafkaProducerService producerService;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Message sent successfully....";
    }
}
