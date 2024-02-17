package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, isManual);
        //Use arbitrary values for parameters which are not mentioned
    }
//    F1: extends Car
//
//    accelerate(rate): add rate to the current speed and change the gear accordingly
    public void accelerate(int rate){
        int speed = getCurrentSpeed() + rate;
//        setCurrentSpeed(speed);
        int newSpeed  = speed; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed >= 0 && newSpeed<51) {
            //Stop the car, set gear as 1
            changeGear(1);
        }
         if(newSpeed >= 51 && newSpeed<=100) {
            //Stop the car, set gear as 1
            changeGear(2);
        }
         if(newSpeed >= 101 && newSpeed<151) {
            //Stop the car, set gear as 1
            changeGear(3);
        }
         if(newSpeed >= 151 && newSpeed<201) {
            //Stop the car, set gear as 1
            changeGear(4);
        }
         if(newSpeed >= 201 && newSpeed<251) {
            //Stop the car, set gear as 1
            changeGear(5);
        }
         if(newSpeed > 250) {
            //Stop the car, set gear as 1
            changeGear(6);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
