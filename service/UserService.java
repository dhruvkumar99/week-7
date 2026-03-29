package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.model.entity.User;
import com.ecommerce.ecommerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public User save(User user) {
        return repo.save(user);
    }
}