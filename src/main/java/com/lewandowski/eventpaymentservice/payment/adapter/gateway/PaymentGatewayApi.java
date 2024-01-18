package com.lewandowski.eventpaymentservice.payment.adapter.gateway;

import com.lewandowski.eventpaymentservice.payment.domain.model.Order;
import com.lewandowski.eventpaymentservice.payment.domain.model.Status;
import com.lewandowski.eventpaymentservice.payment.domain.port.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
class PaymentGatewayApi implements PaymentGateway {

    @Override
    public Order makePayment(Order order) {
        // Mocked payment gateway call
        // Just for research reasons please don't do it at home
        try {
            Thread.sleep(50L);
            order.setStatus(Status.PAID);
        } catch (InterruptedException e) {
            order.setStatus(Status.PAYMENT_FAILED);
        }
        return order;
    }
}
