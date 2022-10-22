package com.example.apirest_admincps.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Inmueble") 
@NoArgsConstructor 
@AllArgsConstructor 
@Getter 
@Setter 

public class ParametrosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tarifaAdministracion;
    private int tarifaServicios;
}
