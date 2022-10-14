package org.example.homework11_2.human;

import org.example.homework11_2.MyDate.MyDate;

public class Staff extends Employee {
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office,
                 String wage, MyDate employedDate, String title) {
        super(name, address, phoneNumber, emailAddress, office, wage, employedDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    private String title;


}
