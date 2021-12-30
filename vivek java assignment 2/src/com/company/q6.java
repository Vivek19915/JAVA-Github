//You are required to convert your marks evaluated out of 100 to the corresponding grades, as used in
//        MNNIT Allahabad, with the use of if-else control statement only.
package com.company;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        int sub;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        sub = input.nextInt();
        int[] names = new int[sub];
        for (int i = 0; i < sub; i++) {
            System.out.println("enter the marks of subject " + (i + 1));
            names[i] = input.nextInt();
        }
        for (int i = 0; i < sub; i++) {
            if (names[i] >= 85) {
                System.out.println("subject " + (i + 1) + ": A+");
            }
            if (names[i]>=75 && names[i]<85) {
                System.out.println("subject " + (i + 1) + ": A");
            }
            if (names[i]>=65 && names[i]<75) {
                System.out.println("subject " + (i + 1) + ": B+");
            }
            if (names[i]>=55 && names[i]<65) {
                System.out.println("subject " + (i + 1) + ": B");
            }
            if (names[i]>=45 && names[i]<55) {
                System.out.println("subject " + (i + 1) + ": C+");
            }
            if (names[i]<45) {
                System.out.println("subject " + (i + 1) + ": C");
            }
        }
    }
}