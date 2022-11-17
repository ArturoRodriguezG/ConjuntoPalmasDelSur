package com.unab.apiadministracioncps.data.Repositorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.unab.apiadministracioncps.data.Entidades.DatosResiEntidad;

@Repository
public interface IDatosResiRepositor extends CrudRepository <DatosResiEntidad, String> {

    DatosResiEntidad findByCodigo(String codigo);
}
