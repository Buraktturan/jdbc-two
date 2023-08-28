package com.example.jdbctwo.entity;

import jakarta.persistence.*;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "IDENTITY_NUMBER")
    private String identityNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

}

