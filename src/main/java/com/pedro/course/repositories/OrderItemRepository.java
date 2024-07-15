package com.pedro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.course.entities.OrderItem;
import com.pedro.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem , OrderItemPK> {

}