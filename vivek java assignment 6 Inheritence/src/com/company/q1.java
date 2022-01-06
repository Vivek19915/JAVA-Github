package com.company;


class Student {
    //Make each attribute protected:-
//    means sare variables samne protected laga jo

   protected String name, fatherName, currentAddress, permanentAddress, phoneNumber, emailID;
    protected int regNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public Student() {
    }

    public Student(String name, String fatherName, String currentAddress, String premanentAddress, String phoneNumber, String emailID, int regNo) {
        this.name = name;
        this.fatherName = fatherName;
        this.currentAddress = currentAddress;
        this.permanentAddress = premanentAddress;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
        this.regNo = regNo;
    }
}

class UGStudent extends Student {
    String pastDegree;
    int marks;

    public UGStudent(String pastDegree, int marks) {
        this.pastDegree = pastDegree;
        this.marks = marks;
    }

    public String getPastDegree() {
        return pastDegree;
    }

    public void setPastDegree(String pastDegree) {
        this.pastDegree = pastDegree;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public UGStudent() {
    }
}

class PGStudent extends Student {
    String pastDegree;
    int marks;

    public PGStudent(String pastDegree, int marks) {
        this.pastDegree = pastDegree;
        this.marks = marks;
    }

    public String getPastDegree() {
        return pastDegree;

    }

    public void setPastDegree(String pastDegree) {
        this.pastDegree = pastDegree;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public PGStudent() {
    }
}

class PHDStudent extends Student {
    String pastDegree;

    int marks;

    public PHDStudent(String pastDegree, int marks) {
        this.pastDegree = pastDegree;
        this.marks = marks;
    }

    public String getPastDegree() {
        return pastDegree;
    }

    public void setPastDegree(String pastDegree) {
        this.pastDegree = pastDegree;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {

        this.marks = marks;
    }

    public PHDStudent() {
    }
}

public class q1 {
    public static void main(String[] args) {
        UGStudent s1 = new UGStudent();
        s1.setName("Vivek Choudhary");
        s1.setRegNo(20204234);
        s1.setFatherName("Prem Narayan");
        s1.setCurrentAddress("Ujjain");
        s1.setPermanentAddress("Ujjain");
        s1.setEmailID("vivek@gmail.com");
        s1.setPhoneNumber("9516046427");
        s1.setPastDegree("12th");
        s1.setMarks(94);
        ;
        System.out.println("Name : " + s1.getName());
        System.out.println("RegNo : " + s1.getRegNo());
        System.out.println("Father Name : " + s1.getFatherName());

        System.out.println("Current Address : " + s1.getCurrentAddress());
        System.out.println("Permanent Address : " + s1.getPermanentAddress());
        System.out.println("Email ID : " + s1.getEmailID());
        System.out.println("Phone Number : " + s1.getPhoneNumber());
        System.out.println("Past Degree : " + s1.getPastDegree());
        System.out.println("Marks : " + s1.getMarks());
        System.out.println();
        PGStudent s2 = new PGStudent();
        s2.setName("tarun ");
        s2.setRegNo(2001529);
        s2.setFatherName("umesh ");
        s2.setCurrentAddress("Ujjain");
        s2.setPermanentAddress("mp");
        s2.setEmailID("tarun125@gmail.com");
        s2.setPhoneNumber("95712342617");
        s2.setPastDegree("Btech");
        s2.setMarks(92);
        System.out.println("Name : " + s2.getName());
        System.out.println("RegNo : " + s2.getRegNo());
        System.out.println("Father Name : " + s2.getFatherName());
        System.out.println("Current Address : " + s2.getCurrentAddress());
        System.out.println("Permanent Address : " + s2.getPermanentAddress());
        System.out.println("Email ID : " + s2.getEmailID());
        System.out.println("Phone Number : " + s2.getPhoneNumber());
        System.out.println("Past Degree : " + s2.getPastDegree());
        System.out.println("Marks : " + s2.getMarks());
        System.out.println();
        PHDStudent s3 = new PHDStudent();
        s3.setName("rohit");
        s3.setRegNo(2003343);
        s3.setFatherName("shyam");
        s3.setCurrentAddress("MNNIT");
        s3.setPermanentAddress("jaipur");
        s3.setEmailID("roh@gmail.com");
        s3.setPhoneNumber("98765432562");
        s3.setPastDegree("btech");
        s3.setMarks(88);
        System.out.println("Name : " + s3.getName());
        System.out.println("RegNo : " + s3.getRegNo());
        System.out.println("Father Name : " + s3.getFatherName());
        System.out.println("Current Address : " + s3.getCurrentAddress());
        System.out.println("Permanent Address : " + s3.getPermanentAddress());
        System.out.println("Email ID : " + s3.getEmailID());
        System.out.println("Phone Number : " + s3.getPhoneNumber());
        System.out.println("Past Degree : " + s3.getPastDegree());
        System.out.println("Marks : " + s3.getMarks());
        System.out.println();
    }
}
