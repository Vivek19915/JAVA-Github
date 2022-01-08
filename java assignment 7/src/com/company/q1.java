package com.company;

public class q1 {
    abstract static class Student {
        protected String name;
        protected String regNo;
        protected String fathersName; protected String currentAddress; protected String permanentAddress; protected String emailID;
        protected String phoneNumber;
        public String getName() { return name;
        }
        public void setName(String name) { this.name = name;
        }
        public String getRegNo() { return regNo;
        }
        public void setRegNo(String regNo) { this.regNo = regNo;
        }
        public String getFathersName() { return fathersName;
        }
        public void setFathersName(String fathersName) { this.fathersName = fathersName;
        }
        public String getCurrentAddress() { return currentAddress;
        }
        public void setCurrentAddress(String currentAddress) { this.currentAddress = currentAddress;
        }
        public String getPermanentAddress() {

            return permanentAddress; }
        public void setPermanentAddress(String permanentAddress) { this.permanentAddress = permanentAddress;
        }
        public String getEmailID() { return emailID;
        }
        public void setEmailID(String emailID) { this.emailID = emailID;
        }
        public String getPhoneNumber() { return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber;
        }
        public Student(String name, String regNo, String fathersName, String currentAddress, String permanentAddress, String emailID, String phoneNumber) {
            this.name = name;
            this.regNo = regNo;
            this.fathersName = fathersName; this.currentAddress = currentAddress;

            this.permanentAddress = permanentAddress; this.emailID = emailID;
            this.phoneNumber = phoneNumber;
        }
        abstract void display (int k); }
    public static class ug_student extends Student { private int past_marks;
        private String degree;
        public int getPast_marks() { return past_marks;
        }
        public void setPast_marks(int past_marks) { this.past_marks = past_marks;
        }
        public String getDegree() { return degree;
        }
        public void setDegree(String degree) { this.degree = degree;
        }
        public ug_student(String name, String regNo, String fathersName, String currentAddress, String permanentAddress, String emailID, String phoneNumber, int past_marks, String degree) {

            super(name, regNo, fathersName, currentAddress, permanentAddress, emailID, phoneNumber); this.past_marks = past_marks;
            this.degree = degree;
        }
        @Override
        void display(int k) {
            System.out.println("Displaying the details of UG student "+k); System.out.println("name:- "+getName());
            System.out.println("reg. no.:- "+getRegNo());
            System.out.println("father's name:- "+getFathersName()); System.out.println("current address is:- "+getCurrentAddress()); System.out.println("permanent address is:- "+getPermanentAddress()); System.out.println("email ID:- "+getEmailID());
            System.out.println("prev sem marks in percentage is:- "+getPast_marks()); System.out.println("prev degree:- "+getDegree()); System.out.println("phone number:- "+getPhoneNumber()); System.out.println();
        } }
    public static class pg_student extends Student { private int past_marks;
        private String degree;
        public int getPast_marks() { return past_marks;
        }
        public void setPast_marks(int past_marks) {

            this.past_marks = past_marks; }
        public String getDegree() { return degree;
        }
        public void setDegree(String degree) { this.degree = degree;
        }
        public pg_student(String name, String regNo, String fathersName, String currentAddress, String permanentAddress, String emailID, String phoneNumber, int past_marks, String degree) {
            super(name, regNo, fathersName, currentAddress, permanentAddress, emailID, phoneNumber); this.past_marks = past_marks;
            this.degree = degree;
        }
        @Override
        void display(int k) {
            System.out.println("Displaying the details of PG student "+k); System.out.println("name:- "+getName());
            System.out.println("reg. no.:- "+getRegNo());
            System.out.println("father's name:- "+getFathersName()); System.out.println("current address is:- "+getCurrentAddress()); System.out.println("permanent address is:- "+getPermanentAddress()); System.out.println("email ID:- "+getEmailID());
            System.out.println("prev sem marks in percentage is:- "+getPast_marks()); System.out.println("prev degree:- "+getDegree());

            System.out.println("phone number:- "+getPhoneNumber());
            System.out.println(); }
    }
    public static void main(String[] args) {
        ug_student stud1=new ug_student("VIVEK","123456","DEF","BIHAR","BIHAR","abc@gmail.com","1234567890",100,"Intermediat e");
        stud1.display(1);
        pg_student stud2=new pg_student("SHAILENDRA","123456","PQR","BANKA","BANKA","xyz@gmail.com","1234567890",89,"B.tech");
        stud2.display(1); }
}
