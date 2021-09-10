package com.example.springkafka.controller;

import com.example.springkafka.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/kafka")
public class KafkaController {

    @Autowired
    private Producer producer;

    @PostMapping(path = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam(name = "message") String message){
        producer.sendMessage(message);
    }




}
