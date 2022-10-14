package org.example.homework11_2.human;

public class Student extends Person {
    private String classState;

    public Student(String name, String address, String phoneNumber, String emailAddress, String classState) {
        super(name, address, phoneNumber, emailAddress);
        this.classState = classState;
    }

    public  String getClassState() {
        return classState;
    }
}
