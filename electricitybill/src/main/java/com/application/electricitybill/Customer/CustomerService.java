package com.application.electricitybill.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    public CustomerRepository repo;

    public Customer addCustomer(Customer customer) {
        repo.save(customer);
        return customer;
    }

    public int deleteCustomer(long customerId) {
        boolean b = repo.existsById(customerId);
        if(!b) {
            throw new IllegalStateException("Customer with id: " + customerId + " not registered.");
        }
        repo.deleteById(customerId);
        return 1;
    }

    public Customer getById(long customerId) {
        return repo.findById(customerId);
    }

    public List<Customer> getCustomer() {
        return (List<Customer>) repo.findAll();
    }

}
