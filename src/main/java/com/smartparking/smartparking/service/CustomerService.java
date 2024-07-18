package com.smartparking.smartparking.service;

import com.smartparking.smartparking.model.Customer;

import java.util.List;

public interface CustomerService {
    public String saveCustomer(Customer customer);
    public List<Customer> getAllCustomer();
    public Customer updateCustomer(Customer customer);
    public void delCustomer(Integer id);


}
