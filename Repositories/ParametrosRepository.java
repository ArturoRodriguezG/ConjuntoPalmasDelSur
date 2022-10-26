package com.example.apirest_admincps.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.apirest_admincps.Models.ParametrosModel;
@Repository
public interface ParametrosRepository extends CrudRepository<ParametrosModel, Integer>{
    
}
