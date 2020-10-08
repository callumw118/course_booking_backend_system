package com.codeclan.example.BookingSystemService.repositories;

import com.codeclan.example.BookingSystemService.models.Booking;
import com.codeclan.example.BookingSystemService.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByDate(String date);
}
