package com.gabrielduarte.controller;

import com.gabrielduarte.domain.Course;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.Any;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("rabbitmq/")
public class ExchangeController {

    private final RabbitTemplate rabbitTemplate;

    public ExchangeController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("{exchange}/{routingKey}")
    HttpEntity<Any> postOnExchange(@PathVariable String exchange, @PathVariable String routingKey, @RequestBody String message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
        return ResponseEntity.ok().build();
    }

    @PostMapping("{exchange}/{routingKey}")
    HttpEntity<Any> postJsonOnExchange(@PathVariable String exchange, @PathVariable String routingKey, @RequestBody Course message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
        return ResponseEntity.ok().build();
    }
}
