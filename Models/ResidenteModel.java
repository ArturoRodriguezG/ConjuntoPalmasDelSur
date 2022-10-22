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
@Table(name = "Residente") 
@NoArgsConstructor 
@AllArgsConstructor 
@Getter 
@Setter 

public class ResidenteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private String codigo;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono1;
    private String telefono2;
    private String clave;
}
