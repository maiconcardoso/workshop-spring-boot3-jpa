package com.devsuperior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
