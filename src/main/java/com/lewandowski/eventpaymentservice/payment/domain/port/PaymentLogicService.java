package com.lewandowski.eventpaymentservice.payment.domain.port;

import com.lewandowski.eventpaymentservice.payment.domain.model.Order;
import com.lewandowski.eventpaymentservice.payment.domain.model.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class PaymentLogicService implements PaymentService {

    private final PaymentGateway paymentGateway;
    private final StatusPublisher statusPublisher;
    private final OrderPublisher orderPublisher;

    public void makePayment(Order order) {
        order.validateOrderForPayment();

        publishOrderEvents(paymentGateway.makePayment(order));
    }

    private void publishOrderEvents(Order order) {
        statusPublisher.send(order);

        if (Status.PAID.equals(order.getStatus())) {
            orderPublisher.send(order);
        }
    }
}
