package com.BankAccountSystem.BankAccountSystem.Conteoler;

import com.BankAccountSystem.BankAccountSystem.Services.CreditCardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value = "creditcard")
public class CreditCardConteoler {

@Autowired
CreditCardServices creditCardServices;

    @RequestMapping(value ="/CreditCardData" ,method = RequestMethod.POST)
    public void createCreditCard(@RequestParam Long card_number, @RequestParam Double credit_limit, @RequestParam Integer customer_id) throws ParseException {
        creditCardServices.createCreditCard(card_number ,credit_limit, customer_id);
    }







}
