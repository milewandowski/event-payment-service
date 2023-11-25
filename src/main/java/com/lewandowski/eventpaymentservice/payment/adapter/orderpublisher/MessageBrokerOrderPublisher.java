package com.lewandowski.eventpaymentservice.payment.adapter.orderpublisher;

import com.lewandowski.eventpaymentservice.payment.domain.model.Order;
import com.lewandowski.eventpaymentservice.payment.domain.port.OrderPublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
class MessageBrokerOrderPublisher implements OrderPublisher {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void send(Order order) {
        kafkaTemplate.send("payment-shipping-local", order);
    }
}
