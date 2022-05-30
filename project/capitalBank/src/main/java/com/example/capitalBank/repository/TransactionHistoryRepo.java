package com.example.capitalBank.repository;

import com.example.capitalBank.model.TransactionHistory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SavingTransactionRepo extends CrudRepository<TransactionHistory,Long> {
    List<TransactionHistory> findAll();
}
