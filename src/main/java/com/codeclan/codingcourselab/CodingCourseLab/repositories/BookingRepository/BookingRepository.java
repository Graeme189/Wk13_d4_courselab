package com.codeclan.codingcourselab.CodingCourseLab.repositories.BookingRepository;

import com.codeclan.codingcourselab.CodingCourseLab.models.Booking;
import com.codeclan.codingcourselab.CodingCourseLab.models.Course;
import com.codeclan.codingcourselab.CodingCourseLab.models.Customer;
import com.codeclan.codingcourselab.CodingCourseLab.projections.EmbedCourseAndCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(excerptProjection = EmbedCourseAndCustomer.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> findBookingsByDate(String date);

}
