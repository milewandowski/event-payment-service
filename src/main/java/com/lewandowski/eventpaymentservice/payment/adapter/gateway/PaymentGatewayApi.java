package com.lewandowski.eventpaymentservice.payment.adapter.gateway;

import com.lewandowski.eventpaymentservice.payment.domain.model.Order;
import com.lewandowski.eventpaymentservice.payment.domain.port.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
class PaymentGatewayApi implements PaymentGateway {

    @Override
    public void makePayment(Order order) {
        // Mocked payment gateway call
        try {
            Thread.sleep(50L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
