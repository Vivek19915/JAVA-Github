//Write a java program to count number of digits in an integer.
package com.company;
import java.util.Scanner;
public class q16 {
    public static void main(String[] args) {
        int n ,count = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0;n!=0;i++){
            n=n/10;
            count ++;
        }
        System.out.println("number of digits in number");
        System.out.println(count);
    }
}
