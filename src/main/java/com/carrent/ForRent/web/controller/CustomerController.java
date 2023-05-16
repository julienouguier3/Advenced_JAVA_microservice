package com.carrent.ForRent.web.controller;

import com.carrent.ForRent.dao.CustomerDao;
import com.carrent.ForRent.model.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //indicates that this class will be able to process
public class CustomerController {

    private final CustomerDao customerDao;

    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    @GetMapping("/customers")
    @Operation(description = "Allow you to get the list of all customers", summary = "Get All Customers")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success Juju"), @ApiResponse(responseCode = "404", description = "Error not found")})
    public List<Customer> list() {
        return customerDao.findAll();

    }

    @GetMapping(value = "/customers/{id}")
    public Customer show(@PathVariable int id) {
        return customerDao.findById(id);

    }

    @PostMapping("/customers")
    public Customer add(@RequestBody Customer customer) {
        return customerDao.save(customer);
    }

    @PutMapping("/customers")
    public Customer update(@RequestBody Customer customer) {
        return customerDao.update(customer);
    }

    @DeleteMapping("/customers/{id}")
    public String delete(@PathVariable int id) {
        return customerDao.delete(id);
    }
}
