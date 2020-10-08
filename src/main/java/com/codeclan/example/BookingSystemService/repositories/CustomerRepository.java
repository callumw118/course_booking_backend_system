package com.codeclan.example.BookingSystemService.repositories;

import com.codeclan.example.BookingSystemService.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
