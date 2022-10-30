package com.unab.apiadministracioncps.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity (name="residente")
public class DatosResiEntidad implements Serializable{
    private static final long serialVersionUID= 1L;

    @Column(nullable= false)
    private String codigo;
    @Column(nullable= false)
    private String nombre;
    @Column(nullable= false)
    private String apellidos;
    @Column(nullable= false)
    private String correo;
    @Column(nullable= false)
    private String telefono1;
    @Column(nullable= false)
    private String telefono2;
    @Column(nullable= false)
    private String clave;

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono1() {
        return this.telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return this.telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
}
