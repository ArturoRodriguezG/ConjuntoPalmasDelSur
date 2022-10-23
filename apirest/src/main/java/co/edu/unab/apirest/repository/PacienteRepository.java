package co.edu.unab.apirest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.apirest.model.PacienteModel;

@Repository
public interface PacienteRepository extends CrudRepository<PacienteModel,Integer>{
    
}
