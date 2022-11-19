package com.unab.apiadministracioncps.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.unab.apiadministracioncps.data.Dtos.DatosResiDto;
import com.unab.apiadministracioncps.models.peticiones.DatosResiModeloPost;
import com.unab.apiadministracioncps.models.respuesta.DatosResiModeloGet;
import com.unab.apiadministracioncps.services.IDatosResiService;


//inicioSesion

//componente que administra los procesos de CRUD
@RestController
@RequestMapping ("/datosResidente")
public class DatosResiController {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    IDatosResiService iDatosResiService;   
    
    @GetMapping
    public DatosResiModeloGet ConsultaDatos(){
        String codigoLog= "1234567890";
        DatosResiDto datosResiDto= iDatosResiService.obtenerDatos(codigoLog);
        DatosResiModeloGet datosResiModeloGet= modelMapper.map(datosResiDto, DatosResiModeloGet.class);
        return datosResiModeloGet;
    }

    @PutMapping
    public DatosResiModeloGet CreaDatos(@RequestBody DatosResiModeloPost datosResiModelo){
        DatosResiDto datosResiModelsDTO= modelMapper.map(datosResiModelo, DatosResiDto.class);
        DatosResiDto datosResiDtoCrear= iDatosResiService.creaDatos(datosResiModelsDTO);
        DatosResiModeloGet datosResiModeloGet= modelMapper.map(datosResiDtoCrear, DatosResiModeloGet.class);
        return datosResiModeloGet;
    }
}
