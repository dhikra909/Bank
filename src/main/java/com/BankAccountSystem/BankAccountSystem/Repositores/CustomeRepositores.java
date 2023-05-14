package com.BankAccountSystem.BankAccountSystem.Repositores;


import com.BankAccountSystem.BankAccountSystem.Models.CreditCard;
import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CustomeRepositores extends JpaRepository<Customer, Integer > {




    @Modifying
    @Transactional
    @Query(value = "UPDATE Customer s SET s.isActive=0 where s.id = :id")
    Customer getCustomerById(@Param("id") Integer id);


    @Query(value = "update Customer acc Set acc.isActive = false")
    void deleteAllCustomer();





}
