package com.BankAccountSystem.BankAccountSystem.Services;

import com.BankAccountSystem.BankAccountSystem.Models.Account;
import com.BankAccountSystem.BankAccountSystem.Models.CreditCard;
import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import com.BankAccountSystem.BankAccountSystem.Repositores.CreditCardRepositores;
import com.BankAccountSystem.BankAccountSystem.Repositores.CustomeRepositores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCardServices {

    @Autowired
    CreditCardRepositores creditCardRepositores;

    @Autowired
    CustomeRepositores customeRepositores;

    public void createCreditCard(Long card_number,Double credit_limit,Integer customer_id) {

        CreditCard creditCard=new CreditCard();
        creditCard.setCard_number(card_number);
        creditCard.setCredit_limit(credit_limit);
        Customer customer = customeRepositores.findById(customer_id).get();
        creditCard.setCustomer(customer);
        creditCardRepositores.save(creditCard);
    }


}