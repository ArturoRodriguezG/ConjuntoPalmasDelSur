package com.unab.apiadministracioncps.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unab.apiadministracioncps.models.DatosResiModelo;
import com.unab.apiadministracioncps.models.DatosResiModelsDTO;
import com.unab.apiadministracioncps.services.IDatosResiService;

//componente que administra los procesos de CRUD
@RestController
@RequestMapping ("/datosResi")
public class DatosResiController {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    IDatosResiService iDatosResiService;   

    @GetMapping
    public String ConsultaDatos(){
        return "Envio datos ARG-3";
    }


    @PostMapping
    public DatosResiModelsDTO CreaDatos(@RequestBody DatosResiModelo datosResiModelo){
        DatosResiModelsDTO datosResiModelsDTO= modelMapper.map(datosResiModelo, DatosResiModelsDTO.class);
        DatosResiModelsDTO datosResiDtoCrear= iDatosResiService.creaDatos(datosResiModelsDTO);
        return datosResiDtoCrear;
    }
}
