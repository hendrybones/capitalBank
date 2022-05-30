package com.example.capitalBank.service.serviceImpl;

import com.example.capitalBank.model.*;
import com.example.capitalBank.repository.*;
import com.example.capitalBank.service.TransactionService;
import com.example.capitalBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionServiceImpl  {
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private PaymentHistoryRepo paymentHistoryRepo;
//
//    @Autowired
//    private TransactionHistoryRepo transactionHistoryRepo;
//
//    @Autowired
//    private AccountRepo accountRepo;
//
//    @Autowired
//    private TransactRepo transactRepo;
//
//    @Autowired
//    private PaymentRepo paymentRepo;
//    @Override
//    public List<PaymentHistory> findPrimaryTransactionList(String username) {
//        User user =userService.findByUsername(username);
//        List<PaymentHistory> paymentHistoryList =user.getPrimaryAccount().getPrimaryTransactionList();
//        return paymentHistoryList;
//    }
//
//    @Override
//    public List<TransactionHistory> findSavingsTransactionList(String username) {
//        User user =userService.findByUsername(username);
//        List<TransactionHistory> transactionHistoryList =user.getSavingsAccount().getSavingsTransactionList();
//        return transactionHistoryList;
//    }
//
//    @Override
//    public void savePrimaryDepositTransaction(PaymentHistory paymentHistory) {
//        paymentHistoryRepo.save(paymentHistory);
//    }
//
//    @Override
//    public void saveSavingsDepositTransaction(TransactionHistory transactionHistory) {
//        transactionHistoryRepo.save(transactionHistory);
//    }
//
//    @Override
//    public void savePrimaryWithdrawTransaction(PaymentHistory paymentHistory) {
//        paymentHistoryRepo.save(paymentHistory);
//    }
//
//    @Override
//    public void saveSavingsWithdrawTransaction(TransactionHistory transactionHistory) {
//        transactionHistoryRepo.save(transactionHistory);
//    }
//
//    @Override
//    public void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, Account account, SavingsAccount savingsAccount) throws Exception {
//        if (transferFrom.equalsIgnoreCase("Primary") && transferTo.equalsIgnoreCase("Savings")) {
//            account.setAccountBalance(account.getAccountBalance().subtract(new BigDecimal(amount)));
//            savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().add(new BigDecimal(amount)));
//            accountRepo.save(account);
//            transactRepo.save(savingsAccount);
//
//            Date date = new Date();
//
//            PaymentHistory paymentHistory = new PaymentHistory(date, "Between account transfer from "+transferFrom+" to "+transferTo, "Account", "Finished", Double.parseDouble(amount), account.getAccountBalance(), account);
//            paymentHistoryRepo.save(paymentHistory);
//        } else if (transferFrom.equalsIgnoreCase("Savings") && transferTo.equalsIgnoreCase("Primary")) {
//            account.setAccountBalance(account.getAccountBalance().add(new BigDecimal(amount)));
//            savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().subtract(new BigDecimal(amount)));
//            accountRepo.save(account);
//            transactRepo.save(savingsAccount);
//
//            Date date = new Date();
//
//            TransactionHistory transactionHistory = new TransactionHistory(date, "Between account transfer from "+transferFrom+" to "+transferTo, "Transfer", "Finished", Double.parseDouble(amount), savingsAccount.getAccountBalance(), savingsAccount);
//            transactionHistoryRepo.save(transactionHistory);
//        } else {
//            throw new Exception("Invalid Transfer");
//        }
//    }
//
//    @Override
//    public List<Payment> findRecipientList(Principal principal) {
//        String username = principal.getName();
//        List<Payment> paymentList = paymentRepo.findAll().stream() 			//convert list to stream
//                .filter(payment -> username.equals(payment.getUser().getUsername()))	//filters the line, equals to username
//                .collect(Collectors.toList());
//
//        return paymentList;
//
//    }
//
//    @Override
//    public Payment saveRecipient(Payment payment) {
//        return paymentRepo.save(payment);
//    }
//
//    @Override
//    public Payment findRecipientByName(String recipientName) {
//        return paymentRepo.findByName(recipientName);
//    }
//
//    @Override
//    public void deleteRecipientByName(String recipientName) {
//        paymentRepo.deleteByName(recipientName);
//    }
//
//    @Override
//    public void toSomeoneElseTransfer(Payment payment, String accountType, String amount, Account account, SavingsAccount savingsAccount) {
//        if (accountType.equalsIgnoreCase("Primary")) {
//            account.setAccountBalance(account.getAccountBalance().subtract(new BigDecimal(amount)));
//            accountRepo.save(account);
//
//            Date date = new Date();
//
//            PaymentHistory paymentHistory = new PaymentHistory(date, "Transfer to payment "+ payment.getName(), "Transfer", "Finished", Double.parseDouble(amount), account.getAccountBalance(), account);
//            paymentHistoryRepo.save(paymentHistory);
//        } else if (accountType.equalsIgnoreCase("Savings")) {
//            savingsAccount.setAccountBalance(savingsAccount.getAccountBalance().subtract(new BigDecimal(amount)));
//            transactRepo.save(savingsAccount);
//
//            Date date = new Date();
//
//            TransactionHistory transactionHistory = new TransactionHistory(date, "Transfer to payment "+ payment.getName(), "Transfer", "Finished", Double.parseDouble(amount), savingsAccount.getAccountBalance(), savingsAccount);
//            transactionHistoryRepo.save(transactionHistory);
//        }
//    }
}

