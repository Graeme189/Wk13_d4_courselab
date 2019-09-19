package com.codeclan.codingcourselab.CodingCourseLab.repositories.CourseRepository;

import com.codeclan.codingcourselab.CodingCourseLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
