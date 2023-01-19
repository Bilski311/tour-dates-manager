package com.example.tourdatesmanager.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.utils.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.tourdatesmanager.show.dto.CreateShowRequest;

public class QueueSender {
    @Autowired
    private RabbitTemplate template;

    @Autowired
    private Queue queue;

    public void send(CreateShowRequest request) {
        this.template.convertAndSend(queue.getName(), request);
        System.out.println(" [x] Sent '" + request + "'");
    }
}
