package org.example.ecommercebackend.repository;

import org.example.ecommercebackend.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
