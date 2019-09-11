package com.areumjo.lambda.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;

    @Column(nullable = false)
    private double ordamount;
    private double advanceamount;
    private String ordderscription;

    @ManyToOne
    @JoinColumn(name = "custcode",
            nullable = false)
    @JsonIgnoreProperties("ordnum")
    private Customer customer;

    public Order() {
    }

    public Order(double ordamount, double advanceamount, String ordderscription, Customer customer) {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.ordderscription = ordderscription;
        this.customer = customer;
    }

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public String getOrdderscription() {
        return ordderscription;
    }

    public void setOrdderscription(String ordderscription) {
        this.ordderscription = ordderscription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
