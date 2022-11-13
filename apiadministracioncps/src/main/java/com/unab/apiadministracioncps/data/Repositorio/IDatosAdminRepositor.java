package com.unab.apiadministracioncps.data.Repositorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.unab.apiadministracioncps.data.Entidades.DatosAdminEntidad;

@Repository
public interface IDatosAdminRepositor  extends CrudRepository <DatosAdminEntidad, String> {
    
}
