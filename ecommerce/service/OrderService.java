package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.model.entity.Order;
import com.ecommerce.ecommerce.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repo;

    @Transactional
    public Order createOrder(Order order) {
        return repo.save(order);
    }
}