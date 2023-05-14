package com.BankAccountSystem.BankAccountSystem.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@Entity
public class Loan extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "interest_rate")
    private Double interest_rate;
    @ManyToOne
    @JoinColumn(name = "Customer_id", referencedColumnName = "id")
    private Customer customer;
}
