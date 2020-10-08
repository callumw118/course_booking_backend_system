package com.codeclan.example.BookingSystemService.components;

import com.codeclan.example.BookingSystemService.models.Booking;
import com.codeclan.example.BookingSystemService.models.Course;
import com.codeclan.example.BookingSystemService.models.Customer;
import com.codeclan.example.BookingSystemService.repositories.BookingRepository;
import com.codeclan.example.BookingSystemService.repositories.CourseRepository;
import com.codeclan.example.BookingSystemService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CustomerRepository  customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Course course1 = new Course("Spring Hell", "Dundee", 2);
        courseRepository.save(course1);

        Course course2 = new Course("Bring Back Python", "Edinburgh", 5);
        courseRepository.save(course2);

        Course course3 = new Course("We Miss Javascript", "Inverness", 4);
        courseRepository.save(course3);

        Customer cust1 = new Customer("Callum", "Dundee", 24);
        customerRepository.save(cust1);

        Customer cust2 = new Customer("Tim", "Dundee", 32);
        customerRepository.save(cust2);

        Booking booking1 = new Booking("05Aug20", course1, cust1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("13Jul20", course2, cust2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("20Sep20", course1, cust2);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("08Nov20", course3, cust1);
        bookingRepository.save(booking4);

//        course1.addBooking(booking1);
//        course1.addBooking(booking3);
//        courseRepository.save(course1);
//
//        course2.addBooking(booking2);
//        courseRepository.save(course2);
//
//        course3.addBooking(booking4);
//        courseRepository.save(course3);
//
//
//
//        cust1.addBooking(booking1);
//        cust1.addBooking((booking4));
//        customerRepository.save(cust1);
//
//        cust2.addBooking(booking2);
//        cust2.addBooking(booking3);
//        customerRepository.save(cust2);
    }
}
