package com.lewandowski.eventpaymentservice.payment.domain.port;

import com.lewandowski.eventpaymentservice.payment.domain.model.Order;

public interface PaymentGateway {

    void makePayment(Order order);
}
