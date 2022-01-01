//Write a java program to check whether a number can be expressed as sum of
//        two prime numbers.

package com.company;

import java.util.Scanner;

public class q12_sum_of_two_prime_numbers {

    public static boolean isPrime(int num){
        //ye code check karega ki num prime h ya nhi

       int count =0;
        for (int i = 2;i<num;i++){
            if ((num%i)==0){
                count++;
            }

        }
        if (count>0) {
            return false;
        }
        else
            return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no that you want to check as a sum of two number");
        int num = input.nextInt();
        for (int i=2;i<num;i++){
            if (isPrime(i)){
                //kyuki ager i bhi prime huaa toh hum
                // res ko cjeck karege ki vo prime h ya nhi
                int res  = num-i;
                if (isPrime(res)){
                    //aur agr res bhi prime nikala
                    //toh hamri cond sahi h aur hamra logic kaam ar gaya
                    System.out.println("yes");
                    System.out.println(num+" = " + i +" + "+ res);
                }
            }
        }

    }
}
