package com.company;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        int n,count = 0;
        Scanner input =  new Scanner(System.in);
        n = input.nextInt();

        for (int i =2;i<n;i++){
            if (n%i==0){
                count ++;
            }
        }
        if (count>0){
            System.out.println("number is non prime");
        }else
            System.out.println("number is prime");
    }
}
