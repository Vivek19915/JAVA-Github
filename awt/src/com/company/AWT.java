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
        frame.setSize(400,200);
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

        awtapp vivek  =  new awtapp();

        awtapp2 amar  = new awtapp2();
    }
}
