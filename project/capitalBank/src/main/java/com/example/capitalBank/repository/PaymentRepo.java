package com.example.capitalBank.repository;

import com.example.capitalBank.model.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipientRepo  extends CrudRepository<Payment,Long> {
    List<Payment> findAll();
    Payment findByName(String recipientName);

    void deleteByName(String recipientName);
}
