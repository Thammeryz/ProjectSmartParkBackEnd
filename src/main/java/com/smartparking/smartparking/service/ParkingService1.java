package com.smartparking.smartparking.service;

import com.smartparking.smartparking.model.Customer;
import com.smartparking.smartparking.model.Parking;
import com.smartparking.smartparking.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingService1 implements ParkingService{
    @Autowired
    public ParkingRepository parkingRepository;

    @Override
    public Parking saveParking(Parking parking) {
        return parkingRepository.save(parking);
    }
    @Override
    public List<Parking> getAllParking(){
        return parkingRepository.findAll();
    }
    @Override
    public Parking updateParking(Parking parking){
        return parkingRepository.save(parking);
    }
    @Override
    public void delParking(Integer id){
        parkingRepository.deleteById(id);
    }
}
