//Write a java program to display factors of a number.
//factors of any numbers are numbers which completely idvide the number
package com.company;
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        n = input.nextInt();
        System.out.print("factors of "+n +" are : ");
        for (int  i = 2 ; i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }

    }
}
