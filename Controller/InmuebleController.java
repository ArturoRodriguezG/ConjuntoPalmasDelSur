package com.example.apirest_admincps.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest_admincps.Models.InmuebleModel;
import com.example.apirest_admincps.Repositories.InmuebleRepository;

@RestController
@RequestMapping(path = "/inmuebles")
public class InmuebleController {
    @Autowired
    InmuebleRepository inmuebleRepository;

    @GetMapping(path = "/all")
    public Iterable<InmuebleModel> getAllInmuebles(){
        return inmuebleRepository.findAll();
    }
    
    @PostMapping(path = "/guardar")
    public InmuebleModel saveInmueble(@RequestBody InmuebleModel inmueble){
        return inmuebleRepository.save(inmueble);
    }

    @DeleteMapping(path = "/eliminar/{codigo}")
    public void deleteInmueble(@PathVariable("codigo") String codigo){
        inmuebleRepository.deleteById(codigo);
    }
}
