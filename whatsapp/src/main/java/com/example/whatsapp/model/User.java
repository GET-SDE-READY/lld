package com.example.whatsapp.model;

import jakarta.persistence.*;
import lombok.Data;

// POJO - Plain Old Java Object
@Data
@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String name;
    private String phone;
}
