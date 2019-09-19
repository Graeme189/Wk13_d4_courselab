package com.codeclan.codingcourselab.CodingCourseLab.controllers;

import com.codeclan.codingcourselab.CodingCourseLab.models.Customer;
import com.codeclan.codingcourselab.CodingCourseLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.codingcourselab.CodingCourseLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.codingcourselab.CodingCourseLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/town/{town}/course/{id}")
    public List<Customer> findCustomersByTownAndCourse(@PathVariable String town, @PathVariable Long id){
        return customerRepository.findCustomersByTownAndCourse(town, id);
    }
}
