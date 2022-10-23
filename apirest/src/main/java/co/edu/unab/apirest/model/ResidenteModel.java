package co.edu.unab.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor 
@AllArgsConstructor
@Getter
@Setter
@Table(name = "residente")
public class ResidenteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //campo AutoIncrementado
    private int idResidente;
    @Column(unique =true, nullable = false)
    private long CodigoResidente;
    @Column(unique =true, nullable = false)
    private String nombre;
    private String teleString;
    private String email;
    private String contraseña;   
}
