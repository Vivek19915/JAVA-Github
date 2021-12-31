//Write a java program to find GCD of two numbers.

package com.company;

import java.util.Scanner;

public class q7_gcd {
    //here we make method[function] of gcd
    public static int gcd(int a,int b){
        //here we done it by recurssion
        if (a==0){
            return b;
        }
        if (b==0){
            return a;
        }if (a>b) {
            return gcd(a - b, b);
        }
        else
            return gcd(a,b-a);
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner input =  new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(gcd(a,b));

    }
}
