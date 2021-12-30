//palindrome or not
package com.company;
import java.util.Scanner;
import java.lang.Boolean;
public class q6 {
    public static void main(String[] args) {
        int n,digits;
        int a ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        n  = input.nextInt();
        System.out.println("enter no of digits in it ");
        digits = input.nextInt();
        int []array = new int[digits];

        //here we get seperate diguts in array
        for (int i = 0;n!=0;i++){
            int temp  = n%10;
            n = n/10;
            array[i] = temp;
        }
        //here we compare digits
        for (int i = 0;i<digits/2;i++){
            if (array[i]==array[digits-i]){
                //mtlb last and first digits same h
                a= 1;
            }else
                a=0;
        }

        if (true){
            System.out.println("number is palindrome");
        }else
            System.out.println("number is not palindrome");



    }
}
