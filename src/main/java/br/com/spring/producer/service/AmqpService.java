package br.com.spring.producer.service;

import br.com.spring.producer.dto.MessageQueue;

public interface AmqpService {
    void sendToConsumer(MessageQueue message);
}
