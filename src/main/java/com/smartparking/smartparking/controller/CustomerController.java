package com.smartparking.smartparking.controller;

import com.smartparking.smartparking.model.Customer;
import com.smartparking.smartparking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/parking")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public String saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return "Customer added successful";
    }

    @GetMapping("/getCustomer")
    public List<Customer> getAllCustomer(Customer customer){
        return customerService.getAllCustomer();
    }
    @PutMapping("/update/{id}")
    public Customer updateCustomer(@PathVariable Integer id,@RequestBody Customer customer){
        customer.setId(id);
        return customerService.updateCustomer(customer);
    }
    @DeleteMapping("/del/{id}")
    public void delCustomer(@PathVariable Integer id){
        customerService.delCustomer(id);
    }
}
