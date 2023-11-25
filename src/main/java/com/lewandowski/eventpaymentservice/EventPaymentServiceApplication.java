package com.lewandowski.eventpaymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class EventPaymentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventPaymentServiceApplication.class, args);
    }

}
