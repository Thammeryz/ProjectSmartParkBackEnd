package com.smartparking.smartparking.controller;
import com.smartparking.smartparking.model.Parking;
import com.smartparking.smartparking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/park")
@CrossOrigin
public class ParkingController {
    @Autowired
    public ParkingService parkingService;

    @PostMapping("/add")
    public String saveParking(@RequestBody Parking parking){
        parkingService.saveParking(parking);
        return "Parking Successfully";
    }
    @GetMapping("/getpark")
    public List<Parking> getAllParking(Parking parking){
        return parkingService.getAllParking();
    }

    @PutMapping("/updatepark/{id}")
    public Parking updateParking(@PathVariable Integer id, @RequestBody  Parking parking){
        parking.setId(id);
        return parkingService.updateParking(parking);
    }
    @DeleteMapping("/delpark/{id}")
    public void delParking(@PathVariable Integer id){
        parkingService.delParking(id);
    }

}
