package com.example.capitalBank.repository;

import com.example.capitalBank.model.PaymentHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryTransactionRepo extends CrudRepository<PaymentHistory,Long> {
    List<PaymentHistory> findAll();
}
