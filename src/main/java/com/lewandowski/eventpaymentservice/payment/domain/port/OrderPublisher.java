package com.lewandowski.eventpaymentservice.payment.domain.port;

import com.lewandowski.eventpaymentservice.payment.domain.model.Order;

public interface OrderPublisher {

    void send(Order order);
}
