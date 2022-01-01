package com.company;

class personalInformation{
    String name,address;
    int age;
    long phone_number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long  phone_number) {
        this.phone_number = phone_number;
    }
}

public class q3 {
    public static void main(String[] args) {

        // now we have to create 3 objects of it
        personalInformation myInfo = new personalInformation();
        personalInformation myFriendsInfo = new personalInformation();
        personalInformation myFamilyInfo = new personalInformation();

        myInfo.setAddress("79 aditya nagar");
        myInfo.setName("Vivek");
        myInfo.setPhone_number(1234567890);
        myInfo.setAge(21);

        //in same way we initial things for other two objects

        System.out.println(myInfo.getAddress());
        System.out.println(myInfo.getPhone_number());
        System.out.println(myInfo.getName());
        System.out.println(myInfo.getAge());

    }
}
