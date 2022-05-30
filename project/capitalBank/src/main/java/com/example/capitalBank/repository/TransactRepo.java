package com.example.capitalBank.repository;

import com.example.capitalBank.model.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

public interface SavingAccountRepo extends CrudRepository<SavingsAccount,Integer> {
    SavingsAccount findByAccountNumber (int accountNumber);
}
