package com.driver;

public class Vehicle {

//    Vehicle: name, currentSpeed, currentDirection
//
//    constructor: given the name of the vehicle, initialize speed and direction as 0.
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
            this.name = name;
            this.currentSpeed = 0;
            this.currentDirection = 0;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        this.currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    //    move(speed, direction): set the current speed and direction
    //    steer(direction): Add direction to the currentDirection
    //    stop(): Stop the car by setting current speed to 0
    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        this.currentDirection = direction;
        this.currentSpeed = speed;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
