package com.unab.apiadministracioncps.data.Entidades;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//Entidad Tabla Parametros del Sistema-Tarifas
//Datos directos, no tiene mantenimiento
@Entity (name="parametros")
public class DatosParamEntidad implements Serializable{

    private static final long serialVersionUID= 1L;
    @Id
    @Column(nullable= false)
    private Integer id;
    @Column(nullable= false)
    private Integer tarifaAdmin;
    @Column(nullable= false)
    private Integer tarifaServicios;

    public Integer getTarifaAdmin() {
        return this.tarifaAdmin;
    }

    public void setTarifaAdmin(Integer tarifaAdmin) {
        this.tarifaAdmin = tarifaAdmin;
    }

    public Integer getTarifaServicios() {
        return this.tarifaServicios;
    }

    public void setTarifaServicios(Integer tarifaServicios) {
        this.tarifaServicios = tarifaServicios;
    }
    
}
