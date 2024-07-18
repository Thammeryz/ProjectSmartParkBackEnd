package com.smartparking.smartparking.service;

import com.smartparking.smartparking.model.Request;
import com.smartparking.smartparking.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService implements RequestService1{
    @Autowired
    public RequestRepository requestRepository;
    @Override
    public Request saveRequest(Request request) {
        return requestRepository.save(request);
    }
    @Override
    public List<Request> getAllRequest(){
        return requestRepository.findAll();
    }
    @Override
    public Request updateRequest(Request request){
        return requestRepository.save(request);
    }
    @Override
    public void delRequest(Integer id){
        requestRepository.deleteById(id);
    }
}
