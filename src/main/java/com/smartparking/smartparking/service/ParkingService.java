package com.smartparking.smartparking.service;

import com.smartparking.smartparking.model.Customer;
import com.smartparking.smartparking.model.Parking;

import java.util.List;

public interface ParkingService {
    public Parking saveParking(Parking parking);
    public List<Parking> getAllParking();
    public Parking updateParking(Parking parking);
    public void delParking(Integer id);

}
