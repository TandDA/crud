package com.rating.crud.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private String color;
    private String number;
}
