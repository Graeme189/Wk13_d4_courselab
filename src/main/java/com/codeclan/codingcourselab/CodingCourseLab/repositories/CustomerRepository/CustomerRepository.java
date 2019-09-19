package com.codeclan.codingcourselab.CodingCourseLab.repositories.CustomerRepository;

import com.codeclan.codingcourselab.CodingCourseLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
