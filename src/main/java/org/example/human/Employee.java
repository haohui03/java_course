package org.example.human;
import org.example.MyDate.*;
public class Employee extends Person{
    private String office;
    private String wage;
    private MyDate employedDate;

    public  String getOffice() {
        return office;
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, String wage, MyDate employedDate) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.wage = wage;
        this.employedDate = employedDate;
    }

    public  String getWage() {
        return wage;
    }

    public MyDate getEmployedDate() {
        return employedDate;
    }

}
