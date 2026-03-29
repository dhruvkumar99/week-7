package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.entity.Payment;
import com.ecommerce.ecommerce.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class Paymentcontroller {

    private final PaymentService service;

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return service.save(payment);
    }
}