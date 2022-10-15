package org.example.homework11_8;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Yehh
 */
public class Transaction {
    private final Date date;
    private final char type;
    private final double amount;
    private final double balance;
    private final String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date) + "\ttype: " + type + "\tamount: "+ String.format("%.3f",this.amount) + "\tbalance: " + balance + "\tdescription: " + description;
    }
}
