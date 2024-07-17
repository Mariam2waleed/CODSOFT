package main.java.task3;


public class BankAccount {
    private double balance;

    public BankAccount(final double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(final double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(final double amount) {
        if (amount > 0 && (amount <= this.balance)) {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else System.out.println("Invalid withdrawal amount or insufficient balance.");
    }

    public double getBalance() {
        return this.balance;
    }
}
