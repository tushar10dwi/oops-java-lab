import java.util.Scanner;

// Super class
abstract class Account {
    protected static int nextAccNo = 1000;

    protected int accNo;
    protected String name;
    protected String accType;
    protected double balance;
    protected int day, month, year;

    // Constructor
    Account(String name, String accType, double balance,
            int day, int month, int year) {
        this.accNo = ++nextAccNo;
        this.name = name;
        this.accType = accType;
        this.balance = balance;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs " + balance);
    }

    void deposit(double amount, int d, int m, int y) {
        balance += amount;
        day = d;
        month = m;
        year = y;
        System.out.println("Deposited Rs " + amount +
                " on " + day + "/" + month + "/" + year);
    }

    abstract void withdraw(double amount);

    void display() {
        System.out.println("\nAccount No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: Rs " + balance);
    }
}

// Standard Account
class StandardAccount extends Account {

    StandardAccount(String name, double balance,
                    int day, int month, int year) {
        super(name, "Standard", balance, day, month, year);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 100000) {
            balance -= amount;
            System.out.println("Withdrawn Rs " + amount + " (No charge)");
        } else if (amount <= 500000) {
            double penalty = amount * 0.0005;
            balance -= (amount + penalty);
            System.out.println("Withdrawn Rs " + amount +
                    " with penalty Rs " + penalty);
        } else {
            System.out.println("Withdrawal limit exceeded for Standard Account");
        }
    }
}

// Premium Account
class PremiumAccount extends Account {

    PremiumAccount(String name, double balance,
                   int day, int month, int year) {
        super(name, "Premium", balance, day, month, year);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 1000000) {
            balance -= amount;
            System.out.println("Withdrawn Rs " + amount);
        } else {
            System.out.println("Daily withdrawal limit exceeded for Premium Account");
        }
    }
}

// Driver Class
public class Q1 {
    public static void main(String[] args) {

        Account acc;   // Superclass reference

        // Dynamic Method Dispatch
        acc = new StandardAccount("Ravi", 2000000, 1, 1, 2025);
        acc.display();
        acc.deposit(50000, 5, 1, 2025);
        acc.withdraw(300000);
        acc.checkBalance();

        acc = new PremiumAccount("Anita", 8000000, 2, 1, 2025);
        acc.display();
        acc.deposit(100000, 6, 1, 2025);
        acc.withdraw(900000);
        acc.checkBalance();
    }
}
