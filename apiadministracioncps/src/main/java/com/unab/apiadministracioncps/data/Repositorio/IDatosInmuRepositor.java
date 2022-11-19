package com.unab.apiadministracioncps.data.Repositorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.unab.apiadministracioncps.data.Entidades.DatosInmuEntidad;

@Repository
public interface IDatosInmuRepositor  extends CrudRepository <DatosInmuEntidad, String>  {
    
   //public DatosInmuEntidad findByCodigoDatosInmuEntidad(String codigo);
   //public DatosResiEntidad findByCodigoDatosResiEntidad(String codigo);
   //public DatosParamEntidad findByIdDatosParamEntidad(Integer id);
   
}
