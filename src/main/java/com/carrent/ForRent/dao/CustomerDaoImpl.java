package com.carrent.ForRent.dao;

import com.carrent.ForRent.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository //indicates that it is a class that manages the data
public class CustomerDaoImpl implements CustomerDao {
    public static List<Customer> customers = new ArrayList<>();

    static {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1982, Calendar.JANUARY, 24);
        customers.add(new Customer(11, "Dupont", "Edouard", dateOfBirth, "15L69M142"));
        dateOfBirth.set(1968, Calendar.OCTOBER, 02);
        customers.add(new Customer(25, "Martin", "Veronique", dateOfBirth, "15L69M142"));
        dateOfBirth.set(2002, Calendar.DECEMBER, 16);
        customers.add(new Customer(32, "Lupin", "Benjamin", dateOfBirth, "15L69M142"));

    }


    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public Customer save(Customer customer) {
        customers.add(customer);
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        customers.set(customers.indexOf(customer), customer);
        return null;
    }

    @Override
    public String delete(int id) {
        if (customers.remove(this.findById(id))) {
            return "Success Delete";
        }
        return "404 error";
    }

}
