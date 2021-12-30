//You are required to compute perimeter of a rectangle where length and breadth are
//        taken as float and double respectively from the keyboard. Consider length and breadth as integer while
//        computing its perimeter and computed perimeter is displayed as double.
package com.company;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        float length = input.nextFloat();

        System.out.println("Enter the breadth of rectangle");
        double breadth = input.nextDouble();

        //here we type cast length and breadth in int
        //length and breadth as integer while
        ////        computing its perimeter
        double perimeter  =  (int)length + (int)breadth;

        //and here perimeter will print as double
        System.out.println("perimeter = "+ perimeter);
    }
}
