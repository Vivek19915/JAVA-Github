//Write a java program to check whether a number is even or odd.
package com.company;
import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n%2 == 0){
            System.out.println("Given number is even");
        }else
            System.out.println("Given number is odd");
    }
}
