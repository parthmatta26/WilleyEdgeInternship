package com.application.electricitybill;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class DisplayBill {

    private long billNo;
    private long customerId;
    private String customerName;
    private String areaCode;
    private long customerContactno;
    private int unitsConsumed;
    private LocalDate billDate;
    private double billAmount;

    public DisplayBill(long billNo, long customerId, String customerName, String areaCode, long customerContactno, int unitsConsumed, LocalDate billDate, double billAmount) {
        this.billNo = billNo;
        this.customerId = customerId;
        this.customerName = customerName;
        this.areaCode = areaCode;
        this.customerContactno = customerContactno;
        this.unitsConsumed = unitsConsumed;
        this.billDate = billDate;
        this.billAmount = billAmount;
    }

    public long getBillNo() {
        return billNo;
    }

    public void setBillNo(long billNo) {
        this.billNo = billNo;
    }

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
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "DisplayBill{" +
                "billNo=" + billNo +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", customerContactno=" + customerContactno +
                ", unitsConsumed=" + unitsConsumed +
                ", billDate=" + billDate +
                ", billAmount=" + billAmount +
                '}';
    }
}
