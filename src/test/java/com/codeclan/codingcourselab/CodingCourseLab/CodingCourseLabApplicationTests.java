package com.codeclan.codingcourselab.CodingCourseLab;

import com.codeclan.codingcourselab.CodingCourseLab.models.Booking;
import com.codeclan.codingcourselab.CodingCourseLab.models.Course;
import com.codeclan.codingcourselab.CodingCourseLab.models.Customer;
import com.codeclan.codingcourselab.CodingCourseLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.codingcourselab.CodingCourseLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.codingcourselab.CodingCourseLab.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodingCourseLabApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindCourseByRating() {
		List<Course> found = courseRepository.findCoursesByRating(3);
		assertEquals("Python", found.get(0).getName());
	}

	@Test
	public void canFindCustomerByCourse() {
		List<Customer> found = customerRepository.findCustomersByCourseID(1L);
		assertEquals("Graeme", found.get(0).getName());
	}

	@Test
	public void canfindCoursesbyCustomerID(){
		List<Course> found = courseRepository.findCoursesbyCustomerID(1L);
		assertEquals("Python", found.get(0).getName());
	}

	@Test
	public void canGetBookingsByDate(){
		List<Booking> found = bookingRepository.findBookingsByDate("17-09-2019");
		assertEquals("17-09-2019", found.get(0).getDate());
	}

}
