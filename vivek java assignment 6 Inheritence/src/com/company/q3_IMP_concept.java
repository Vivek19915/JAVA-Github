package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

class payment{
    protected String paymentID;
    // no we make contructer of
//    empty arugument taki agr kisi ko user se input lena ho te getter
//    aur setter se le paye
    public payment(){

    }
    // here constructer by using arugument
    public payment(String paymentID) {
        this.paymentID = paymentID;
    }

    //now we set setter and getter

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentID() {
        return paymentID;
    }
}

//// NOW WE DO HEARCHIAL INHERIRANCE////

class paymentDD extends payment{
    protected String payments_DD;
    //now setter for payment


    public void setPayments_DD(String payments_DD) {
        this.payments_DD = payments_DD;
    }

    public void setPayments_details(String payments_DD) {
        this.payments_DD = payments_DD;
    }
}

class paymentUPI extends payment{
    protected String payments_UPI;
    //now setter for payment

    public String getPayments_details() {
        return payments_UPI;
    }

    public void setPayments_details(String payments_UPI) {
        this.payments_UPI = payments_UPI;
    }
}

class paymentNB extends payment{
    protected String payment_NB;

    public String getPayment_NB() {
        return payment_NB;
    }

    public void setPayment_NB(String payment_NB) {
        this.payment_NB = payment_NB;
    }
}

public class q3_IMP_concept {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //lets see by using UPI class
        paymentUPI vivek = new paymentUPI();
        System.out.println("Enter payment ID");
        vivek.setPaymentID(input.next());
        System.out.println("Enter bank name ");
        vivek.setPayments_details(input.next());

        //now printing details
        System.out.println(vivek.getPaymentID());
        System.out.println(vivek.getPayments_details());

    }
}
