package com.example.apirest_admincps.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest_admincps.Models.AdministradorModel;
import com.example.apirest_admincps.Repositories.AdministradorRepository;

@RestController
@RequestMapping(path = "/administradores")
public class AdministradorController {
    @Autowired
    AdministradorRepository administradorRepository;

    @GetMapping(path = "/all")
    public Iterable<AdministradorModel> getAllAdministradores(){
        return administradorRepository.findAll();
    }

    @PostMapping(path = "/guardar")
    public AdministradorModel saveAdministrador(@RequestBody AdministradorModel administrador){
        return administradorRepository.save(administrador);
    }

    @DeleteMapping(path = "/eliminar/{codigo}")
    public void deleteAdministrador(@PathVariable("codigo") String codigo){
        administradorRepository.deleteById(codigo);
    }
}



//@RestController //Con esta anotación que esto es un controlador de peticiones tipo Rest
