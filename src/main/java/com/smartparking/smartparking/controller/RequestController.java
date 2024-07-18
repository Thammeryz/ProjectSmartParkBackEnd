package com.smartparking.smartparking.controller;

import com.smartparking.smartparking.model.Request;
import com.smartparking.smartparking.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/request")
public class RequestController {
    @Autowired
    public RequestService requestService;

    @PostMapping("/add")
    public String saveRequest(@RequestBody Request request) {
        requestService.saveRequest(request);
        return "Parking Successfully";
    }
    @GetMapping("/getrequest")
    public List<Request> getAllParking(Request request){
        return requestService.getAllRequest();
    }

    @PutMapping("/updaterequest/{id}")
    public Request updateRequest(@PathVariable Integer id, @RequestBody  Request request){
        request.setId(id);
        return requestService.updateRequest(request);
    }
    @DeleteMapping("/del/{id}")
    public void delRequest(@PathVariable Integer id){
        requestService.delRequest(id);
    }
}
