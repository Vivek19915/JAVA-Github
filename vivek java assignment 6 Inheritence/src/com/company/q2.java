package com.company;

import java.util.Scanner;

class course{
    protected  int code,credit;
    protected String name;
    // to take input we need getter and setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// now we use inheritance to use above class
class ugCourse extends course{

    //and to display code we make another method here
    public void Displaycode(){
        System.out.println("UG-"+getCode());
    }
}

// now we use inheritance to use above class
class pgCourse extends course{

    //and to display code we make another method here
    public void Displaycode(){
        System.out.println("PG-"+getCode());
    }
}

public class q2 {
    public static void main(String[] args) {
        ugCourse  vivek =  new ugCourse();
        System.out.println("set details of ug student ");
        Scanner input  =  new Scanner(System.in);

        System.out.println("name of UG student = ");
        vivek.setName(input.next());

        System.out.println("Code of UG Subject = ");
        vivek.setCode(input.nextInt());

        System.out.println("Credit of UG student = ");
        vivek.setCredit(input.nextInt());



        pgCourse  tarun =  new pgCourse();
        System.out.println("set details of PG student ");
        System.out.println("name of PG student = ");
        tarun.setName(input.next());


        System.out.println("Code of PG Subject = ");
        tarun.setCode(input.nextInt());

        System.out.println("Credit of PG student = ");
        tarun.setCredit(input.nextInt());

        //now printing detials of vivek
        System.out.println("Student name = "+vivek.getName());
        System.out.println("Student credit = "+vivek.getCredit());
        //now we use inheritance to display ug course
        vivek.Displaycode();

        //now printing detials of tarun
        System.out.println("Student name = "+tarun.getName());
        System.out.println("Student credit = "+tarun.getCredit());
        //now we use inheritance to display ug course
        System.out.println("Course code  = PG-"+tarun.getCode());




    }
}
