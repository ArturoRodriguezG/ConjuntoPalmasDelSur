package com.unab.apiadministracioncps.data.Entidades;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Entidad Tabla Inmueble de los  Aptos del Conjunto
//Llenado directo, tabla sin mantenimiento
@Entity (name="inmueble")
@Table(indexes = {
    @Index(columnList = "codigo", name= "codigo", unique= true)
})
// @Index(columnList = "id_residente", name= "id_residente", unique= false)

public class DatosInmuEntidad implements Serializable{

    private static final long serialVersionUID= 1L;

    @Id
    @Column(nullable= false)
    private String codigo;
    @Column(nullable= false)
    private String descripcion;
    @Column(nullable= false)
    private String id_residente;
    @Column(nullable= false)
    private boolean esTarifaAdmin;
    @Column(nullable= false)
    private Date fechaPago;
    @Column(nullable= false)
    private Integer valorPago;
    @Column(nullable= false)
    private Date fechaFactura;
    @Column(nullable= false)
    private Integer valorsaldo;

    @ManyToOne
    @JoinColumn(name = "id_residente", updatable = false, insertable = false)
    private DatosResiEntidad datosResiEntidad;

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

    public boolean isEsTarifaAdmin() {
        return this.esTarifaAdmin;
    }

    public boolean getEsTarifaAdmin() {
        return this.esTarifaAdmin;
    }

    public void setEsTarifaAdmin(boolean esTarifaAdmin) {
        this.esTarifaAdmin = esTarifaAdmin;
    }

    public String getId_residente() {
        return this.id_residente;
    }

    public void setId_residente(String id_residente) {
        this.id_residente = id_residente;
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

    public Integer getValorsaldo() {
        return this.valorsaldo;
    }

    public void setValorsaldo(Integer valorsaldo) {
        this.valorsaldo = valorsaldo;
    }


    public DatosResiEntidad getDatosResiEntidad() {
        return this.datosResiEntidad;
    }

    public void setDatosResiEntidad(DatosResiEntidad datosResiEntidad) {
        this.datosResiEntidad = datosResiEntidad;
    }

}        

  
