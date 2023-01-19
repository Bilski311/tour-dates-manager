package com.example.showservice.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import com.example.showservice.show.dto.CreateShowRequest;

@RabbitListener(queues = "create-show-queue")
public class QueueReceiver {
    @RabbitHandler
    public void receive(CreateShowRequest request) {
        System.out.println(" [x] Received '" + request + "'");
    }
}
