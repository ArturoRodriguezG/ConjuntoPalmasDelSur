package com.unab.apiadministracioncps.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.apiadministracioncps.models.DatosResiEntidad;
import com.unab.apiadministracioncps.models.DatosResiModelsDTO;
import com.unab.apiadministracioncps.repositories.IDatosResiRepositor;

@Service
public class DatosResiService implements IDatosResiService{

    @Autowired
    ModelMapper modelMapper;
    @Autowired IDatosResiRepositor iDatosResiRepositor;

    @Override
    public List<DatosResiModelsDTO> obtenerDatos(){
        return null;
    }

    @Override
    public DatosResiModelsDTO creaDatos(DatosResiModelsDTO datosResiModelsDTO){

        DatosResiEntidad datosResiEntidad= modelMapper.map(datosResiModelsDTO, DatosResiEntidad.class);
        //aqui se realizan las operaciones o asignaciones boleanaspara envio
        DatosResiEntidad datosResiEntidadCreado= iDatosResiRepositor.save(datosResiEntidad);

        DatosResiModelsDTO datosResiModelsDTOCreado= modelMapper.map(datosResiEntidadCreado, DatosResiModelsDTO.class);
        return  datosResiModelsDTOCreado;
    }
}
