package com.BankAccountSystem.BankAccountSystem.Conteoler;


import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import com.BankAccountSystem.BankAccountSystem.Models.Loan;
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

 @RequestMapping(value = "/getById", method = RequestMethod.GET)
 public Loan getLoanById(@RequestParam Integer id) {
  Loan loan = loanServices.getLoanById(id);
  return loan;
 }

 @RequestMapping("/updateLoan")
 public Loan updateLoan ( @RequestParam Integer id ,@RequestParam Double amount , @RequestParam Double interest_rate ){
  return loanServices.updateLoan( id, amount , interest_rate );
 }



 @RequestMapping(value = "deleteCustomerById", method = RequestMethod.POST)
 public void deleteLoanById(@RequestParam Integer id) {
  loanServices.getLoanById(id);
 }





}
