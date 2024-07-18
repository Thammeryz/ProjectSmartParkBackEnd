package com.smartparking.smartparking.service;

import com.smartparking.smartparking.model.Request;

import java.util.List;

public interface RequestService1 {
    public Request saveRequest(Request request);
    public List<Request> getAllRequest();
    public Request updateRequest(Request request);
    public void delRequest(Integer id);
}
