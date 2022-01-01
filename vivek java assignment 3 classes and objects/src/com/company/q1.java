package com.company;

//class ame uses camelCase form

class employee{
   String name,department,position;
   int id_number;

    //now we create constructors
    //not constructer name is a method in class with name same as that of class

    //constructor -1
    employee(String name,String department,String position,int id_number){
        name =  name;
        department = department;
        position = position;
        id_number = id_number;
    }

    //constructer -2
    employee(String name,int id_number){
        name = name;
        id_number = id_number;
        position = "";
        department = "";
    }

    //constructer -3
    employee(){
        name  = "";
        id_number =0;
        department = "";
        position = "";
    }
    //now we create mutater and accsor
    //these are getter and setter


    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId_number() {
        return id_number;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
}
public class q1 {
    public static void main(String[] args) {
        //now we ceate  objects and diaplay data
        // for question

        //here we use contructer -1 fro first employee
        // and fill all the fiels
        employee Susan = new employee("Susan meyers","Accounting","Vice president",47899);


        //now we use contructer -2 for second employee
        employee mark = new employee("Mark Jones",31119);
        //we can set other fileds by 2 method first by normal and secnd by using settter
        mark.position = "IT";
        mark.setDepartment("programmer");

        //now we define employee -3
        employee joy = new employee();
        joy.setPosition("Engineer");
        joy.setDepartment("manufacturing");
        joy.setName("joy");
        joy.setId_number(81774);



        //now its time to print all details
        System.out.println("details of employee 1");
        System.out.println("Employee name ="+ Susan.getName());
        System.out.println("Employee position ="+ Susan.getPosition());
        System.out.println("Employee department ="+ Susan.getDepartment());
        System.out.println("Employee id number ="+ Susan.getId_number());
        System.out.println();
        System.out.println();

        System.out.println("details of employee 2");
        System.out.println("Employee name ="+ mark.getName());
        System.out.println("Employee position ="+ mark.getPosition());
        System.out.println("Employee department ="+ mark.getDepartment());
        System.out.println("Employee id number ="+ mark.getId_number());
        System.out.println();
        System.out.println();

        System.out.println("details of employee 1");
        System.out.println("Employee name ="+ joy.getName());
        System.out.println("Employee position ="+ joy.getPosition());
        System.out.println("Employee department ="+ joy.getDepartment());
        System.out.println("Employee id number ="+ joy.getId_number());
        
    }
}

