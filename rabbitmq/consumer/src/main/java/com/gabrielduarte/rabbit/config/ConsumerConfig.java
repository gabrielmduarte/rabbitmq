package com.gabrielduarte.rabbit.config;

import com.gabrielduarte.rabbit.domain.Course;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ConsumerConfig {

    @RabbitListener(queues = "SECOND-QUEUE-BASIC")
    void receiveMessageFromTopic1(Course course) {

    }



}
