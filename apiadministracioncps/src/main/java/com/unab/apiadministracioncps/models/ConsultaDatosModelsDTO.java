package com.unab.apiadministracioncps.models;

import java.io.Serializable;

//esteobjeto de transferencia de datos entre la BD-logica-cliente ida-vuelta
public class ConsultaDatosModelsDTO implements Serializable{
    
    private static final long serialVersionUID= 1L;
    private String codigo;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono1;
    private String telefono2;
    private String clave;

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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
