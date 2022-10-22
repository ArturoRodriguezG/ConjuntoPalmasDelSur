package com.example.apirest_admincps.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest_admincps.Models.ResidenteModel;
import com.example.apirest_admincps.Repositories.ResidenteRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/residentes")
public class ResidenteController {
    @Autowired
    ResidenteRepository residenteRepository;

    @GetMapping(path = "/all")
    public Iterable<ResidenteModel> getAllResidentes(){
        return residenteRepository.findAll();
    }

    @PostMapping(value="/guardar")
    public ResidenteModel saveResidente(@RequestBody ResidenteModel residente) {        
        return residenteRepository.save(residente);
    }
    
    @DeleteMapping(path = "/eliminar/{codigo}")
    public void deleteResidente(@PathVariable("codigo") String codigo){
        residenteRepository.deleteById(codigo);
    }
}


