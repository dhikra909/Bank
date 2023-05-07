package com.BankAccountSystem.BankAccountSystem.Conteoler;

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


}
