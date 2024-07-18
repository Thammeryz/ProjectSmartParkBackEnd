package com.smartparking.smartparking.service;

import com.smartparking.smartparking.model.Admin;
import com.smartparking.smartparking.model.Customer;
import com.smartparking.smartparking.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServicenew implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    //adim handleng
    public Optional<Admin> admin(String username, String password) {
        Optional<Admin> admin = adminRepository.findByUsername(username);
        if (admin.isPresent() && admin.get().getPassword().equals(password)) {
            return admin;
        }
        return Optional.empty();
    }

    @Override
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }
    @Override
    public Admin saveAdmin(Admin admin){
        return adminRepository.save(admin);
    }
}
