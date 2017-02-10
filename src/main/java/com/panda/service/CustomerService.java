package com.panda.service;

import com.panda.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bobby on 2/10/2017.
 */
@Component
@Transactional
public class CustomerService {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Customer customer){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);

    }
}
