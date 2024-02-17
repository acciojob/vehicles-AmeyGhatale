package com.driver;

public class Boat implements WaterVehicle{

//    Boat: implements WaterVehicle interface
//
//    Has following member variables: a. name : of String type b. capacity : of int type
//    Return name and capacity in getVehicleName and getVehicleCapacity respectively.

    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
