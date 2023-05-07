package com.BankAccountSystem.BankAccountSystem.Repositores;


import com.BankAccountSystem.BankAccountSystem.Models.CreditCard;
import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomeRepositores extends JpaRepository<Customer, Integer > {

    @Query(value = "SELECT s from Customer s where s.id = :id")
    Customer getCustomerById(@Param("id") Integer id);











}
