package com.gabrielduarte.rabbit.config;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfig {

    private final ConnectionFactory connectionFactory;
    private final SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory;

    public ConsumerConfig(ConnectionFactory connectionFactory, SimpleRabbitListenerContainerFactory simpleRabbitListenerContainerFactory) {
        this.connectionFactory = connectionFactory;
        this.simpleRabbitListenerContainerFactory = simpleRabbitListenerContainerFactory;
    }

    @RabbitListener(queues = {"SAGSA"})
    void receiveMessageFromTopic(Message message) {
        String
    }
}
