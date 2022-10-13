package org.example.human;

import java.util.Stack;

public class Person {
    public  String getName() {
        return name;
    }

    public  String getAddress() {
        return address;
    }

    public  String getPhoneNumber() {
        return phoneNumber;
    }

    public  String getEmailAddress() {
        return emailAddress;
    }

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

}
