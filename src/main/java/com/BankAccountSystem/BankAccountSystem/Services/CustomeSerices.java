package com.BankAccountSystem.BankAccountSystem.Services;

import com.BankAccountSystem.BankAccountSystem.Models.CreditCard;
import com.BankAccountSystem.BankAccountSystem.Models.Customer;
import com.BankAccountSystem.BankAccountSystem.Repositores.CustomeRepositores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class CustomeSerices {

    @Autowired
    CustomeRepositores customeRepositores;

    public void createCustomer(String first_name, String last_name, String email, String phone) {
        Customer customer = new Customer();
        customer.setFirst_name(first_name);
        customer.setLast_name(last_name);
        customer.setEmail(email);
        customer.setPhone(phone);
        customeRepositores.save(customer);
    }

    public Customer getCustomerdById(Integer id) {
        Customer customer = customeRepositores.getCustomerById(id);
        return customer;
    }

    public Customer updateCustomer(Integer id , String first_name , String last_name , String email , String phone){
        Customer customer = customeRepositores.getCustomerById(id);
        customer.setFirst_name(first_name);
        customer.setLast_name(last_name);
        customer.setEmail(email);
        customer.setPhone(phone);
        return customeRepositores.save(customer);
    }

    public void deleteCustomerById(Integer id) {
        customeRepositores.getCustomerById(id);
    }






}
