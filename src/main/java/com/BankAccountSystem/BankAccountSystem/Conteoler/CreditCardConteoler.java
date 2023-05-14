package com.BankAccountSystem.BankAccountSystem.Conteoler;

import com.BankAccountSystem.BankAccountSystem.Models.Account;
import com.BankAccountSystem.BankAccountSystem.Models.CreditCard;
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

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public CreditCard getCreditCardById(@RequestParam Integer id) {
        CreditCard creditCard = creditCardServices.getCreditCardById(id);
        return creditCard;
    }


    @RequestMapping("/updateCreditCard")
    public CreditCard updateCreditCard(@RequestParam Integer customer_id , @RequestParam Integer card_number , @RequestParam Double credit_limit){
        return creditCardServices.updateCreditCard(customer_id , card_number , credit_limit);
    }

    @RequestMapping(value = "deleteCCreditCardById", method = RequestMethod.POST)
    public void deleteCreditCardById(@RequestParam Integer id) {
        creditCardServices.getCreditCardById(id);
    }

    @RequestMapping(value = "deleteAllCreditCard", method = RequestMethod.POST)
    public void deleteAllCreditCard() {
        creditCardServices.deleteAllCreditCard();
    }




}
