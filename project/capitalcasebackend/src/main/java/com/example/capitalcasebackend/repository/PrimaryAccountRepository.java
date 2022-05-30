package com.example.capitalcasebackend.repository;

import com.example.capitalcasebackend.model.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryAccountRepository extends CrudRepository<PrimaryAccount, Long> {
    PrimaryAccount findByAccountNumber (int accountNumber);
}
