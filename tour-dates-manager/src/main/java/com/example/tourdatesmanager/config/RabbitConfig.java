package com.example.tourdatesmanager.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.tourdatesmanager.rabbit.QueueSender;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue queue() {
        return new Queue("create-show-queue");
    }

    @Bean
    public QueueSender sender() {
        return new QueueSender();
    }
}
