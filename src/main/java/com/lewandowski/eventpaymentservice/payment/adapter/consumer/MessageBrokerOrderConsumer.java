package com.lewandowski.eventpaymentservice.payment.adapter.consumer;

import com.lewandowski.eventpaymentservice.payment.domain.model.Order;
import com.lewandowski.eventpaymentservice.payment.domain.port.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
class MessageBrokerOrderConsumer {

    private final PaymentService paymentService;

    @KafkaListener(topics = "order-payment-local2", groupId = "payment-service")
    public void consume(@Payload Order order) {
        log.info("Order event received: {}", order);
        paymentService.makePayment(order);
    }
}
