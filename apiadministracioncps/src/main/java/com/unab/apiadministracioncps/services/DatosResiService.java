package com.unab.apiadministracioncps.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unab.apiadministracioncps.data.Dtos.DatosResiDto;
import com.unab.apiadministracioncps.data.Entidades.DatosResiEntidad;
import com.unab.apiadministracioncps.data.Repositorio.IDatosResiRepositor;

@Service
public class DatosResiService implements IDatosResiService{

    @Autowired
    ModelMapper modelMapper;
    
    @Autowired 
    IDatosResiRepositor iDatosResiRepositor;

    @Override
    public DatosResiDto obtenerDatos(String codigo){
        DatosResiEntidad datosResiEntidad= iDatosResiRepositor.findByCodigo(codigo);
        if (datosResiEntidad==null){
            throw new RuntimeException("Error Datos No existen");
        } 
        DatosResiDto datosResiDto= modelMapper.map(datosResiEntidad, DatosResiDto.class);
        return datosResiDto;
    }

    @Override
    public DatosResiDto creaDatos(DatosResiDto datosResiModelsDTO){

        DatosResiEntidad datosResiEntidad= modelMapper.map(datosResiModelsDTO, DatosResiEntidad.class);
        
        //aqui se realizan las operaciones o asignaciones boleanaspara envio
        DatosResiEntidad datosResiEntidadCreado= iDatosResiRepositor.save(datosResiEntidad);

        DatosResiDto datosResiModelsDTOCreado= modelMapper.map(datosResiEntidadCreado, DatosResiDto.class);
        return  datosResiModelsDTOCreado;
    }


}
