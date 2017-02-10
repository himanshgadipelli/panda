package com.panda.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by bobby on 2/9/2017.
 */
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private Set<Order> orderSet = new HashSet<Order>();

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }

    public void addOrder(Order order){
        order.setCustomer(this);
        orderSet.add(order);
    }
}
