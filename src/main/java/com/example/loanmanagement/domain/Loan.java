package com.example.loanmanagement.domain;

import jakarta.persistence.*;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private Integer term;
    private Double interestRate;
    private String status;

    // Getters and setters
}