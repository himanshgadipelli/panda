package com.panda.service;

import com.panda.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bobby on 2/10/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/persistence.xml"})
@Transactional
public class CustomerServiceTest {
    @Autowired
    private CustomerService customerService;

    @Test
    @Rollback(value = false)
    public void testService(){
        Customer customer = new Customer();
        customer.setFirstName("Dragon");
        customer.setLastName("Warrior");

        customerService.save(customer);
    }
}
