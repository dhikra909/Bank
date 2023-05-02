package com.BankAccountSystem.BankAccountSystem.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Setter
@Getter
@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "transacionDate")
    private  Date transacionDate;

    @Column(name = "amount")
    private  Double amount;
    @ManyToOne
    @JoinColumn(name = "Account_id", referencedColumnName = "id")
    private Account account;

}
