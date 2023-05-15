package com.carrent.ForRent.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;//indicates that it is a REST controller

@RestController //indicates that this class will be able to process
public class CustomerController {

    @GetMapping("/Customer")
    public String Customer() {
        return "Customer list display";
    }

    @GetMapping("/Customer/{id}")
    public String listCustomers(@PathVariable int id) {
        return "Customer with id " + id;

    }
}
