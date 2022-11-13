package com.unab.apiadministracioncps.data.Entidades;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//Entidad Tabla Inmueble de los  Aptos del Conjunto
//Llenado directo, tabla sin mantenimiento
@Entity (name="inmueble")
public class DatosInmuEntidad implements Serializable{

    private static final long serialVersionUID= 1L;

    @Id
    @Column(nullable= false)
    private String codigo;
    @Column(nullable= false)
    private String descripcion;
    @Column(nullable= false)
    private String idResidente;
    @Column(nullable= false)
    private boolean esTarifaAdmin;
    @Column(nullable= false)
    private Date fechaPago;
    @Column(nullable= false)
    private Integer valorPago;
    @Column(nullable= false)
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
