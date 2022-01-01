package com.company;

class car{
    String yearModel,make;
    int speed;
    // now we make constructer
    car(String yearModel,String make){
        yearModel= yearModel;
        make= make;
        speed = 0;
    }
    // now we create setter
    //getter create karne ko mana kiya h
//    toh uske bina hi print karna hoga ab


    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setYearModel(String yearModel) {
        this.yearModel = yearModel;
    }

    // now we create methods
    public int accelerate(){
        speed = speed +5;
        return speed;
    }

    public int brake(){
        speed = speed -5;
        return speed;
    }
}


public class q2 {
    public static void main(String[] args) {

        car honda = new car("model 123","maruti");
        // now we call acccelrate metjod five times

            honda.speed = 100;
        System.out.println("initial spped of honda  = "+honda.speed);
        for (int i = 0;i<5 ;i++){

            System.out.println(honda.accelerate());
        }


        for (int i = 0;i<5 ;i++){

            System.out.println(honda.brake());
        }

    }
}
