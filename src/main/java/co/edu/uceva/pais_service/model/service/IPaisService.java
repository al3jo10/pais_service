package co.edu.uceva.pais_service.model.service;

import co.edu.uceva.pais_service.model.entities.Pais;

import java.util.List;

public interface IPaisService {
     Pais save(Pais pais); //aca necesito que me retorne el pais para saber la primary key
     void delete(Pais pais);// aca no necesito que me retorne algo
     Pais update(Pais pais);
     List<Pais> findAll();
     Pais findById(Long id);//para buscar un pais por id
}
