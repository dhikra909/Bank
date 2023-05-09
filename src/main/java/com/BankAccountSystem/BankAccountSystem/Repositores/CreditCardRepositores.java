package com.BankAccountSystem.BankAccountSystem.Repositores;


import com.BankAccountSystem.BankAccountSystem.Models.Account;
import com.BankAccountSystem.BankAccountSystem.Models.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CreditCardRepositores  extends JpaRepository<CreditCard, Integer > {


@Modifying
@Transactional
    @Query(value = "UPDATE CreditCard s SET s.isActive=0 where s.id = :id")
    CreditCard getCreditCardById(@Param("id") Integer id);

    @Query(value = "SELECT ac from CreditCard ac WHERE ac.card_number =:card_number")
    CreditCard getByCreditCardNumber(@Param("card_number") Integer card_number);







}
