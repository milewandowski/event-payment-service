package com.lewandowski.eventpaymentservice.payment.domain.port;

import com.lewandowski.eventpaymentservice.payment.domain.model.Order;

public interface StatusPublisher {

    void send(Order order);
}
