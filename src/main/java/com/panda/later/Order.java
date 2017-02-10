package com.panda.later;

import java.util.Date;

/**
 * Created by bobby on 2/9/2017.
 */
public class Order {
    private Long orderID;
    private Date date;
    private Status status;

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
