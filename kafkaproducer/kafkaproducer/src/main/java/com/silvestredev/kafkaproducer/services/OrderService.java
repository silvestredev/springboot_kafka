package com.silvestredev.kafkaproducer.services;

import com.silvestredev.kafkaproducer.record.Order;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OrderService {

    private final KafkaTemplate<String, Order> kafkaTemplateOrder;

    private final Random random = new Random();

    public OrderService(KafkaTemplate<String, Order> kafkaTemplateOrder) {
        this.kafkaTemplateOrder = kafkaTemplateOrder;
    }

    @SuppressWarnings("null")
    public void sendMessageOrder(Order order) {
        int partition = random.nextInt(2);
        System.out.println("Sent message to partition: " + partition);
        System.out.println("Sending Order: " + order.name());

        kafkaTemplateOrder.send("silvestre-order-processed", partition, null, order);
    }
}
