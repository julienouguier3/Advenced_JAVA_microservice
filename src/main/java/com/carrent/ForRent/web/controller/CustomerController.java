package com.carrent.ForRent.web.controller;

import com.carrent.ForRent.dao.CustomerDao;
import com.carrent.ForRent.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //indicates that this class will be able to process
public class CustomerController {

    private final CustomerDao customerDao;

    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @GetMapping("/Customers")
    public List<Customer> list() {
        return customerDao.findAll();

    }

    @GetMapping(value = "/Customers/{id}")
    public Customer show(@PathVariable int id) {
        return customerDao.findById(id);

    }

    @PostMapping("/Customers")
    public Customer add(@RequestBody Customer customer) {
        return customerDao.save(customer);
    }

    @PutMapping("/Customers")
    public Customer update(@RequestBody Customer customer) {
        return customerDao.update(customer);
    }

    @DeleteMapping("/Customers/{id}")
    public String delete(@PathVariable int id) {
        return customerDao.delete(id);
    }
}
