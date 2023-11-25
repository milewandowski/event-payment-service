package com.lewandowski.eventpaymentservice.payment.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    String country;
    String postalCode;
    String city;
    String address;
}
