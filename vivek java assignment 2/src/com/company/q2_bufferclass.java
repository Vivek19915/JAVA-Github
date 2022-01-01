package com.company;
import java.io.*;
public class q2_bufferclass {
    public static void main(String[] args)throws IOException {
        //now we make object of buffer class
        BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
        //now in buffer reader class readline is functio to take string as a input
        // now we use it
        //name ,fathername,dob,age
        int age ;
        String name,fathername,dob;
        System.out.println("enter name of student");
        //now name we take input as string
        name = input.readLine();
        fathername  = input.readLine();;
        dob = input.readLine();
        age = Integer.parseInt(input.readLine());

        System.out.println(name);
        System.out.println(fathername);
        System.out.println(age);
        System.out.println(dob);
    }
}
