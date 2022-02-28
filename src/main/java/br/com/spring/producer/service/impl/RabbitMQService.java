package br.com.spring.producer.service.impl;

import br.com.spring.producer.amqp.AmqpProducer;
import br.com.spring.producer.dto.Message;
import br.com.spring.producer.service.AmqpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RabbitMQService implements AmqpService {

    private final AmqpProducer<Message> amqp;

    @Override
    public void sendToConsumer(Message message) {
        amqp.producer(message);
    }
}