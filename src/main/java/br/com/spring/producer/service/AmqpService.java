package br.com.spring.producer.service;

import br.com.spring.producer.dto.Message;

public interface AmqpService {
    void sendToConsumer(Message message);
}
