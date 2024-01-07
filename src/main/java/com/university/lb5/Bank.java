package com.university.lb5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {
    private final Random random = new Random();
    private final List<BankAccount> accounts = new ArrayList<>();

    public BankAccount createAccount(String accountName, double initialDeposit) {
        BankAccount account = new BankAccount(random.nextInt(10000000, 100000000), accountName, initialDeposit);
        accounts.add(account);
        return account;


    }
    public BankAccount findAccount(int accountNumber) throws AccountNotFoundException{
            BankAccount foundAccount = accounts.stream()
                    .filter(account -> account.getAccountNumber() == accountNumber)
                    .findFirst()
                    .orElseThrow(() -> new AccountNotFoundException("No a such account with number ->" + accountNumber));

            System.out.println(foundAccount.getAccountSummary());
            return foundAccount;
        }
    public void transferMoney(int fromAccountNumber, int toAccountNumber, double amount)
            throws AccountNotFoundException, InsufficientFundsException, NegativeAmountException {
        BankAccount senderBankAccount = findAccount(fromAccountNumber);
        BankAccount receiverBankAccount = findAccount(toAccountNumber);
        senderBankAccount.withdraw(amount);
        receiverBankAccount.deposit(amount);

    }

}
