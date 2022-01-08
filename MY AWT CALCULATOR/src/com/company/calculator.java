package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class calculator_processing{
    //CONSTRUCTOR
    public calculator_processing(){
        Frame frame = new Frame("CALCULATOR");
        Label label1 = new Label("My calculator");
        Label label2 = new Label("First value");
        Label label3 = new Label("Second value");
        Label label4 = new Label("Operation");
        Label label5 = new Label("ANSWER");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();


//        Button button1  = new Button("calculate");
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply =  new Button("*");
        Button divide  =  new Button("/");


//        button1.setBounds(200,240,70,20);

        //NOTE ACTION LISTENER ARE ONLY APPLCABLE ON BUTTONS
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1  = Integer.parseInt(textField1.getText());   //HERE WE CONVERT STRING TO INT
                int num2 = Integer.parseInt(textField2.getText());      //HERE WE CONVERT STRING TO INT
                int z = num1-num2;                   //HERE OUR OPERATION WORKS OUT

                textField3.setText(Integer.toString(z));     //HERE WE CONEVERT OUR INTO TO STRING
                textField3.getText();                       //here we print our output
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1  = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int z = num1*num2;

                textField3.setText(Integer.toString(z));
                textField3.getText();
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1  = Integer.parseInt(textField1.getText());
                double num2 = Integer.parseInt(textField2.getText());
                double z = num1/num2;

                textField3.setText(Double.toString(z));
                textField3.getText();
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1  = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int z = num1+num2;

                textField3.setText(Integer.toString(z));
                textField3.getText();
            }
        });

//        button1.setBounds(20,40,100,30);
        label1.setBounds(180,30,220,30);
        label2.setBounds(40,90,100,20);
        label3.setBounds(40,130,100,20);
        label4.setBounds(40,170,100,20);
        label5.setBounds(40,210,100,20);

        textField1.setBounds(200,90,200,20);
        textField2.setBounds(200,130,200,20);
        textField3.setBounds(200,210,200,20);


        plus.setBounds(200,170,20,20);
        minus.setBounds(240,170,20,20);
        multiply.setBounds(280,170,20,20);
        divide.setBounds(320,170,20,20);





//        frame.add(button1);
        frame.add(plus);
        frame.add(minus);
        frame.add(multiply);
        frame.add(divide);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);



        frame.setSize(450,300);
        frame.setLayout(null);
        frame.setBackground(Color.lightGray);
        frame.setVisible(true);
        ;
        //to close app
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });




    }







}




public class calculator {
    public static void main(String[] args) {

        calculator_processing vivek = new calculator_processing();

    }
}
