package com.gabrielduarte.rabbit.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

@Slf4j
@Service
public class BasicListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        if(Objects.nonNull(message.getBody())) {
            String body = new String(message.getBody(), StandardCharsets.UTF_8);
            log.info("b " + body);
        }
    }
}
