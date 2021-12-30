//You are required to maintain your own record that includes your name, father’s name, date of birth, age
//        (computed with respect to the current date). The age includes years, months and days. You are required to
//        show your record on the display screen such as: for displaying your name, it should display like “Name of the
//        student:” followed by its value. Display of each entity should starts with new line. Use scannerclass for getting
//        the input from keyboard.
package com.company;
import java.util.Scanner;

class Details{
    String name,father_name,dob;
    int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public String getFather_name() {
        return father_name;
    }

    public String getName() {
        return name;
    }
}

public class q1 {
    public static void main(String[] args) {
        //here we make object vivek
        Details vivek = new Details();
        System.out.println("details of student 1:-");
        vivek.setDob("28/07/2001");
        vivek.setAge(20);
        vivek.setName("Vivek");
        vivek.setFather_name("Prem Narayan");

        //now we print details of object vivek
        System.out.println("name of student = "+vivek.getName());
        System.out.println("age =" +vivek.getAge());
        System.out.println("Dob ="+vivek.getDob());
        System.out.println("father name ="+vivek.getFather_name());

        System.out.println();
        System.out.println();
        System.out.println();
        //now we make one more object ayush
        Details ayush  = new Details();
        System.out.println("details of student 2 :-");
        ayush.setFather_name("Prem Narayan");
        ayush.setName("Ayush");
        ayush.setAge(12);
        ayush.setDob("2004");

        //now we print details of ayush
        System.out.println("name of student = "+ayush.getName());
        System.out.println("age =" +ayush.getAge());
        System.out.println("Dob ="+ayush.getDob());
        System.out.println("father name ="+ayush.getFather_name());



    }
}
