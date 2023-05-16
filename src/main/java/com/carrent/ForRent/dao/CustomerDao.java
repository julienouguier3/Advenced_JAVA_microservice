package com.carrent.ForRent.dao;

import com.carrent.ForRent.model.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAll(); //returns the complete list of all products

    Customer findById(int id); //return a product by its Id

    Customer save(Customer customer); //add a product
}
