package com.company;

import java.util.Scanner;

class payRoll{
    String name;
    int id_number,hourly_pay,hours_worked;

    public int getHourly_pay() {
        return hourly_pay;
    }

    public void setHourly_pay(int hourly_pay) {
        this.hourly_pay = hourly_pay;
    }

    public int getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }

    public payRoll(String name, int id_number) {
        this.name = name;
        this.id_number = id_number;
    }

    // grosspay method
    public int Grosspay(){
        return hours_worked*hourly_pay;
    }
}



public class q4 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter employee 1 name");
        String name = input.nextLine();
        System.out.println("Enter employee 1 id number ");
        int id_number  = input.nextInt();

        payRoll employee_1 = new payRoll(name,id_number);

        System.out.println("Enter employee 1 hourley pay ");

        //now this will take input like this
        //THIS IS VVVIMP
        employee_1.setHourly_pay(input.nextInt());

        System.out.println("Enter employee 1 hours worked ");
        employee_1.setHours_worked(input.nextInt());

        System.out.print("gross pay =");
        System.out.println(employee_1.Grosspay());
    }
}
