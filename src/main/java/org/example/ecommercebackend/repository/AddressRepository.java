package org.example.ecommercebackend.repository;

import org.example.ecommercebackend.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
