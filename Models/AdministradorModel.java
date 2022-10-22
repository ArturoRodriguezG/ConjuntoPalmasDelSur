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
@Table(name = "Administrador") 
@NoArgsConstructor 
@AllArgsConstructor 
@Getter 
@Setter 

public class AdministradorModel {
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


/*
@Table(name = "Administrador") //La tabla se llamará Administrador en la base de datos
@NoArgsConstructor //Constructor sin argumentos
@AllArgsConstructor //Constructor con todos los argumentos
@Getter //Métodos getter de los atributos
@Setter //Métodos setter de los atributos
 */
/*Con la notación Entity estamos indicando que a la clase le corresponde una
tabla de la base de datos*/

/*La notación Table sirve para agregar información de la tabla asociada a la entidad*/
//@GeneratedValue(strategy = GenerationType.IDENTITY) //Autogeneración
