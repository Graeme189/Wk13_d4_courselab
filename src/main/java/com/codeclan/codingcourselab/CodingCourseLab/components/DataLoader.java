package com.codeclan.codingcourselab.CodingCourseLab.components;

import com.codeclan.codingcourselab.CodingCourseLab.models.Booking;
import com.codeclan.codingcourselab.CodingCourseLab.models.Course;
import com.codeclan.codingcourselab.CodingCourseLab.models.Customer;
import com.codeclan.codingcourselab.CodingCourseLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.codingcourselab.CodingCourseLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.codingcourselab.CodingCourseLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Graeme", "Edinburgh", 43);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Gavin", "Edinburgh", 31);
        customerRepository.save(customer2);

        Course course1 = new Course("Python", "Edinburgh", 3);
        courseRepository.save(course1);

        Course course2 = new Course("Java", "Edinburgh", 3);
        courseRepository.save(course2);

        Booking booking1 = new Booking("17-09-2019", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("25-10-2019", customer2, course2);
        bookingRepository.save(booking2);

        course1.addBooking(booking1);

        customer1.addBooking(booking1);

        course2.addBooking(booking2);

        customer2.addBooking(booking2);

    }
}
