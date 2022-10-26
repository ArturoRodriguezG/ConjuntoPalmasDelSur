package com.example.apirest_admincps.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.apirest_admincps.Models.AdministradorModel;
@Repository
public interface AdministradorRepository extends CrudRepository<AdministradorModel, String>{
    
}  
