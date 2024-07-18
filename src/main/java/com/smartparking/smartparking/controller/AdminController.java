package com.smartparking.smartparking.controller;


import com.smartparking.smartparking.model.Admin;
import com.smartparking.smartparking.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminService adminService;
    
@PostMapping("/login")
public ResponseEntity<String> login(@RequestBody Admin admin) {
    System.out.println("Received login request: " + admin);
    Optional<Admin> foundAdmin = adminService.admin(admin.getUsername(), admin.getPassword());
    return foundAdmin.isPresent() ? ResponseEntity.ok("Login Successful") : ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
}
    @PostMapping("/add")
    public String saveAdmin(@RequestBody Admin admin){
        adminService.saveAdmin(admin);
        return "Admin added successful";
    }
    @GetMapping("/getAdmin")
    public List<Admin> getAllAdmin(Admin admin){
        return adminService.getAllAdmin();
    }

}
