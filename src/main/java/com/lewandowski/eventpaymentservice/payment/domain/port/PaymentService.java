package com.lewandowski.eventpaymentservice.payment.domain.port;

import com.lewandowski.eventpaymentservice.payment.domain.model.Order;
import com.lewandowski.eventpaymentservice.payment.domain.model.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public final class PaymentService {

    private final PaymentGateway paymentGateway;
    private final StatusPublisher statusPublisher;
    private final OrderPublisher orderPublisher;

    public void makePayment(Order order) {
        paymentGateway.makePayment(order);
        order.setStatus(Status.PAID);
        statusPublisher.send(order);
        orderPublisher.send(order);
    }
}
