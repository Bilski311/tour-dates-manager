package com.example.showservice.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.DefaultClassMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.showservice.rabbit.QueueReceiver;
import com.example.showservice.show.dto.CreateShowRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue queue() {
        return new Queue("create-show-queue");
    }

    @Bean
    public Jackson2JsonMessageConverter getConverter(
            @Autowired ObjectMapper objectMapper) {
        Jackson2JsonMessageConverter messageConverter =
        new Jackson2JsonMessageConverter(objectMapper);
        messageConverter.setClassMapper(getClassMapper());
        return messageConverter;
    }

    @Bean
    public DefaultClassMapper getClassMapper() {
        DefaultClassMapper classMapper = new DefaultClassMapper();
        Map<String, Class<?>> map = new HashMap<>();
        map.put(
        "com.example.tourdatesmanager.show.dto." + 
        "CreateShowRequest",
        CreateShowRequest.class);
        classMapper.setIdClassMapping(map);
        return classMapper;
    }

    @Bean
    public QueueReceiver receiver() {
        return new QueueReceiver();
    }
}
