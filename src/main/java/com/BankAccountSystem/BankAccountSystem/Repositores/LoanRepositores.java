package com.BankAccountSystem.BankAccountSystem.Repositores;


import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import com.BankAccountSystem.BankAccountSystem.Models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface LoanRepositores extends JpaRepository<Loan, Integer > {



    @Modifying
    @Transactional
    @Query(value = "UPDATE Loan s SET s.isActive=0 where s.id = :id")
    Loan getLoanById(@Param("id") Integer id);


    @Query(value = "update Loan acc Set acc.isActive = false")
    void deleteAllLoan();





}
