package com.BankAccountSystem.BankAccountSystem.Conteoler;

import com.BankAccountSystem.BankAccountSystem.Services.TransactioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = " Transactions")

public class TransactionConteoler {

   @Autowired
   TransactioServices transactioServices ;

}
