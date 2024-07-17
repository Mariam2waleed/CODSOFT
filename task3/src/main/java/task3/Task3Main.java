package main.java.task3;

public class Task3Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance
        ATM atm = new ATM(account);
        atm.start();
    }
}