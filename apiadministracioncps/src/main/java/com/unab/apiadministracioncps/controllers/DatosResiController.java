package com.unab.apiadministracioncps.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unab.apiadministracioncps.data.Dtos.DatosResiDto;
import com.unab.apiadministracioncps.models.peticiones.DatosResiModeloPost;
import com.unab.apiadministracioncps.models.respuesta.DatosResiModeloGet;
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
    public DatosResiModeloGet CreaDatos(@RequestBody DatosResiModeloPost datosResiModelo){
        DatosResiDto datosResiModelsDTO= modelMapper.map(datosResiModelo, DatosResiDto.class);
        DatosResiDto datosResiDtoCrear= iDatosResiService.creaDatos(datosResiModelsDTO);
        DatosResiModeloGet datosResiModeloGet= modelMapper.map(datosResiDtoCrear, DatosResiModeloGet.class)
        return datosResiModeloGet;
    }
}
