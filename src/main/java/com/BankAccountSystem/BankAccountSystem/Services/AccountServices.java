package com.BankAccountSystem.BankAccountSystem.Services;


import com.BankAccountSystem.BankAccountSystem.Models.Account;
import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import com.BankAccountSystem.BankAccountSystem.Repositores.AccountRepositores;
import com.BankAccountSystem.BankAccountSystem.Repositores.CustomeRepositores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Date;

@Service
public class AccountServices {

    @Autowired
    AccountRepositores accountRepositores;

    @Autowired
    CustomeRepositores customeRepositores;

    public void createAccount(Long account_number,Double balance,Integer customer_id) {
        Account account=new Account();
        account.setAccount_number(account_number);
        account.setBalance(balance);
        Customer customer = customeRepositores.findById(customer_id).get();
        account.setCustomer(customer);
        accountRepositores.save(account);
    }

    public Account getAccountById(Integer id) {
        Account account = accountRepositores.findById(id).get();
        return account;
    }

    public Account updateAccount(Integer customer_id , Integer account_number , Double balance){
        Account account = accountRepositores.getByAccountNumber(account_number);
        account.setBalance(balance);
        account.setUpdatedDate(new Date());
        return accountRepositores.save(account);
    }

    public void deleteAccountById(Integer id) {
        accountRepositores.getAccountById(id);

    }


    public void deleteAllAccounts() {
        accountRepositores.deleteAllAccounts();
    }




}
