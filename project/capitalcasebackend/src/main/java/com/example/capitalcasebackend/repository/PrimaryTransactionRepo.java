package com.example.capitalcasebackend.repository;

import com.example.capitalcasebackend.model.PrimaryTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimaryTransactionRepo extends CrudRepository<PrimaryTransaction,Long> {
    List<PrimaryTransaction> findAll();
}

