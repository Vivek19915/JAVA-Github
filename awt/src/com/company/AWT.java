package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//  ONE WAY BY  USING EXTENDS FUNCTION
class awtapp extends Frame {
//    uske badd pura processing code uske ander fucntion me hoga
//            therfore we are creating constructer
    public awtapp(){
        setBackground(Color.pink);
        setSize(400,200);
        setVisible(true);                     //isse vo visible ho jayega
        setTitle("My first GUI");              //use to set title bar

        // and window listener ka kaam h jo window bani h uspe kaam karna
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();     //use to activate close button
            }
        });
    }
}





//ONE MORE WAY OF CREATING CLASS WITHOUT USING EXTENDS
class awtapp2{
    // always note first you have to make constructer
    public awtapp2(){
        //now we use frame class we use it by making object of it
        Frame frame  = new Frame("My first GUI");
//        note jtne bhi objects bane ge vo ek ke nichhe ek banhege
//                aur inke beech me ek bhi processing code nhi aana chaiye

        Label label1 = new Label("hello everyone")   ;         //to add text in your but no  one can chage it use label class
        Button button1  =  new Button("click me");         // now we make object for button to use button class
        TextField textfiled1  =  new TextField();                 //this is use so that user can enter text in our progra

        textfiled1.setBounds(40 ,120,220,30);
        textfiled1.setBackground(Color.red);
        textfiled1.setForeground(Color.yellow);                  //foregrounfd is used to set color of text


        label1.setBounds(40,100,220,30);
        label1.setText("hello vivek");


        button1.setBounds(40,40,120,30);    //yaha hamne button1 ke bare me bata diya h


        frame.add(button1);                                      //now to add button in frame we use frame add button
        frame.add(label1);                                    //to add label
        frame.add(textfiled1);                                    //to add textfiled


        frame.setSize(400,300);
        frame.setLayout(null);    // take jo bhi ham dale vo pure layout par na aa jaye
        frame.setBackground(Color.green);
        frame.setVisible(true);

        // now to close window we use windows listener
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                frame.dispose();     // used to acticvateclose button
            }
        });
    }


}

public class AWT {
    public static void main(String[] args) {
        //	     now we have to create object to run program
//         new awtapp();
//         one way of making object
//         isme ye memory nhi leta h
//         or
//           isme memory leta h

//        awtapp vivek  =  new awtapp();

        awtapp2 amar  = new awtapp2();
    }
}
