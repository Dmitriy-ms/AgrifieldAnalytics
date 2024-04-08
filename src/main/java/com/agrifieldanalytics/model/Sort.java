package com.agrifieldanalytics.model;

import jakarta.persistence.*;

@Entity
public class Sort {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(name = "culture_id")
    private Long cultureId;
}
