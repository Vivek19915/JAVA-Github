//fibonacci series

package com.company;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        int n;
        Scanner input =  new Scanner(System.in);
        n = input.nextInt();
        int a=0,b=1;
        for (int i =0;i<n;i++){
            int nextnumber =  a+b;
            a=b;
            b=nextnumber;
            System.out.println(nextnumber + " ");
        }
    }
}
