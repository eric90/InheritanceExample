package com.company;

/**
 * Created by ericfa on 5/29/17.
 */
public class Vehicle {

    private String name;
    private String size;

    private int currentVlocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVlocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("vehicle.steer steering out" + currentDirection +" degrees");
    }

    public void move(int velocity, int direction){
        currentVlocity = velocity;
        currentDirection = direction;
        System.out.println("vehicle.move() called");

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVlocity() {
        return currentVlocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVlocity = 0;
    }
}

