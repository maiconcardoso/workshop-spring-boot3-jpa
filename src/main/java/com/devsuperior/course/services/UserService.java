package com.devsuperior.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.course.entities.User;
import com.devsuperior.course.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.parser.Entity;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public User update(Long id, User userForUpdated) {
        User entity = repository.getReferenceById(id);
        updateData(entity, userForUpdated);
        return repository.save(entity);
    }

    private void updateData(User entity, User userForUpdated) {
        entity.setName(userForUpdated.getName());
        entity.setEmail(userForUpdated.getEmail());
        entity.setPhone(userForUpdated.getPhone());
    }

    
}
