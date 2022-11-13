package com.unab.apiadministracioncps.data.Entidades;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//Entidad Tabla Admninistrador del Conjunto
@Entity (name="administrador")
public class DatosAdminEntidad implements Serializable{

        private static final long serialVersionUID= 1L;

        @Id
        @Column(nullable= false)
        private String codigo;
        @Column(nullable= false)
        private String nombre;
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
