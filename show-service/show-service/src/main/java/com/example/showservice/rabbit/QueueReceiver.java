package com.example.showservice.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import com.example.showservice.show.dto.CreateShowRequest;
import com.example.showservice.show.service.ShowService;

@RabbitListener(queues = "create-show-queue")
public class QueueReceiver {
    private final ShowService showService;

    public QueueReceiver(ShowService showService) {
        this.showService = showService;
    }

    @RabbitHandler
    public void receive(CreateShowRequest request) {
        System.out.println(" [x] Received '" + request + "'");
        this.showService.createShow(request);
    }
}
