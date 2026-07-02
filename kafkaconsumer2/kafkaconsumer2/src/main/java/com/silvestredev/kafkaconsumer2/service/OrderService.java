package com.silvestredev.kafkaconsumer2.service;

import com.silvestredev.kafkaconsumer2.record.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    // @KafkaListener(topics = "silvestre-order-processed", containerFactory =
    // "orderKafkaListenerContainerFactory")
    @KafkaListener(topicPartitions = @TopicPartition(topic = "silvestre-order-processed", partitions = { "0" }), containerFactory = "orderKafkaListenerContainerFactory")
    public void orderListener(Order order) {
        System.out.println("Received Message Consumer 02: " + order.name());
    }
}
