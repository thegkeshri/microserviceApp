package com.project.os.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.os.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
