package com.example.capitalBank.repository;

import com.example.capitalBank.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryAccountRepo extends CrudRepository<Account,Integer> {
    Account findByAccountNumber (int accountNumber);
}
