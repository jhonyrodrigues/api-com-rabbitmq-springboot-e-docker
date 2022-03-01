package br.com.spring.producer.service.impl;

import br.com.spring.producer.amqp.AmqpProducer;
import br.com.spring.producer.dto.MessageQueue;
import br.com.spring.producer.service.AmqpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RabbitMQService implements AmqpService {

    private final AmqpProducer<MessageQueue> amqp;

    @Override
    public void sendToConsumer(MessageQueue message) {
        amqp.producer(message);
    }
}