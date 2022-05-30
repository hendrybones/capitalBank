package com.example.capitalcasebackend.repository;

import com.example.capitalcasebackend.model.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SavingsTransactionRepo  extends CrudRepository<SavingsTransaction,Long> {
    List<SavingsTransaction> findAll();
}
