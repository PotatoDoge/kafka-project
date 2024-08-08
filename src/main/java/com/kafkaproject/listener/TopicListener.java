package com.kafkaproject.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TopicListener {

    @KafkaListener(topics = "firstTopic", groupId = "testGroupId")
    void listener(String data){
        System.out.println("Data received in listener: " + data);
    }

}
