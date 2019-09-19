package com.codeclan.codingcourselab.CodingCourseLab.repositories.BookingRepository;

import com.codeclan.codingcourselab.CodingCourseLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
