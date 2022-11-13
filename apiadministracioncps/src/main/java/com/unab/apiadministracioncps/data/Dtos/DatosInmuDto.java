package com.unab.apiadministracioncps.data.Dtos;
import java.io.Serializable;
import java.util.Date;

//Este objeto se de transferencia de datos entre la BD-logica-cliente ida-vuelta
public class DatosInmuDto implements Serializable{
    private static final long serialVersionUID= 1L;

    private String codigo;
    private String descripcion;
    private String idResidente;
    private boolean esTarifaAdmin;
    private Date fechaPago;
    private Integer valorPago;
    private Date fechaFactura;


    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdResidente() {
        return this.idResidente;
    }

    public void setIdResidente(String idResidente) {
        this.idResidente = idResidente;
    }

    public boolean isEsTarifaAdmin() {
        return this.esTarifaAdmin;
    }

    public boolean getEsTarifaAdmin() {
        return this.esTarifaAdmin;
    }

    public void setEsTarifaAdmin(boolean esTarifaAdmin) {
        this.esTarifaAdmin = esTarifaAdmin;
    }

    public Date getFechaPago() {
        return this.fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Integer getValorPago() {
        return this.valorPago;
    }

    public void setValorPago(Integer valorPago) {
        this.valorPago = valorPago;
    }

    public Date getFechaFactura() {
        return this.fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

}
