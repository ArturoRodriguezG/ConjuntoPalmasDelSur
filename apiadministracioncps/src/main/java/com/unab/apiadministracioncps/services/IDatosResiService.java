package com.unab.apiadministracioncps.services;

import java.util.List;

import com.unab.apiadministracioncps.models.DatosResiModelsDTO;

public interface IDatosResiService {

    List<DatosResiModelsDTO> obtenerDatos();
    DatosResiModelsDTO creaDatos(DatosResiModelsDTO datosResiModelsDTO);
    
}
