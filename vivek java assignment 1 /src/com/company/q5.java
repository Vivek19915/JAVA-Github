package com.company;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        for (int i = 1;i<=6;i++){
            for (int j=0; j<i && i<=6;j++){
                System.out.print("*");
            }System.out.println();
        }
        for (int i =6 ;i<11;i++){
            for (int j = 11-i; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
