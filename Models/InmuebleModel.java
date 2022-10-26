package com.example.apirest_admincps.Models;

import java.sql.Date;

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

public class InmuebleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigo;
    private String descripcion;
    private String idResidente;
    private boolean tarifaAdmin;
    private Date fechaPago;
    private int valorPago;
    private int mesActual;
}
