package com.tca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tca.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
