package com.almeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almeida.course.entities.OrderItem;
import com.almeida.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	

}
