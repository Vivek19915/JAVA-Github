//Repeat problem 4 for computing greatest common divisor (GCD) and least common multiple (LCM) for
//        five integers entered from keyboard. (You should not use the concept of array).
package com.company;

import java.util.Scanner;

public class q5_gcd_lcm {
    public static int gcd(int a,int b){
            if (a==0)
            {
                return b; //then b will be gcd
            }
            if (b==0)
            {
                return a;//then a will be gcd
            }
            while (a!=b)
            {
                if (a>b)
                {
                    a=a-b;
                }
                if (b>a)
                {
                    b=b-a;
                }
            }
            return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int size = input.nextInt();
        System.out.println("enter elements");
        int []array  = new int[size];
        for (int i = 0;i<size;i++){
            array[i] = input.nextInt();
        }

        //now we code for problem
        int temp =0;
        for (int i=0;i<size;i++){
            temp = gcd(temp,array[i]);
        }
        System.out.println("gcd = "+ temp);
    }
}
