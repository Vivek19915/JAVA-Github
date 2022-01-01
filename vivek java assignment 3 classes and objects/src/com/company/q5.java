package com.company;

import java.util.Scanner;

class testScore{
    int test1,test2,test3;

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public int getTest3() {
        return test3;
    }

    public void setTest3(int test3) {
        this.test3 = test3;
    }

    public testScore(int test1, int test2, int test3) {
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }
    public int Averagemarks(){
        int avg  = (test1+test2+test3)/3;
        return avg;
    }

}

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks of three test");

        //best way to take input direct as argument 😀😀😀😀
        testScore student_1 = new testScore( input.nextInt(), input.nextInt(), input.nextInt());

        System.out.print("avg marks =");
        System.out.println(student_1.Averagemarks());



    }
}
