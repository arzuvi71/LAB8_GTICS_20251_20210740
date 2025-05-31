package com.example.lab6_20210740.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table (name= "planets")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(unique = true)
    private String nombre;
    @NotBlank
    private String tipo_planeta;
    @NotBlank
    private boolean habitable;
    @NotBlank
    @Digits(integer = 8, fraction = 2)
    private double gravedad_relativa;
    private String descripcion;

}
