package com.cohort_session_3;

/**
 * Created by User on 2018/9/19.
 */
import java.util.Date;

public class Account {

    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    Account() {

        dateCreated = new Date();
    }

    Account(int _id, double _balance) {

        id = _id;
        balance = _balance;
    }

    int getId() {

        return this.id;
    }

    double getBalance() {

        return this.balance;
    }

    double getAnnualInterestRate() {

        return this.annualInterestRate;
    }

    void setId(int _id) {

        this.id = _id;
    }

    void setBalance(double _balance) {

        this.balance = _balance;

    }

    static void setAnnualInterestRate(double _annual) {

        annualInterestRate = _annual;
    }

    Date getDateCreated() {

        return dateCreated;
    }

    double getMonthlyInterestRate() {

        return this.annualInterestRate / 12;
    }

    double getMonthlyInterest() {

        return this.balance * this.annualInterestRate / 1200;
    }

    void withdraw(double amount) {

        this.balance = this.balance - amount;
    }

    void deposit(double amount) {

        this.balance += amount;
    }


}
