package com.codeclan.codingcourselab.CodingCourseLab.controllers;

import com.codeclan.codingcourselab.CodingCourseLab.models.Booking;
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
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getBookingsByDate(@PathVariable String date){
        return bookingRepository.findBookingsByDate(date);
    }

}
