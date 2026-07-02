package com.silvestredev.kafkaconsumer1.service;

import com.silvestredev.kafkaconsumer1.record.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    // @KafkaListener(topics = "silvestre-order-processed", containerFactory = "orderKafkaListenerContainerFactory")
    @KafkaListener(topicPartitions = @TopicPartition(topic = "silvestre-order-processed", partitions = { "1" }), containerFactory = "orderKafkaListenerContainerFactory")
    public void orderListener(Order order) {
        System.out.println("Received Message Consumer 01: " + order.name());
    }
}
