package com.BankAccountSystem.BankAccountSystem.Conteoler;

import com.BankAccountSystem.BankAccountSystem.Models.Loan;
import com.BankAccountSystem.BankAccountSystem.Models.Transaction;
import com.BankAccountSystem.BankAccountSystem.Services.TransactioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;

@RestController
@RequestMapping(value = " Transactions")

public class TransactionConteoler {

   @Autowired
   TransactioServices transactioServices ;

   @RequestMapping(value ="/TransactionsData" ,method = RequestMethod.POST)
   public void createTransactions(@RequestParam Date transacionDate, @RequestParam Double amount) throws ParseException {
      transactioServices.createTransactions(transacionDate ,amount);
   }

   @RequestMapping(value = "/getById", method = RequestMethod.GET)
   public Transaction getLoanById(@RequestParam Integer id) {
      Transaction transaction = transactioServices.getTransactionById(id);
      return transaction;
   }

   @RequestMapping("/updateTransaction")
   public Transaction updateTransaction ( @RequestParam Integer id ,@RequestParam Date transacionDate , @RequestParam Double amount ){
      return transactioServices.updateTransaction( id, transacionDate , amount );
   }


   @RequestMapping(value = "deleteTransactionById", method = RequestMethod.POST)
   public void deleteTransactionById(@RequestParam Integer id) {
      transactioServices.getTransactionById(id);
   }

   @RequestMapping(value = "deleteAllTransaction", method = RequestMethod.POST)
   public void deleteAllTransaction() {
      transactioServices.deleteAllTransaction();
   }




}
