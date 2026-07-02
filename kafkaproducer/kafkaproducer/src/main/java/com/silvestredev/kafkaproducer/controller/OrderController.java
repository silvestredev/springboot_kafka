package com.silvestredev.kafkaproducer.controller;

import com.silvestredev.kafkaproducer.record.Order;
import com.silvestredev.kafkaproducer.services.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    public final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        service.sendMessageOrder(order);
    }
}
