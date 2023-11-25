package com.lewandowski.eventpaymentservice.payment.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    String id;
    String name;
    String phoneNumber;
    String emailAddress;
    Address address;
    BigDecimal amount;
    Status status;
    List<String> productIds;
}
