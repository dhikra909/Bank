package com.BankAccountSystem.BankAccountSystem.Repositores;


import com.BankAccountSystem.BankAccountSystem.Models.Account;
import com.BankAccountSystem.BankAccountSystem.Models.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepositores  extends JpaRepository<CreditCard, Integer > {

    @Query(value = "SELECT s from CreditCard s where s.id = :id")
    CreditCard getCreditCardById(@Param("id") Integer id);










}
