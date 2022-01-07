package com.company;

import java.awt.*;
import java.awt.event.*;

public class by_shialendra {
    public static void main(String[] args) {
        Frame frameCal =new Frame("Calculator");
        //text field to take input
        TextField firstText =new TextField(5);
        TextField secondText =new TextField(5);
        TextField outputText =new TextField(5);

        //button for +,-,*,/
        Button plusBtn =new Button("+");
        Button minusBtn =new Button("-");
        Button multiplyBtn =new Button("*");
        Button divideBtn =new Button("/");
        Button clearBtn =new Button("C");


        //adding button and text field to frame component
        frameCal.add(firstText);
        frameCal.add(secondText);
        frameCal.add(outputText);
        frameCal.add(plusBtn);
        frameCal.add(minusBtn);
        frameCal.add(multiplyBtn);
        frameCal.add(divideBtn);
        frameCal.add(clearBtn);
        frameCal.setLayout(new FlowLayout());
        frameCal.setSize(240,300);
        frameCal.setVisible(true);
//
//       firstText.setBounds(2,5,10,10);
//       secondText.setBounds(14,5,10,10);
//        plusBtn.setBounds(2,17,5,5);
//        minusBtn.setBounds(10,17,5,5);
//        divideBtn.setBounds(17,17,5,5);
//        minusBtn.setBounds(24,17,5,5);
//        clearBtn.setBounds(31,17,5,5);
//        outputText.setBounds(2,20,10,10);

        //first text And second text
        firstText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstText.setText(firstText.getText());
            }
        });

        secondText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondText.setText(secondText.getText());
            }
        });


        //when plus button clicked
        plusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(firstText.getText());
                int num2 =Integer.parseInt(secondText.getText().toString());
                int sum=num1+num2;
                outputText.setText(Integer.toString(sum));
                outputText.getText();
            }
        });


        // when Minus button clicked
        minusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(firstText.getText());
                int num2 =Integer.parseInt(secondText.getText().toString());
                int minus=num1-num2;
                outputText.setText(Integer.toString(minus));
                outputText.getText();
            }
        });

        //when multiply button clicked
        multiplyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(firstText.getText());
                int num2 =Integer.parseInt(secondText.getText().toString());
                int mul=num1*num2;
                outputText.setText(Integer.toString(mul));
                outputText.getText();
            }
        });

        //Division event listener
        divideBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(firstText.getText());
                double num2 =Double.parseDouble(secondText.getText().toString());
                double divide=num1/num2;
                outputText.setText(Double.toString(divide));
                outputText.getText();
            }
        });
// on clicking clear button
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstText.setText("");
                secondText.setText("");
                outputText.setText("");
            }
        });
        frameCal.setLayout(null);





    }
}
