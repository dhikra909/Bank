package com.BankAccountSystem.BankAccountSystem.Repositores;

import com.BankAccountSystem.BankAccountSystem.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepositores extends JpaRepository<Account, Integer > {


    @Query(value = "SELECT s from Account s where s.id = :id")
    Account getAccountById(@Param("id") Integer id);








}