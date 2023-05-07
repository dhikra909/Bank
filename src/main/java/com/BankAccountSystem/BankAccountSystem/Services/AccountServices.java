package com.BankAccountSystem.BankAccountSystem.Services;


import com.BankAccountSystem.BankAccountSystem.Models.Account;
import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import com.BankAccountSystem.BankAccountSystem.Repositores.AccountRepositores;
import com.BankAccountSystem.BankAccountSystem.Repositores.CustomeRepositores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}