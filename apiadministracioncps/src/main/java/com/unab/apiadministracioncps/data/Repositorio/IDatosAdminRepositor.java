package com.unab.apiadministracioncps.data.Repositorio;
import javax.persistence.Index;
import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.unab.apiadministracioncps.data.Entidades.DatosAdminEntidad;

@Repository
@Table(indexes = {
    @Index(columnList = "codigo", name= "codigo", unique= true)
})
public interface IDatosAdminRepositor  extends CrudRepository <DatosAdminEntidad, String> {

    public DatosAdminEntidad findByCodigo(String codigo);
    
}
