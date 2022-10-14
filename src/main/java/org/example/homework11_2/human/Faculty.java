package org.example.homework11_2.human;

import org.example.homework11_2.MyDate.MyDate;

public class Faculty extends Employee {
    private MyDate officeHour;
    private String level;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, String wage, MyDate employedDate, MyDate officeHour, String level) {
        super(name, address, phoneNumber, emailAddress, office, wage, employedDate);
        this.officeHour = officeHour;
        this.level = level;
    }
}
