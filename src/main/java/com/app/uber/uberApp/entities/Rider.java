package com.app.uber.uberApp.entities;

import jakarta.persistence.*;

@Entity
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double rating;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
