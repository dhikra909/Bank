package com.BankAccountSystem.BankAccountSystem.Conteoler;


import com.BankAccountSystem.BankAccountSystem.Services.CustomeSerices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value = "Customer")
public class CustomeConteoler {

    @Autowired
    CustomeSerices customeSerices;
    @RequestMapping(value ="CustomerData" ,method = RequestMethod.POST)
    public void createCustomer(@RequestParam String first_name,String last_name,String email,String phone)throws ParseException {
        customeSerices.createCustomer(first_name ,last_name, email, phone);
    }




}
