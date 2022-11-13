package com.unab.apiadministracioncps.services;
import java.util.List;
import com.unab.apiadministracioncps.data.Dtos.DatosResiDto;

public interface IDatosResiService {

    List<DatosResiDto> obtenerDatos();
    DatosResiDto creaDatos(DatosResiDto datosResiModelsDTO);
    
}
