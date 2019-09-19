package com.codeclan.codingcourselab.CodingCourseLab.repositories.BookingRepository;

import com.codeclan.codingcourselab.CodingCourseLab.models.Booking;
import com.codeclan.codingcourselab.CodingCourseLab.models.Course;
import com.codeclan.codingcourselab.CodingCourseLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

}
