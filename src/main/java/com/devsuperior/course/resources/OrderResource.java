package com.devsuperior.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.course.entities.Order;
import com.devsuperior.course.services.OrderService;


@RestController
@RequestMapping("orders")
public class OrderResource {

    @Autowired
    private OrderService service;

    public ResponseEntity<List<Order>> findAll() {
        List<Order> orders = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(orders);
    }

    @GetMapping("{id}")
    public ResponseEntity<Order> findById(@PathVariable long id) {
        Order orderById = service.findById(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(orderById);
    }
}
