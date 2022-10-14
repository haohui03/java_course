package org.example.human;

import org.example.homework11_2.MyDate.MyDate;
import org.example.homework11_2.human.Staff;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StaffTest {
    Staff staff;

    @Test
    void testToString() {
        System.out.println(this.staff.toString());

    }

    @BeforeEach
    void setUp() {
        String name = "staff_test";
        String address = "Scut";
        String phoneNumber = "1383693241";
        String emailAddress = "test@test";
        String office = "office";
        String wage = "123";
        MyDate employedDate = new MyDate(System.currentTimeMillis());
        String title = "professor";
        this.staff = new Staff(name, address, phoneNumber, emailAddress, office, wage, employedDate, title);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString1() {
    }
}