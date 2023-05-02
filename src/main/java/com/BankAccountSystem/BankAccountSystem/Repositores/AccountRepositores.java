package com.BankAccountSystem.BankAccountSystem.Repositores;

import com.BankAccountSystem.BankAccountSystem.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepositores extends JpaRepository<Account, Integer > {
}
