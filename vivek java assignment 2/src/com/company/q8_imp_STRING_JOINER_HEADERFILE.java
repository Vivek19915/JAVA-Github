//There are two monkeys whose states are one of two available (smiling and not smiling).
//        The monkeys will be dangerous in either both are smiling or not. Compute the
//        dangerous status of monkeys.
package com.company;
import java.util.Scanner;

///this is important in thia question
import java.util.StringJoiner;


public class q8_imp_STRING_JOINER_HEADERFILE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String input1 ,input2;
        System.out.println("Enter the state of first monkey (smiling and not smiling)");
        String input1 = input.nextLine();
//        System.out.println(input1);
        System.out.println("Enter the state of second monkey (smiling and not smiling)");
        String input2= input.nextLine();
//
        if (input1.equals(input2)){
            System.out.println("not dangerous");
        }
        else{
            System.out.println("dangerous");
        }
    }
}
