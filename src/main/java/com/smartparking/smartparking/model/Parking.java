package com.smartparking.smartparking.model;


import jakarta.persistence.*;

@Entity
@Table(name="parkingslot")
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String parkingName;
    private String location;
    private String noSlot;
    private String hours;
    private String price;

    public Parking() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getParkingName() {
        return parkingName;
    }

    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNoSlot() {
        return noSlot;
    }

    public void setNoSlot(String noSlot) {
        this.noSlot = noSlot;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
