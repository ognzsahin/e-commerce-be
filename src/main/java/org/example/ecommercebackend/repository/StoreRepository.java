package org.example.ecommercebackend.repository;

import org.example.ecommercebackend.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StoreRepository extends JpaRepository<Store, Long> {

    boolean existsByTaxNo(String taxNo);
}
