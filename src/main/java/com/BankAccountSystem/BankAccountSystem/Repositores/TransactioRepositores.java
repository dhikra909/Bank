package com.BankAccountSystem.BankAccountSystem.Repositores;


import com.BankAccountSystem.BankAccountSystem.Models.Loan;
import com.BankAccountSystem.BankAccountSystem.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TransactioRepositores extends JpaRepository<Transaction, Integer > {




    @Modifying
    @Transactional
    @Query(value = "UPDATE Transaction s SET s.isActive=0 where s.id = :id")
    Transaction getTransactionById(@Param("id") Integer id);

    @Query(value = "update Transaction acc Set acc.isActive = false")
    void deleteAllTransaction();




}
