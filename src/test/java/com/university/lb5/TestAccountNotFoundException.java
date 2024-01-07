package com.university.lb5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestAccountNotFoundException
{
    Bank bank;
    BankAccount bankAccount;

    @BeforeEach
     void setUp(){
        bank = new Bank();
        bankAccount = bank.createAccount("Test",1000);
    }

    @Test
    void searchNotExisingAccountTest(){

        Assertions.assertThrows(AccountNotFoundException.class, () ->bank.findAccount(10434343));

    }

    @Test
    void sendMoneyFromAccountThatNotExistTest(){
        Assertions.assertThrows(AccountNotFoundException.class, () ->bank.transferMoney(23132313, bankAccount.getAccountNumber(), 100));
    }

    @Test
    void sendMoneyToAccountThatNotExistTest(){
        Assertions.assertThrows(AccountNotFoundException.class, () ->bank.transferMoney(bankAccount.getAccountNumber(), 23132313, 100));
    }
}
