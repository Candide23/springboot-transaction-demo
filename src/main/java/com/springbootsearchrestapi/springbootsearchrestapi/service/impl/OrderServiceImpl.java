package com.springbootsearchrestapi.springbootsearchrestapi.service.impl;

import com.springbootsearchrestapi.springbootsearchrestapi.dto.OrderRequest;
import com.springbootsearchrestapi.springbootsearchrestapi.dto.OrderResponse;
import com.springbootsearchrestapi.springbootsearchrestapi.entity.Order;
import com.springbootsearchrestapi.springbootsearchrestapi.entity.Payment;
import com.springbootsearchrestapi.springbootsearchrestapi.repository.OrderRepository;
import com.springbootsearchrestapi.springbootsearchrestapi.repository.PaymentRepository;
import com.springbootsearchrestapi.springbootsearchrestapi.service.OrderService;

public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    private PaymentRepository paymentRepository;

    public OrderServiceImpl(OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    public OrderResponse placeOrder(OrderRequest orderRequest) {

        Order order = orderRequest.getOrder();
        order.setStatus("INPROGRESS");
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if(!payment.getType().equals("DEBIT")) {

        }
        return null;
    }
}
