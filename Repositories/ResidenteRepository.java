package com.example.apirest_admincps.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.apirest_admincps.Models.ResidenteModel;
@Repository
public interface ResidenteRepository extends CrudRepository<ResidenteModel, String>{
    
}
