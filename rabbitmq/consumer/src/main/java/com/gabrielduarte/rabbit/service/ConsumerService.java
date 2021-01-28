package com.gabrielduarte.rabbit.service;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

@Log4j2
@Slf4j
@Service
public class ConsumerService implements MessageListener {

    @Override
    public void onMessage(Message message) {
        message.getBody();
    }
}
