package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);

    List<Customer> findAll();
}

