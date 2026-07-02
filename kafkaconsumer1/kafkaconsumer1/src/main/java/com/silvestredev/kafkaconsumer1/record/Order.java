package com.silvestredev.kafkaconsumer1.record;

import java.math.BigDecimal;

public record Order(
        Long id,
        String name,
        String description,
        BigDecimal amount
) {
}
