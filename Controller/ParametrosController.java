package com.example.apirest_admincps.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest_admincps.Models.ParametrosModel;
import com.example.apirest_admincps.Repositories.ParametrosRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/parametros")
public class ParametrosController {
    @Autowired
    ParametrosRepository parametrosRepository;

    @GetMapping(path = "/all")
    public Iterable<ParametrosModel> getAllParametros(){
        return parametrosRepository.findAll();
    }

    @PostMapping(path ="/guardar")
    public ParametrosModel saveParametros(@RequestBody ParametrosModel parametros) {        
        return parametrosRepository.save(parametros);
    }

    @DeleteMapping(path = "/eliminar/{tarifaAdministracion}")
    public void deleteParametros(@PathVariable("tarifaAdministracion") int tarifaAdministracion){
        parametrosRepository.deleteById(tarifaAdministracion);
    }
}
