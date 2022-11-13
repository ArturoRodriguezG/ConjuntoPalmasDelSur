package com.unab.apiadministracioncps.data.Dtos;
import java.io.Serializable;

//Este objeto se de transferencia de datos entre la BD-logica-cliente ida-vuelta
public class DatosAdminDto implements Serializable{

    private static final long serialVersionUID= 1L;
    private String codigo;
    private String nombre;
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

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
