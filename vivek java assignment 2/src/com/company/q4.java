//Get five integer numbers from the keyboard and check whether these numbers are prime.

package com.company;

import java.util.Scanner;

public class q4 {
    public static void primeNumber(int num){
        int count =0;
        if ( num==0 || num==1){
            count++;
        }
        for (int i =2;i<num ;i++){
            if (num%i==0 ){
                count++;
            }
        }
        if (count==0){
            System.out.println(num+" is a prime number");
        }
        else
            System.out.println(num+" is a non prime number");

    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter no of integers");
        int size = input.nextInt();
        int []array  = new int[size];
        System.out.println("enter elements ");
        for (int i=0;i<size;i++){
            array[i]= input.nextInt();
            primeNumber(array[i]);
        }
    }
}
