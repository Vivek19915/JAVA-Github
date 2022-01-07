package com.company;
// now we import farame class so  that we can make frame for our app
import java.awt.*;

// now we extends our main class to use class frame
//and its fucntion
//public class Main extends Frame {
//    // now we make constructer of main
//    public Main(){
//        //now we create frame here
//        setSize(400,200);  //here we ste size of our frame
//        setVisible(true); //  mtlb ab aona frame visible rahega
//
//    }



    //ONE MORE WAY TO USE FRAME CLASS WITHOUT EXTENDS IT
public class Main {
        //HERE WE MAKE ONJECT OF FRAME
        public Main() {
            Frame frame = new Frame("My first GUI");
            frame.setSize(400,200);

        }




    public static void main(String[] args) {
//	     now we have to create object to run program
//         new Main();
//         one way of making object
//         isme ye memory nhi leta h
//         or
//           isme memory leta h

         Main vivek  =  new Main();


    }
}
