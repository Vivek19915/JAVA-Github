package com.company;

import java.util.Scanner;

class circle{
    double radius;
    double PI = 3.14159;
    //here are two constructors
    public circle(double radius) {
        this.radius = radius;
    }

    public circle() {
        radius = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area  = PI*radius*radius;
        return area;
    }

    // we can also put getradius instead of radius
    //both will work same
    public double getDiameter(){
        double diameter = 2*getRadius();
        return diameter;
    }
    public double getCircumference(){
        double circum = 2*PI*getRadius();
        return circum;
    }


}

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        circle circle_1 = new circle(input.nextDouble());

        System.out.println("Area = "+circle_1.getArea());
        System.out.println("Diameter = "+circle_1.getDiameter());
        System.out.println("Circumference  = "+ circle_1.getCircumference());

    }
}
