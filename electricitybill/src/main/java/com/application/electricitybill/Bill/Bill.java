package com.application.electricitybill.Bill;

import com.application.electricitybill.Customer.Customer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long billNo;

//    @ManyToOne
//    @JoinColumn(name = "customer.customerId")
//    private Customer customer;

    private long customerId;
    private int unitsConsumed;
    private LocalDate billDate;
    private double billAmount;

    public Bill(long customerId, int unitsConsumed, String billDate, double billAmount) {
        this.customerId = customerId;
        this.unitsConsumed = unitsConsumed;
        this.billDate = LocalDate.parse(billDate);
        this.billAmount = calcBillAmount();
    }

    public Bill() {
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    //    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

    public long getBillNo() {
        return billNo;
    }

    public void setBillNo(long billNo) {
        this.billNo = billNo;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = calcBillAmount();
    }

    public double calcBillAmount() {
        double billamount;
        if(unitsConsumed > 150) {
            billamount = 100*0.5 + 50*0.75 + (unitsConsumed - 150)*1;
        }
        else if(unitsConsumed > 100) {
            billamount = 100*0.5 + (unitsConsumed - 150)*0.75;
        }
        else {
            billamount = unitsConsumed*0.5;
        }
        return billamount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billNo=" + billNo +
                ", customerId=" + customerId +
                ", unitsConsumed=" + unitsConsumed +
                ", billDate=" + billDate +
                ", billAmount=" + billAmount +
                '}';
    }
}
