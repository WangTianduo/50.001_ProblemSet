package q2;

import java.util.Date;

public class Account implements Comparable{

    private String id;
    private double balance;
    private Date dateCreated;

    Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        String output = "Account:" + id;
        return output;
    }

    @Override
    public int compareTo(Object o) {
        Account a = (Account)o;
        return (int)(-a.getBalance() + this.getBalance());
    }
}
