package com.company;

import java.util.Scanner;

class monthDay{
    int month,year;

    public monthDay(int month, int year) {
        this.month = month;
        this.year = year;
    }
    public int Getnoofdays(){
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ){
            return 31 ;
        }if (month==2){
            //now leap year bhi ho sakta h toh uske liye code
            if ((year%100 ==0 && year%400==0) || (year%100!=0 && year%4 ==0)){
                //this is condtion for leap year
                return 29;
            }
            else
                return 28;
        }
        else
            return 30;

    }
}

public class q7 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("enter month(1-12) an year ");
        monthDay vivek = new monthDay(input.nextInt(),input.nextInt());
        System.out.println("days  = "+vivek.Getnoofdays());

    }
}
