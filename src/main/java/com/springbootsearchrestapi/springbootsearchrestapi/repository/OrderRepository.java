package com.springbootsearchrestapi.springbootsearchrestapi.repository;

import com.springbootsearchrestapi.springbootsearchrestapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
