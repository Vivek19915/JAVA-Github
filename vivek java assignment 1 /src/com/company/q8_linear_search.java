package com.company;

import java.util.Scanner;

public class q8_linear_search {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        size  = input.nextInt();
        int []array = new int[size];
        System.out.println("Enter the elements of array");
        for (int  i = 0;i<size;i++){
            array[i] = input.nextInt();
        }
        System.out.println("Enter the key");
        int key  = input.nextInt();
        for (int i = 0;i<size;i++){
            if (array[i]==key){
                System.out.println("kry is found");
            }
        }
    }
}
