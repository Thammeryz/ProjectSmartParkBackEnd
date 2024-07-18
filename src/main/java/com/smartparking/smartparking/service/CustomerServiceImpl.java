package com.smartparking.smartparking.service;

import com.smartparking.smartparking.model.Customer;
import com.smartparking.smartparking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public String saveCustomer(Customer customer) {
        if (customerRepository.findByFullName(customer.getFullName()).isPresent()) {
            return "Customer already registered with this full name.";
        } else {
            customerRepository.save(customer);
            return "Customer registered successfully.";
        }
    }
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }
    @Override
    public Customer updateCustomer(Customer customer){
        return customerRepository.save(customer);
    }
    @Override
    public void delCustomer(Integer id){
        customerRepository.deleteById(id);
    }
}
