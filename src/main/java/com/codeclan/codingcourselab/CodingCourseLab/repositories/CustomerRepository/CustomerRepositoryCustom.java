package com.codeclan.codingcourselab.CodingCourseLab.repositories.CustomerRepository;

import com.codeclan.codingcourselab.CodingCourseLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersByCourseID(Long id);
}
