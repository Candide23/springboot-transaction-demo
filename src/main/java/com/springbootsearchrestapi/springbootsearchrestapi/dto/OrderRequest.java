package com.springbootsearchrestapi.springbootsearchrestapi.dto;

import com.springbootsearchrestapi.springbootsearchrestapi.entity.Order;
import com.springbootsearchrestapi.springbootsearchrestapi.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
