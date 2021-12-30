////Repeat the problem 6 with the use of switch control statement.
package com.company;
import java.util.Scanner;
public class q7 {
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
        for (int i = 0 ;i<sub;i++){
            int b = names[i]/10;
            switch (b){
                case 10:
                    System.out.println("subject " + (i + 1) + ": A+");
                    break;
                case 9:
                    System.out.println("subject " + (i + 1) + ": A+");
                    break;
                case 8:
                    System.out.println("subject " + (i + 1) + ": A");
                    break;
                case 7:
                    System.out.println("subject " + (i + 1) + ": B+");
                    break;
                case 6:
                    System.out.println("subject " + (i + 1) + ": B");
                    break;
                case 5:
                    System.out.println("subject " + (i + 1) + ": C+");
                    break;
                case 4:
                    System.out.println("subject " + (i + 1) + ": C");
                    break;
                default:
                    System.out.println("fail");
            }

        }
        }
    }
