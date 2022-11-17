package com.unab.apiadministracioncps.data.Entidades;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

//Entidad Tabla Parametros del Sistema-Tarifas
//Datos directos, no tiene mantenimiento
@Entity (name="parametros")
@Table(indexes = {
    @Index(columnList = "id", name= "id", unique= true)
})
public class DatosParamEntidad implements Serializable{

    private static final long serialVersionUID= 1L;
    @Id
    @Column(nullable= false)
    private Integer id;
    @Column(nullable= false)
    private Integer tarifa_Admin;
    @Column(nullable= false)
    private Integer tarifa_Servicios;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTarifa_Admin() {
        return this.tarifa_Admin;
    }

    public void setTarifa_Admin(Integer tarifa_Admin) {
        this.tarifa_Admin = tarifa_Admin;
    }

    public Integer getTarifa_Servicios() {
        return this.tarifa_Servicios;
    }

    public void setTarifa_Servicios(Integer tarifa_Servicios) {
        this.tarifa_Servicios = tarifa_Servicios;
    }

    
}
