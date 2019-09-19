package com.codeclan.codingcourselab.CodingCourseLab.repositories.CustomerRepository;

import com.codeclan.codingcourselab.CodingCourseLab.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersByCourseID(Long id){
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", id));
            result = cr.list();
        }
        catch(HibernateException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Transactional
    public List<Customer> findCustomersByTownAndCourse(String town, Long id){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", id));
            results = cr.list();
        }
        catch(HibernateException ex) {
            ex.printStackTrace();
        }
        return results;
    }

    @Transactional
    public List<Customer> getAllCustomersOverAgeInTownByCourse(int age, String town, Long id){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.course.id", id));
            cr.add(Restrictions.gt("age", age));
            results = cr.list();
        }
        catch(HibernateException ex){
            ex.printStackTrace();
        } return results;
    }
}
