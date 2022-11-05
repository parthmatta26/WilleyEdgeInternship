package com.application.electricitybill.Bill;

import com.application.electricitybill.Customer.Customer;
import com.application.electricitybill.Customer.CustomerService;
import com.application.electricitybill.DisplayBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    public BillRepository repo;
    @Autowired
    public CustomerService service;

    public void validateUser(long customerId) {
        if(!service.repo.existsById(customerId)) {
            throw new IllegalStateException("Customer with id: " + customerId + " not registered.");
        }
    }

    public int saveBill(Bill bill) {
        validateUser(bill.getCustomerId());
        repo.save(bill);
        return 1;
    }

    public DisplayBill generateBill(long customerId, int month) {
        validateUser(customerId);
        Bill b = repo.findExactBill(customerId, month);
        Customer c = service.getById(customerId);

        return new DisplayBill(b.getBillNo(), customerId,c.getCustomerName(),c.getAreaCode(),c.getCustomerContactno(),b.getUnitsConsumed(),b.getBillDate(),b.getBillAmount());
    }

    public List<Bill> billHistory(long customerId) {
        validateUser(customerId);
        return repo.findBycustomerId(customerId);
    }
}
