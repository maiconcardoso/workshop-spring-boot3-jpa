package com.devsuperior.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.course.entities.Order;
import com.devsuperior.course.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository; 

    public List<Order> findAll() {
        return repository.findAll();
    }
    
    public Optional<Order> findById(Long id) {
        return repository.findById(id);
    }
}
