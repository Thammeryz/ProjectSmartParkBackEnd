package com.smartparking.smartparking.service;

import com.smartparking.smartparking.model.Admin;
import com.smartparking.smartparking.model.Customer;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    public Admin saveAdmin(Admin admin);
    Optional<Admin> admin(String username, String password);
    public List<Admin> getAllAdmin();
}
