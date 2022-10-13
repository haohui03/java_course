package org.example.human;

import org.example.MyDate.MyDate;

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

    public String toString() {
        String output = String.format("class: %s  |||| name:%s", this.getClass().toString(), this.getName());
        return output;
    }
}
