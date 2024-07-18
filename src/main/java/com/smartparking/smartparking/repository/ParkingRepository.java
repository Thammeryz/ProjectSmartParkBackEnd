package com.smartparking.smartparking.repository;

import com.smartparking.smartparking.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking,Integer> {
}
