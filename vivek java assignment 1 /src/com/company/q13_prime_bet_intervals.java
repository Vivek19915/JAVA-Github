//Write a java program to display prime numbers between two intervals
package com.company;

import java.util.Scanner;

public class q13_prime_bet_intervals {

    public static void isprime(int num){
        //ye code check karega ki num prime h ya nhi

        int count =0;
        for (int i = 2;i<num;i++){
            if ((num%i)==0){
                count ++;
            }

        }
        if (count==0){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the intervals");
        int low = input.nextInt();
        int high = input.nextInt();
        for (int i = low;i<=high;i++)

            isprime(i) ;
    }


}

