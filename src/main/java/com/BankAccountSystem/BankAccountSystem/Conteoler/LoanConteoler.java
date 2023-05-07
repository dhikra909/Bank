package com.BankAccountSystem.BankAccountSystem.Conteoler;


import com.BankAccountSystem.BankAccountSystem.Services.LoanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value = "Loan")
public class LoanConteoler {

 @Autowired
 LoanServices loanServices;


 @RequestMapping(value ="/LoanData" ,method = RequestMethod.POST)
 public void createLoan(@RequestParam Double amount, @RequestParam Double interest_rate) throws ParseException {
  loanServices.createLoan(amount ,interest_rate);
 }

}