package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.model.entity.Payment;
import com.ecommerce.ecommerce.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository repo;

    public Payment save(Payment payment) {
        return repo.save(payment);
    }
}