package com.codeclan.example.BookingSystemService;

import com.codeclan.example.BookingSystemService.models.Booking;
import com.codeclan.example.BookingSystemService.models.Course;
import com.codeclan.example.BookingSystemService.models.Customer;
import com.codeclan.example.BookingSystemService.repositories.BookingRepository;
import com.codeclan.example.BookingSystemService.repositories.CourseRepository;
import com.codeclan.example.BookingSystemService.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookingSystemServiceApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetAllCourses(){
		List<Course> found = courseRepository.findAll();
		assertEquals(3, found.size());
	}

	@Test
	public void canGetAllBookings(){
		List<Booking> found = bookingRepository.findAll();
		assertEquals(4, found.size());
	}

	@Test
	public void canGetAllCustomers(){
		List<Customer> found = customerRepository.findAll();
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllCoursesForGivenRating(){
		List<Course> found = courseRepository.findCourseByStarRating(5);
		assertEquals(1, found.size());
	}

	@Test
	public void canGetAllCustomersForGivenCourse(){
		List<Customer> found = customerRepository.findCustomersByBookingsCourseId(1L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllCoursesForCustomer(){
		List<Course> found = courseRepository.findByBookingsCustomerId(1L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllBookingsForGivenDate(){
		List<Booking> found = bookingRepository.findByDate("13Sept20");
		assertEquals(1, found.size());
	}
}
