package com.example.capitalcasebackend.repository;

import com.example.capitalcasebackend.model.SavingsAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsAccountRepo extends CrudRepository<SavingsAccount,Long> {
    SavingsAccount findByAccountNumber (int accountNumber);
}
