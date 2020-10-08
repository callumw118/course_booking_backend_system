package com.codeclan.example.BookingSystemService.repositories;

import com.codeclan.example.BookingSystemService.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findCustomersByBookingsCourseId(Long id);
}
