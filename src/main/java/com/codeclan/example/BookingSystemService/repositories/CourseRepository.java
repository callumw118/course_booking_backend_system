package com.codeclan.example.BookingSystemService.repositories;

import com.codeclan.example.BookingSystemService.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
