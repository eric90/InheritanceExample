package com.company;

/**
 * Created by ericfa on 5/29/17.
 */
public class BMW extends Car {
    private int roadService;

    public BMW(int roadService) {
        super("BMW", "Sedan", 4, 4, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate){
        int newVloc = getCurrentVlocity() + rate;
        if(newVloc == 0){
            stop();
            changeGear(1);
        } else if(newVloc >0 && newVloc <= 10) {
            changeGear(1);
        } else if(newVloc > 10 && newVloc <= 20) {
            changeGear(2);
        } else if(newVloc > 20 && newVloc <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(newVloc > 0){
            changeVeloc(newVloc, getCurrentDirection());
        }
    }
}
