package com.unab.apiadministracioncps.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unab.apiadministracioncps.models.DatosResiEntidad;

@Repository
public interface IDatosResiRepositor extends CrudRepository <DatosResiEntidad, String> {
    



}
