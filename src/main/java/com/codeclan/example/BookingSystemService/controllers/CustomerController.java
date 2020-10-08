package com.codeclan.example.BookingSystemService.controllers;

import com.codeclan.example.BookingSystemService.models.Customer;
import com.codeclan.example.BookingSystemService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(
            @RequestParam(name="course", required = false) Long id
    ){
        if (id != null){
            return new ResponseEntity<>(customerRepository.findCustomersByBookingsCourseId(id), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
        }
    }
}
