package com.BankAccountSystem.BankAccountSystem.Conteoler;


import com.BankAccountSystem.BankAccountSystem.Models.Account;
import com.BankAccountSystem.BankAccountSystem.Services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value = "account")
public class AccountConteoler {
    @Autowired
    AccountServices accountServices;

    @RequestMapping(value ="/AccountData" ,method = RequestMethod.POST)
    public void createAccount(@RequestParam Long account_number, @RequestParam Double balance, @RequestParam Integer customer_id) throws ParseException {
        accountServices.createAccount(account_number ,balance, customer_id);
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public Account getMarkById(@RequestParam Integer id) {
        Account account = accountServices.getAccountById(id);
        return account;
    }

    @RequestMapping("/updateAccount")
    public Account updateAccount(@RequestParam Integer customer_id , @RequestParam Integer account_number , @RequestParam Double balance){
        return accountServices.updateAccount(customer_id , account_number , balance);
    }

    @RequestMapping(value = "deleteCAccountById", method = RequestMethod.POST)
    public void deleteAccountById(@RequestParam Integer id) {
        accountServices.deleteAccountById(id);
    }


}
