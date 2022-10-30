package com.unab.apiadministracioncps.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unab.apiadministracioncps.models.ConsulDatosModelo;
import com.unab.apiadministracioncps.models.ConsultaDatosModelsDTO;
import com.unab.apiadministracioncps.services.IconsultaDatosService;

@RestController
@RequestMapping ("/creaDatos")
public class ConsultaDatosController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IconsultaDatosService iconsultaDatosService;   

    @GetMapping
    public String recibeConsultaDatos(){
        return "Envio ARG-dos";
    }

    @PostMapping
    public ConsultaDatosModelsDTO enviaConsultaDatos(@RequestBody ConsulDatosModelo consulDatosModelo){
        ConsultaDatosModelsDTO consultaDatosModelsDTO= modelMapper.map(consulDatosModelo, ConsultaDatosModelsDTO.class);
        ConsultaDatosModelsDTO consultaDatosDtoCrea= iconsultaDatosService.creaDatos(consultaDatosModelsDTO);
        
        return consultaDatosDtoCrea;
    }
}
