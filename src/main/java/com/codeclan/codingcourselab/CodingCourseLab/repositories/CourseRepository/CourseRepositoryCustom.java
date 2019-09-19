package com.codeclan.codingcourselab.CodingCourseLab.repositories.CourseRepository;

import com.codeclan.codingcourselab.CodingCourseLab.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findCoursesbyCustomerID(Long id);
}
