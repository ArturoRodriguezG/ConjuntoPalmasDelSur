package co.edu.unab.apirest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.apirest.model.PacienteModel;
import co.edu.unab.apirest.repository.PacienteRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/residente")
public class ResidenteController {
    @Autowired
    PacienteRepository ResidenteRepository;
    
    @GetMapping(path="/all")
    public Iterable<ResidenteModel> getAllResidentes(){
       return  ResidenteRepository.findAll();
    }

    @PostMapping(path = "/save")
    public ResidenteModel saveResidente(@RequestBody ResidenteteModel residente) {
        return ResidenteRepository.save(residente); //actualiza y crea dependiendo si el Id existe o no
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteResidenteById(@PathVariable("id") int id){
        residenteRepository.deleteById(id);
    }
    
}

