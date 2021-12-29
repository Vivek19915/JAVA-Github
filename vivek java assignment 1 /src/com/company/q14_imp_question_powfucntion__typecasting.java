//Write a java program to check whether a number is Armstrong number or not.
package com.company;
//here we use pow function
import java.lang.Math;
import java.util.Scanner;

public class q14_imp_question_powfucntion__typecasting {
    public static void main(String[] args) {
        int num;

        double armstrong = 0,remainder;
        Scanner input  = new Scanner(System.in);
        num = input.nextInt();
//        System.out.println(num);
        for (int i  =0;num>0;i++){
            remainder  = num%10;
            num= num/10;
            armstrong = armstrong + Math.pow(remainder,3);
            System.out.println(armstrong);
        }

//        here we done type casting beacuse we are comparing int with double
        int temp  = (int)armstrong;
        System.out.println(temp);
        if(num == temp){
            System.out.println("number is armstrong");
        }
    }
}
