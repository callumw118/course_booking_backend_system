package com.codeclan.example.BookingSystemService.controllers;

import com.codeclan.example.BookingSystemService.models.Booking;
import com.codeclan.example.BookingSystemService.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/bookings/date/{date}")
    public ResponseEntity<List<Booking>> getAllBookingsByDate(@PathVariable String date){
        return new ResponseEntity<>(bookingRepository.findByDate(date), HttpStatus.OK);
    }
}
