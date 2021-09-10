package com.example.springkafka.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;

@Service
public class Consumer {


    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message){
        System.out.println("Consumed: " + message);
    }
}
