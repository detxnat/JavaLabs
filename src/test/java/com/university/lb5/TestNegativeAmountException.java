package com.university.lb5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestNegativeAmountException {

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
    void NegativeDepositAmountTest(){
        Assertions.assertThrows(NegativeAmountException.class, () ->bankAccount1.deposit(-100));
    }

    @Test
    void NegativeAmountWithdrawTest(){
        Assertions.assertThrows(NegativeAmountException.class, () -> bankAccount1.withdraw(-100));
    }

    @Test
    void NegativeAmountDepositTest(){
        Assertions.assertThrows(NegativeAmountException.class, () -> bankAccount1.deposit(-100));
    }

    @Test
    void NegativeAmountTransferTest(){
        Assertions.assertThrows(NegativeAmountException.class, () ->  bank.transferMoney(bankAccount1.getAccountNumber(), bankAccount2.getAccountNumber(), -100));
    }

}
