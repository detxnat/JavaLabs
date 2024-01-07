package com.university.lb5;


import lombok.Getter;
@Getter
public class BankAccount {
    private final int accountNumber;
    private final String accountName;

    private double balance;

    public void deposit(double amount) throws NegativeAmountException{
        if (amount < 0){
                throw new NegativeAmountException("Unable to deposit negative amount to a balance!");
        }
        else {
            this.balance += amount;
            System.out.println("Amount was deposited successfully!");

        }
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException{
        if (amount > balance){
                throw new InsufficientFundsException("Not enough balance to proceed a transaction");
        }
        if (amount < 0){
            throw new NegativeAmountException("Unable to withdraw negative amount from a balance!");
        }
        else {
            this.balance -= amount;
        }

    }

    public BankAccount(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }





    public String getAccountSummary(){
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
