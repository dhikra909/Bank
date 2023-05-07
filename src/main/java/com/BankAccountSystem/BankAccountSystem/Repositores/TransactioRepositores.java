package com.BankAccountSystem.BankAccountSystem.Repositores;


import com.BankAccountSystem.BankAccountSystem.Models.Loan;
import com.BankAccountSystem.BankAccountSystem.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactioRepositores extends JpaRepository<Transaction, Integer > {

    @Query(value = "SELECT s from Transaction s where s.id = :id")
    Transaction getTransactionById(@Param("id") Integer id);









}
