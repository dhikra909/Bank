package com.BankAccountSystem.BankAccountSystem.Services;

import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import com.BankAccountSystem.BankAccountSystem.Models.Loan;
import com.BankAccountSystem.BankAccountSystem.Repositores.LoanRepositores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanServices {

    @Autowired
    LoanRepositores loanRepositores;

    public void createLoan(Double amount,Double interest_rate) {
        Loan loan=new Loan();
        loan.setAmount(amount);
        loan.setInterest_rate(interest_rate);
        loanRepositores.save(loan);
    }






}
