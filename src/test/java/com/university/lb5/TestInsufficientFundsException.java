package com.university.lb5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestInsufficientFundsException {
    Bank bank;
    BankAccount bankAccount1;
    BankAccount bankAccount2;

    @BeforeEach
    void setUp(){
        bank = new Bank();
        bankAccount1 = bank.createAccount("Test1",1000);
        bankAccount2 = bank.createAccount("Test2",1000);
    }


    @Test
    void InsufficientFundsWithdrawTest(){
        Assertions.assertThrows(InsufficientFundsException.class, () ->bankAccount1.withdraw(1100));
    }

    @Test
    void InsufficientFundsTransferMoneyTest(){
        Assertions.assertThrows(InsufficientFundsException.class, () ->bank.transferMoney(bankAccount1.getAccountNumber(), bankAccount2.getAccountNumber(), 15000));
    }

}
