package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class calculator_processing{
    //CONSTRUCTOR
    public calculator_processing(){
        Frame frame = new Frame("CALCULATOR");
        Label label1 = new Label("My calculator");
        Button button1  = new Button("calculate");


        button1.setBounds(20,40,100,30);










        frame.add(button1);
        frame.add(label1);
        frame.setSize(450,300);
        frame.setBackground(Color.lightGray);
        frame.setVisible(true);
        frame.setLayout(null);
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
