package com.application.electricitybill;

import com.application.electricitybill.Bill.Bill;
import com.application.electricitybill.Bill.BillService;
import com.application.electricitybill.Customer.Customer;
import com.application.electricitybill.Customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/electricitybill")
public class ElectricityBillController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private BillService billService;

    @GetMapping("/getAll")
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer c) {
        return customerService.addCustomer(c);
    }

    @DeleteMapping("/delete/{customerId}")
    public int deleteCustomer(@PathVariable long customerId) {
        return customerService.deleteCustomer(customerId);
    }

    @PostMapping("/saveBill")
    public int saveBill(@RequestBody Bill bill) {
        return billService.saveBill(bill);
    }

    @GetMapping("/generate/{customerId}/{month}")
    public DisplayBill generateBill(@PathVariable long customerId, @PathVariable int month) {
        return billService.generateBill(customerId, month);
    }

    @GetMapping("/records/{customerId}")
    public List<Bill> billHistory(@PathVariable long customerId) {
        return billService.billHistory(customerId);
    }
}
