package com.example.kafkaservice;

import com.example.model.Icore;
import com.example.model.Npci;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    public void sendIcoreMessage(String topic, Icore icore) {
        try {
            String message = objectMapper.writeValueAsString(icore);
            kafkaTemplate.send(topic, message);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public void sendNpciMessage(String topic, Npci npci) {
        try {
            String message = objectMapper.writeValueAsString(npci);
            kafkaTemplate.send(topic, message);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
