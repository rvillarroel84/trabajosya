package com.rvillarroel.trabajosya.domain;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double salario;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus estado;

    @ManyToMany(mappedBy = "jobs")
    private Set<Employee> employees = new HashSet<>();

}
