package com.agrifieldanalytics.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String location;
    @Column(name = "cadastral_number")
    private String cadastralNumber;
    private double area;
}
