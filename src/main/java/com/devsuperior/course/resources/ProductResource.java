package com.devsuperior.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.course.entities.Product;
import com.devsuperior.course.services.ProductService;

@RestController
@RequestMapping("products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product productById = service.findById(id).get();
        return ResponseEntity.status(HttpStatus.OK).body(productById);
    }
 
}
