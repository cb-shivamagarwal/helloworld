package com.example.helloworld.repository;

import com.example.helloworld.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository.
 */
@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
