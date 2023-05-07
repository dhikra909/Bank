package com.BankAccountSystem.BankAccountSystem.Repositores;


import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import com.BankAccountSystem.BankAccountSystem.Models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepositores extends JpaRepository<Loan, Integer > {

    @Query(value = "SELECT s from Loan s where s.id = :id")
    Loan getLoanById(@Param("id") Integer id);










}
