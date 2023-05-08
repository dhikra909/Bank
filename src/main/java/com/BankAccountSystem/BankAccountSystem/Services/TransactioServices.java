package com.BankAccountSystem.BankAccountSystem.Services;

import com.BankAccountSystem.BankAccountSystem.Models.Loan;
import com.BankAccountSystem.BankAccountSystem.Models.Transaction;
import com.BankAccountSystem.BankAccountSystem.Repositores.TransactioRepositores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Date;

@Service
public class TransactioServices {

    @Autowired
    TransactioRepositores transactioRepositores;

    public void createTransactions(Date transacionDate, Double amount) {
        Transaction transaction=new Transaction();
        transaction.setAmount(amount);
        transaction.setTransacionDate(transacionDate);
        transactioRepositores.save(transaction);
    }

    public Transaction getTransactionById(Integer id) {
        Transaction transaction = transactioRepositores.getTransactionById(id);
        return transaction;


    }

    public Transaction updateTransaction(Integer id , Date transacionDate , Double amount ){
        Transaction transaction = transactioRepositores.findById(id).orElseThrow(() -> new EntityNotFoundException("Customer not found"));
        transaction.setTransacionDate(transacionDate);
        transaction.setAmount(amount);
        return transactioRepositores.save(transaction);
    }





}
