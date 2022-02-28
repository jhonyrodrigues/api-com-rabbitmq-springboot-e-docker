package br.com.spring.producer.amqp;

public interface AmqpProducer<T> {
    void producer(T t);
}