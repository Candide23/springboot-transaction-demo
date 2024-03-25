package com.springbootsearchrestapi.springbootsearchrestapi.service;

import com.springbootsearchrestapi.springbootsearchrestapi.dto.OrderRequest;
import com.springbootsearchrestapi.springbootsearchrestapi.dto.OrderResponse;

public interface OrderService {

    OrderResponse placeOrder(OrderRequest orderRequest);
}
