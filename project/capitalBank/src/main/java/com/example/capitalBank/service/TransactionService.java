package com.example.capitalBank.service;

import com.example.capitalBank.model.*;

import java.security.Principal;
import java.util.List;

public interface TransactionService {
    List<PaymentHistory> findPrimaryTransactionList(String username);

    List<TransactionHistory> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PaymentHistory paymentHistory);

    void saveSavingsDepositTransaction(TransactionHistory transactionHistory);

    void savePrimaryWithdrawTransaction(PaymentHistory paymentHistory);
    void saveSavingsWithdrawTransaction(TransactionHistory transactionHistory);

    void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, Account account, SavingsAccount savingsAccount) throws Exception;

    List<Payment> findRecipientList(Principal principal);

    Payment saveRecipient(Payment payment);

    Payment findRecipientByName(String recipientName);

    void deleteRecipientByName(String recipientName);

    void toSomeoneElseTransfer(Payment payment, String accountType, String amount, Account account, SavingsAccount savingsAccount);

}
