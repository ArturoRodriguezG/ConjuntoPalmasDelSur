package com.unab.apiadministracioncps.services;
import com.unab.apiadministracioncps.data.Dtos.DatosResiDto;

public interface IDatosResiService {

    DatosResiDto obtenerDatos(String codigo);
    DatosResiDto creaDatos(DatosResiDto datosResiModelsDTO);
    
}
