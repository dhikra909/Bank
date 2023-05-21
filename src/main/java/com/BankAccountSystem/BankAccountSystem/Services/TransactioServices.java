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

   

    public Transaction getTransactionById(Integer id) {
        Transaction transaction = transactioRepositores.getTransactionById(id);
        return transaction;



    }

    public Transaction updateTransaction(Integer id , Date transacionDate , Double amount ){
        Transaction transaction = transactioRepositores.getTransactionById(id);
        transaction.setTransacionDate(transacionDate);
        transaction.setAmount(amount);
        return transactioRepositores.save(transaction);

    }

    public void deleteTransactionById(Integer id) {
        transactioRepositores.getTransactionById(id);
    }

    public void deleteAllTransaction() {
        transactioRepositores.deleteAllTransaction();
    }



}
