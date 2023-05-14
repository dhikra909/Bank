package com.BankAccountSystem.BankAccountSystem.Services;

import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import com.BankAccountSystem.BankAccountSystem.Models.Loan;
import com.BankAccountSystem.BankAccountSystem.Repositores.LoanRepositores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

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


    public Loan getLoanById(Integer id) {
        Loan loan = loanRepositores.getLoanById(id);
        return loan;
    }

    public Loan updateLoan(Integer id , Double amount , Double interest_rate ){
        Loan loan = loanRepositores.getLoanById(id);
        loan.setAmount(amount);
        loan.setInterest_rate(interest_rate);
        return loanRepositores.save(loan);
    }

    public void deleteLoanById(Integer id) {
        loanRepositores.getLoanById(id);
    }

    public void deleteAllLoan() {
        loanRepositores.deleteAllLoan();
    }








}
