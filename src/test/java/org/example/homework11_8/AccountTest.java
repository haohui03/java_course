package org.example.homework11_8;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AccountTest {
    Account account;


    AccountTest() {
        Account.setAnnualInterestRate(1.5);
        this.account = new Account(1122, 1000, "George");

    }

    @Test
    @Order(2)
    void end() {
        depositAndWithdraw();
        System.out.print("Name: " + this.account.getName() + "\n");
        System.out.println("interest: " + this.account.getAnnualInterestRate());
        System.out.println("balance: " + this.account.getBalance());
        ArrayList<Transaction> transactions = this.account.getTransactions();
        assertNotNull(transactions);
        for (Transaction tx : transactions) {
            System.out.println(tx.toString());
        }

    }


    @Test
    @Order(1)
    void depositAndWithdraw() {
        this.account.deposit(30);
        this.account.deposit(40);
        this.account.deposit(50);
        assertEquals(1120, this.account.getBalance());
        this.account.withdraw(5);
        this.account.withdraw(4);
        this.account.withdraw(2);
        assertEquals(1109, this.account.getBalance());
    }
}