package com.unab.apiadministracioncps.services;

import java.util.List;
import com.unab.apiadministracioncps.models.ConsultaDatosModelsDTO;

public interface IconsultaDatosService {

    List<ConsultaDatosModelsDTO> obtenerDatos();
    ConsultaDatosModelsDTO creaDatos(ConsultaDatosModelsDTO consultaDatosModelsDTO);
    
}
