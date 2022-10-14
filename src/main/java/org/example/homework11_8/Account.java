package org.example.homework11_8;

import java.util.Date;

/**
 * @author Yehh
 */
public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;
    private String name;

    Account() {

    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    Account(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate()/12/100;
    }

    private double getMonthlyInterest(){
        return getBalance()*getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

}
