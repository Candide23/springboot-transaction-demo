package com.springbootsearchrestapi.springbootsearchrestapi.repository;

import com.springbootsearchrestapi.springbootsearchrestapi.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
