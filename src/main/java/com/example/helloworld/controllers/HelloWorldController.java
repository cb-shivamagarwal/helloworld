package com.example.helloworld.controllers;

import com.example.helloworld.exceptions.InvalidTransactionReferenceException;
import com.example.helloworld.model.Transaction;
import com.example.helloworld.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @Autowired
    TransactionService transactionService;

    @GetMapping("/")
    public String display() {
        return "Hi There";
    }

    @PostMapping("/create")
    public Long createTransaction(@RequestBody Transaction transaction) {
        transactionService.saveTransaction(transaction);
        return transaction.getTransactionId();
    }

    @GetMapping("/viewall")
    public Iterable<Transaction> viewAllTransactions() {
        return transactionService.getTransactionHistory();
    }

    /**
     * This is Summary.
     *
     * @param id - transaction id
     */
    @GetMapping("/view/{id}")
    public Transaction viewTransactionById(@PathVariable("id") Long id) {
        Optional<Transaction> transaction = transactionService.getTransaction(id);
        if (transaction.isPresent()) {
            return transaction.get();
        }

        throw new InvalidTransactionReferenceException("Invalid transaction reference provided");
    }
}
