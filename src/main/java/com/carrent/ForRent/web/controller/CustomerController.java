package com.carrent.ForRent.web.controller;

import model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;//indicates that it is a REST controller

import java.util.Calendar;

@RestController //indicates that this class will be able to process
public class CustomerController {

    @GetMapping("/Customer")
    public String Customer() {
        return "Customer list display";
    }

    @GetMapping("/Customer/{id}")
    public Customer listCustomers(@PathVariable int id) {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1993, Calendar.JUNE, 13);
        Customer customer = new Customer(id, "Nouguier", "Julie", dateOfBirth, "2A2004G52");
        return customer;

    }
}
