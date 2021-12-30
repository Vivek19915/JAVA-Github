//Get five integer numbers from the keyboard and check whether these numbers are prime.

package com.company;

import java.util.Scanner;

public class q4 {
    public static int primeNumber(int num){
        
    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = input.nextInt();
        int []array  = new int[size];
        System.out.println("enter elements on array");
        for (int i=0;i<size;i++){
            array[i]= input.nextInt();
        }
    }
}
