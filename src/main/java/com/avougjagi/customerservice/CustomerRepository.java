package com.avougjagi.customerservice;

import org.springframework.data.jpa.repository.JpaRepository;

// Repository för kunddata
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}