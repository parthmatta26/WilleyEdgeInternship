package com.application.electricitybill.Customer;

import com.application.electricitybill.Bill.Bill;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;

    //@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "customer")
//    private List<Bill> bill;

    private String customerName;
    private String areaCode;
    private long customerContactno;

    public Customer(String customerName, String areaCode, long customerContactno) {
        this.customerName = customerName;
        this.areaCode = areaCode;
        this.customerContactno = customerContactno;
    }

    public Customer() {
    }

//    public List<Bill> getBill() {
//        return bill;
//    }
//
//    public void setBill(List<Bill> bill) {
//        this.bill = bill;
//    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public long getCustomerContactno() {
        return customerContactno;
    }

    public void setCustomerContactno(long customerContactno) {
        this.customerContactno = customerContactno;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", customerContactno=" + customerContactno +
                '}';
    }
}
