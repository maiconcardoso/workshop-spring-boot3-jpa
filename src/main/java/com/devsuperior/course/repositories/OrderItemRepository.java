package com.devsuperior.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.course.entities.OrderItem;
import com.devsuperior.course.entities.pk.OrderItemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
