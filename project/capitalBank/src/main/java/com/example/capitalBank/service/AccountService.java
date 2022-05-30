package com.example.capitalBank.service;

import com.example.capitalBank.model.Account;
import com.example.capitalBank.model.SavingsAccount;

import java.security.Principal;

public interface AccountService {
    Account createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
}
