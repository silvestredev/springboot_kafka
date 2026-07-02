package com.silvestredev.kafkaproducer.record;

import java.math.BigDecimal;

public record Order(
        Long id,
        String name,
        String description,
        BigDecimal amount
) {
}
