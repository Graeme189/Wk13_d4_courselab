package com.codeclan.codingcourselab.CodingCourseLab.projections;

import com.codeclan.codingcourselab.CodingCourseLab.models.Booking;
import com.codeclan.codingcourselab.CodingCourseLab.models.Course;
import com.codeclan.codingcourselab.CodingCourseLab.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedCourseAndCustomer", types = Booking.class)

public interface EmbedCourseAndCustomer {
    public String getDate();
    public Customer getCustomer();
    public Course getCourse();
}
