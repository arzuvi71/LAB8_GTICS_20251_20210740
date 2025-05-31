package com.example.lab6_20210740.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="expeditions")
public class Expedition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nombre_mision;
    @ManyToOne
    @JoinColumn(name = "id")
    @NotBlank
    private Planet planeta_destino;
    @NotBlank
    private LocalDateTime fecha_lanzamiento;
    private String estado;
    private String objetivos;
    private String resultados;
    @ManyToMany
    @JoinColumn(name="id")
    private List<CrewMember> tripulacion;

}
