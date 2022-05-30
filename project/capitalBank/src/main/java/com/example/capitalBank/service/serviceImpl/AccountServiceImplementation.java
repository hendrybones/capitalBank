package com.example.capitalBank.service.serviceImpl;

import com.example.capitalBank.model.*;
import com.example.capitalBank.repository.AccountRepo;
import com.example.capitalBank.repository.TransactRepo;
import com.example.capitalBank.service.AccountService;
import com.example.capitalBank.service.TransactionService;
import com.example.capitalBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.Date;

@Service
public class AccountServiceImplementation {

//    private static int nextAccountNumber = 11223145;
//    @Autowired
//    private AccountRepo accountRepo;
//
//    @Autowired
//    private TransactRepo transactRepo;
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private TransactionService transactionService;
//
//    @Override
//    public Account createPrimaryAccount() {
//        Account account = new Account();
//        account.setAccountBalance(new BigDecimal(0.0));
//        account.setAccountNumber(accountGen());
//        accountRepo.save(account);
//        return accountRepo.findByAccountNumber(account.getAccountNumber());
//    }
//
//
//    @Override
//    public SavingsAccount createSavingsAccount() {
//        SavingsAccount savingsAccount = new SavingsAccount();
//        savingsAccount.setAccountBalance(new BigDecimal(0.0));
//        savingsAccount.setAccountNumber(accountGen());
//
//        transactRepo.save(savingsAccount);
//
//        return transactRepo.findByAccountNumber(savingsAccount.getAccountNumber());
//
//    }
//
//    @Override
//    public void deposit(String accountType, double amount, Principal principal) {
//        User user = userService.findByUsername(principal.getName());
//        if (accountType.equalsIgnoreCase("Primary")) {
//            Account account = user.getPrimaryAccount();
//            account.setAccountBalance(account.getAccountBalance().add(new BigDecimal(amount)));
//            accountRepo.save(account);
//
//            Date date = new Date();
//
//            PaymentHistory paymentHistory = new PaymentHistory(date, "Deposit to Primary Account", "Account", "Finished", amount, account.getAccountBalance(), account);
//            transactionService.savePrimaryDepositTransaction(paymentHistory);
//
//        } else if (accountType.equalsIgnoreCase("Savings")) {
//            SavingsAccount savingsAccount = user.getSavingsAccount();
//            savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().add(new BigDecimal(amount)));
//            transactRepo.save(savingsAccount);
//
//            Date date = new Date();
//            TransactionHistory transactionHistory = new TransactionHistory(date, "Deposit to savings Account", "Account", "Finished", amount, savingsAccount.getAccountBalance(), savingsAccount);
//            transactionService.saveSavingsDepositTransaction(transactionHistory);
//        }
//    }
//    @Override
//    public void withdraw(String accountType, double amount, Principal principal) {
//        User user = userService.findByUsername(principal.getName());
//
//        if (accountType.equalsIgnoreCase("Primary")) {
//            Account account = user.getPrimaryAccount();
//            account.setAccountBalance(account.getAccountBalance().subtract(new BigDecimal(amount)));
//            accountRepo.save(account);
//
//            Date date = new Date();
//
//            PaymentHistory paymentHistory = new PaymentHistory(date, "Withdraw from Primary Account", "Account", "Finished", amount, account.getAccountBalance(), account);
//            transactionService.savePrimaryWithdrawTransaction(paymentHistory);
//        } else if (accountType.equalsIgnoreCase("Savings")) {
//            SavingsAccount savingsAccount = user.getSavingsAccount();
//            savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().subtract(new BigDecimal(amount)));
//            transactRepo.save(savingsAccount);
//
//            Date date = new Date();
//            TransactionHistory transactionHistory = new TransactionHistory(date, "Withdraw from savings Account", "Account", "Finished", amount, savingsAccount.getAccountBalance(), savingsAccount);
//            transactionService.saveSavingsWithdrawTransaction(transactionHistory);
//        }
//
//    }
//    private int accountGen() {
//        return ++nextAccountNumber;
//    }
}
