package com.example.capitalcasebackend.service;

import com.example.capitalcasebackend.model.PrimaryAccount;
import com.example.capitalcasebackend.model.SavingsAccount;

import java.security.Principal;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);

}
