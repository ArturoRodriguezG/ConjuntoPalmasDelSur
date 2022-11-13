package com.unab.apiadministracioncps.data.Dtos;

import java.io.Serializable;

public class DatosParamDto  implements Serializable{

    private static final long serialVersionUID= 1L;
    private Integer id;
    private Integer tarifaAdmin;
    private Integer tarifaServicios;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
