package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.model.entity.Order;
import com.ecommerce.ecommerce.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public Order create(@RequestBody Order order) {
        return service.createOrder(order);
    }
}