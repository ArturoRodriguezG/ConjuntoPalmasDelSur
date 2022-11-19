package com.unab.apiadministracioncps.data.Entidades;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//Entidad Tabla Residente del Conjunto
@Entity (name="residente")
@Table(indexes = {
    @Index(columnList = "codigo", name= "codigo", unique= true)
})
public class DatosResiEntidad implements Serializable{

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

    @OneToMany(cascade= CascadeType.ALL, mappedBy = "datosResiEntidad")
    private List<DatosInmuEntidad> datosInmuEntidadList= new ArrayList<>();

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

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    public List<DatosInmuEntidad> getDatosInmuEntidadList() {
        return this.datosInmuEntidadList;
    }

    public void setDatosInmuEntidadList(List<DatosInmuEntidad> datosInmuEntidadList) {
        this.datosInmuEntidadList = datosInmuEntidadList;
    }

        
}
