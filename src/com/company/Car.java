package com.company;

/**
 * Created by ericfa on 5/29/17.
 */
public class Car extends Vehicle{
    private int doors;
    private int wheels;
    private int gear;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int doors, int wheels, int gear, boolean isManual) {
        super(name, size);
        this.doors = doors;
        this.wheels = wheels;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear(): changed to " + this.currentGear);
    }

    public void changeVeloc(int speed, int direction){
        move(speed, direction);
        System.out.println("car.changevloc: "+ speed + " direction " + direction);
    }



}
