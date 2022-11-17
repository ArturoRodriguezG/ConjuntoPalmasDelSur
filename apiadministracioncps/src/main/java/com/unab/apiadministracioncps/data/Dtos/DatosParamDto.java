package com.unab.apiadministracioncps.data.Dtos;

import java.io.Serializable;

public class DatosParamDto  implements Serializable{

    private static final long serialVersionUID= 1L;
    private Integer id;
    private Integer tarifa_Admin;
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
