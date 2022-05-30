package com.example.capitalBank.service;

import com.example.capitalBank.model.PrimaryAccount;
import com.example.capitalBank.model.SavingsAccount;
import com.example.capitalBank.repository.PrimaryAccountRepo;
import com.example.capitalBank.repository.SavingAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.security.Principal;
@Service
public class AccountServiceImplementation implements  AccountService{

    private static int nextAccountNumber = 11223145;
    @Autowired
    private PrimaryAccountRepo primaryAccountRepo;

    @Autowired
    private SavingAccountRepo savingAccountRepo;
    @Autowired
    private UserService userService;
    @Autowired
    private TransactionService transactionService;

    @Override
    public PrimaryAccount createPrimaryAccount() {
        PrimaryAccount primaryAccount = new PrimaryAccount();
        primaryAccount.setAccountBalance(new BigDecimal(0.0));
        primaryAccount.setAccountNumber(accountGen());
        primaryAccountRepo.save(primaryAccount);
        return primaryAccountRepo.findByAccountNumber(primaryAccount.getAccountNumber());
    }


    @Override
    public SavingsAccount createSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountBalance(new BigDecimal(0.0));
        savingsAccount.setAccountNumber(accountGen());

        savingAccountRepo.save(savingsAccount);

        return savingAccountRepo.findByAccountNumber(savingsAccount.getAccountNumber());

    }

    @Override
    public void deposit(String accountType, double amount, Principal principal) {

    }

    @Override
    public void withdraw(String accountType, double amount, Principal principal) {

    }
    private int accountGen() {
        return ++nextAccountNumber;
    }
}
