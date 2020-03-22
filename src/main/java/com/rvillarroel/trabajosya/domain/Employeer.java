package com.rvillarroel.trabajosya.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Employeer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Job> employeerJobs = new HashSet<>();
}
