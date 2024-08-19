package com.devsuperior.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.course.entities.Category;
import com.devsuperior.course.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Optional<Category> findById(Long id) {
        Optional<Category> categoryById = repository.findById(id);
        return categoryById;
    }
}
