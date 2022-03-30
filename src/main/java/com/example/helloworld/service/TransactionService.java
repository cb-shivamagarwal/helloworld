package com.example.helloworld.service;

import com.example.helloworld.model.Transaction;
import com.example.helloworld.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service.
 */
@Service
public class TransactionService {

  @Autowired
  TransactionRepository transactionRepository;

  public void saveTransaction(Transaction transaction) {
    transactionRepository.save(transaction);
  }

  public Iterable<Transaction> getTransactionHistory() {
    return transactionRepository.findAll();
  }

  public Optional<Transaction> getTransaction(Long id) {
    return transactionRepository.findById(id);
  }
}
