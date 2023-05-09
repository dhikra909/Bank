package com.BankAccountSystem.BankAccountSystem.Repositores;

import com.BankAccountSystem.BankAccountSystem.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface AccountRepositores extends JpaRepository<Account, Integer > {


    @Modifying
    @Transactional
    @Query(value = "UPDATE Account s SET s.isActive=0 where s.id = :id")
    Account getAccountById(@Param("id") Integer id);

    @Query(value = "SELECT ac from Account ac WHERE ac.account_number =:accountNumber")
    Account getByAccountNumber(@Param("accountNumber") Integer accountNumber);








}