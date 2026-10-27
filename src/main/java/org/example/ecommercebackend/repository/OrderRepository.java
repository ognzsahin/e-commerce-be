package org.example.ecommercebackend.repository;

import org.example.ecommercebackend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
